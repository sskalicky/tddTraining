package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorTest {

	@Test
	public void RpnCalculatorHas0InItsAccumulator(){
		RpnCalculator calculator = new RpnCalculator();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());

	}

}
