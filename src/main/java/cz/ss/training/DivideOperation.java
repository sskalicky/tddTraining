package cz.ss.training;

import java.math.BigDecimal;

public class DivideOperation extends BinaryMathOperation {
	@Override
	protected BigDecimal executeMathOperation(BigDecimal leftHandSide, BigDecimal rightHandSide) {
		return leftHandSide.divide(rightHandSide);
	}
}
