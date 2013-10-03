package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperatorFactoryRegisteredOperatorsTest {
	private ShortNamedOperatorsMathOperatorFactory mathOperatorFactory;

	@Before
	public void init(){
		mathOperatorFactory = new ShortNamedOperatorsMathOperatorFactory();
	}

	@Test
	public void shouldBeAbleToFindAdd(){
		mathOperatorFactory.findOperationByOperatorName("+");
	}

	@Test
	public void shouldBeAbleToFindSubtract(){

		mathOperatorFactory.findOperationByOperatorName("-");
	}

	@Test
	public void shouldBeAbleToFindFactorial(){
		mathOperatorFactory.findOperationByOperatorName("!");
	}

	@Test(expected = NoSuchOperator.class)
	public void shouldThrowAnExceptionForUnknownOperator(){
		mathOperatorFactory.findOperationByOperatorName("unknownOperator");
	}

	@Test
	public void shouldBeAbleToFindMultiply(){
		mathOperatorFactory.findOperationByOperatorName("*");
	}

	@Test
	public void shouldBeAbleToFindDivide(){
		mathOperatorFactory.findOperationByOperatorName("/");
	}

	@Test
	public void shouldBeAbleToFindSum(){
		mathOperatorFactory.findOperationByOperatorName("sum");
	}
}
