package cz.ss.training;

import java.math.BigDecimal;

public class RpnCalculator {

	private OperandStack operandStack = new OperandStack();
	private MathOperatorFactory factory;
	private CompositeMathOperator currentProgram;

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

	public void startProgram() {
		currentProgram = new CompositeMathOperator();
	}

	public void addToProgram(String operatorName) {
		MathOperation operation = findOperationByOperatorName(operatorName);
		currentProgram.append(operation);
	}

	public void saveProgramAs(String operationName) {
		factory.addOperatorNamed(operationName, currentProgram);


	}
}
