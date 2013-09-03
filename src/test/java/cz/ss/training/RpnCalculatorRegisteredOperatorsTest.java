package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorRegisteredOperatorsTest {
	private RpnCalculator calculator;

	@Before
	public void init(){
		calculator = new RpnCalculator();
	}

	@Test
	public void shouldBeAbleToExecuteAdd(){
		calculator.execute("+");
	}

	@Test
	public void shouldBeAbleToExecuteSubtract(){
		calculator.execute("-");
	}

	@Test
	public void shouldBeAbleToExecuteFactorial(){
		calculator.execute("!");
	}

	@Test(expected = NoSuchOperator.class)
	public void shouldThrowAnExceptionForUnknownOperator(){
		calculator.execute("unknownOperator");
	}

	@Test
	public void shouldBeAbleToExecuteMultiply(){
		calculator.execute("*");
	}
}
