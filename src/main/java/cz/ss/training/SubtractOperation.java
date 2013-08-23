package cz.ss.training;

import java.math.BigDecimal;

public class SubtractOperation extends BinaryMathOperation {

	@Override
	protected BigDecimal executeMathOperation(BigDecimal leftHandSide, BigDecimal rightHandSide) {
		return leftHandSide.subtract(rightHandSide);
	}
}
