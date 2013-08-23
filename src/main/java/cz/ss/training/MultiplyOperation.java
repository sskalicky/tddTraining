package cz.ss.training;

import java.math.BigDecimal;

public class MultiplyOperation extends BinaryMathOperation{
	@Override
	protected BigDecimal executeMathOperation(BigDecimal leftHandSide, BigDecimal rightHandSide) {
		return leftHandSide.multiply(rightHandSide);
	}
}
