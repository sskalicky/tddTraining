package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ANewlyCreatedRpnCalculatorShould {
		RpnCalculator calculator;

	@Before
	public void init(){
		calculator = new RpnCalculator();

	}

	@Test
	public void have0InItsAccumulator(){
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());

	}

	@Test
	public void shouldAllowItsAccumulatorToBeSet(){
		BigDecimal value = new BigDecimal(42);
		calculator.setAccumulator(value);
		assertEquals(value, calculator.getAccumulator());
	}

}
