package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ARpnCalculatorFactorialTest {
	RpnCalculator calculator;

	@Before
	public void init(){
		calculator = new RpnCalculator();
	}

	@Test
	public void factorialOf0is1(){
		calculator.setAccumulator(BigDecimal.ZERO);
		calculator.execute("!");
		assertEquals(BigDecimal.ONE, calculator.getAccumulator());
	}

	@Test
	public void factorialOf5is120(){
		calculator.setAccumulator(new BigDecimal(5));
		calculator.execute("!");
		assertEquals(new BigDecimal(120), calculator.getAccumulator());
	}
}
