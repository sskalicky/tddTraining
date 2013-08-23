package cz.ss.training;

import java.math.BigDecimal;

public abstract class BinaryMathOperation implements MathOperation {

	@Override
	public final void execute(OperandStack operandStack) {
		BigDecimal rhs = operandStack.peek();
		operandStack.pop();
		BigDecimal lhs = operandStack.peek();
		operandStack.replaceTop(executeMathOperation(lhs, rhs));
	}

	abstract protected BigDecimal executeMathOperation(BigDecimal leftHandSide, BigDecimal rightHandSide);
}
