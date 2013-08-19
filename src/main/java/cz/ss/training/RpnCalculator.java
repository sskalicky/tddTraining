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
}
