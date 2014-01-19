package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

	@Test
	public void shouldBeAbleToFindPrimeFactors(){
		mathOperatorFactory.findOperationByOperatorName("primeFactors");
	}

	@Test
	public void addingSameOperatorNameFails(){
		mathOperatorFactory.addOperatorNamed("foo", new CompositeMathOperator());
		try{
			mathOperatorFactory.addOperatorNamed("foo", new CompositeMathOperator());
			fail("should have thrown exception");
		} catch(OperatorNameAlreadyUsed expected){

		}
	}
}
