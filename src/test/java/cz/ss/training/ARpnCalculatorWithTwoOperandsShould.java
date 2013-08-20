package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ARpnCalculatorWithTwoOperandsShould {
	RpnCalculator calculator;

	@Before
	public void init(){
		calculator = new RpnCalculator();

		calculator.setAccumulator(new BigDecimal(3));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}

	@Test
	public void addTwoNumbersCorrectly(){
		calculator.execute("+");
		assertEquals(new BigDecimal(7), calculator.getAccumulator());
	}

	@Test
	public void subtractTwoNumbersCorrectly(){
		calculator.execute("-");
		assertEquals(new BigDecimal(-1), calculator.getAccumulator());
	}

}
