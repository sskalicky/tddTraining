package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorTest {

	@Test
	public void rpnCalculatorHas0InItsAccumulator(){
		RpnCalculator calculator = new RpnCalculator();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());

	}

	@Test
	public void newCalculatorShouldAllowItsAccumulatorToBeSet(){
		BigDecimal value = new BigDecimal(42);
		RpnCalculator calculator = new RpnCalculator();
		calculator.setAccumulator(value);
		assertEquals(value, calculator.getAccumulator());
	}

}
