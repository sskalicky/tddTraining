package cz.ss.training;

import java.math.BigDecimal;
import java.util.Stack;

public class RpnCalculator {

	private OperandStack operandStack = new OperandStack();

	public BigDecimal getAccumulator() {
		return operandStack.peek();
	}

	public void setAccumulator(BigDecimal accumulator) {
		operandStack.replaceTop(accumulator);
	}

	public void enter() {
		operandStack.push(getAccumulator());
	}

	public void drop() {
		operandStack.pop();
	}

	private void add() {
		BigDecimal rhs = getAccumulator();
		drop();
		BigDecimal lhs = getAccumulator();
		setAccumulator(lhs.add(rhs));
	}

	private void subtract() {
		BigDecimal rhs = getAccumulator();
		drop();
		BigDecimal lhs = getAccumulator();
		setAccumulator(lhs.subtract(rhs));
	}

	private void factorial() {
		BigDecimal result = BigDecimal.ONE;
		BigDecimal operand = getAccumulator();

		while(operand.compareTo(BigDecimal.ONE) > 0){
			result = result.multiply(operand);
			operand = operand.subtract(BigDecimal.ONE);
		}

		setAccumulator(result);
	}

	public void execute(String operatorName) {
		if("+".equals(operatorName)){
			add();
		} else if ("-".equals(operatorName)){
			subtract();
		} else if ("!".equals(operatorName)){
			factorial();
		} else {
			throw new NoSuchOperator();
		}
	}
}
