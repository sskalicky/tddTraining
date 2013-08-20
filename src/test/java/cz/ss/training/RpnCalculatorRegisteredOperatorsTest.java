package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorRegisteredOperatorsTest {
	private RpnCalculator calculator;
	BigDecimal value1;
	BigDecimal value2;

	@Before
	public void init(){
		value1 = new BigDecimal(5);
		value2 = new BigDecimal(4);

		calculator = new RpnCalculator();
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
	}

	@Test
	public void shouldBeAbleToAdd(){
		calculator.execute("+");
		assertEquals(new BigDecimal(9), calculator.getAccumulator());
	}

	@Test
	public void shouldBeAbleToSubtract(){
		calculator.execute("-");
		assertEquals(new BigDecimal(1), calculator.getAccumulator());
	}

	@Test
	public void shouldBeAbleToCalculateFactorial(){
		calculator.execute("!");
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}

	@Test(expected = NoSuchOperator.class)
	public void shouldThrowAnExceptionForUnknownOperator(){
		calculator.execute("unknownOperator");
	}
}
