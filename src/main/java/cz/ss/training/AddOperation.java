package cz.ss.training;

import java.math.BigDecimal;

public class AddOperation extends BinaryMathOperation {

	@Override
	protected BigDecimal executeMathOperation(BigDecimal leftHandSide, BigDecimal rightHandSide) {
		return leftHandSide.add(rightHandSide);
	}
}
