package cz.ss.training;

import java.math.BigDecimal;

public class RpnCalculator {

	private OperandStack operandStack = new OperandStack();
	private MathOperatorFactory factory;

	public RpnCalculator() {
		this(new ShortNamedOperatorsMathOperatorFactory());
	}

	public RpnCalculator(MathOperatorFactory factory) {
		this.factory = factory;
	}

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
		return factory.findOperationByOperatorName(operatorName);
	}
}
