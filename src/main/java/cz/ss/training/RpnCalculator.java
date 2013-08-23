package cz.ss.training;

import java.math.BigDecimal;

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

	public void execute(String operatorName) {
		MathOperation operation = findOperationByOperatorName(operatorName);
		operation.execute(operandStack);
	}

	private MathOperation findOperationByOperatorName(String operatorName) {
		MathOperation operation;
		if("+".equals(operatorName)){
			operation = new AddOperation();
		} else if ("-".equals(operatorName)){
			operation = new SubtractOperation();
		} else if ("!".equals(operatorName)){
			operation = new FactorialOperation();
		} else if ("*".equals(operatorName)) {
			operation = new MultiplyOperation();
		} else {
			throw new NoSuchOperator();
		}
		return operation;
	}
}
