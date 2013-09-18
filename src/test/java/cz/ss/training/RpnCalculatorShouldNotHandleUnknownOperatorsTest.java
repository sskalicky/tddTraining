package cz.ss.training;

import org.junit.Test;

public class RpnCalculatorShouldNotHandleUnknownOperatorsTest {
	private static class AlwaysFailingFactory implements MathOperatorFactory {

		@Override
		public MathOperation findOperationByOperatorName(String operatorName) {
			throw new NoSuchOperator();
		}
	}

	@Test(expected = NoSuchOperator.class)
	public void foo(){
		AlwaysFailingFactory alwaysFailingFactory = new AlwaysFailingFactory();
		RpnCalculator calculator = new RpnCalculator(alwaysFailingFactory);
		calculator.execute("+");
	}
}
