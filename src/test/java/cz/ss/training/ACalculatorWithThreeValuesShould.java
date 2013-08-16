package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ACalculatorWithThreeValuesShould {

	private RpnCalculator calculator;
	BigDecimal value1;
	BigDecimal value2;
	BigDecimal value3;

	@Before
	public void init(){
		value1 = new BigDecimal(1);
		value2 = new BigDecimal(2);
		value3 = new BigDecimal(3);

		calculator = new RpnCalculator();
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}

	@Test
	public void haveTheLastValueEnteredInItsAccumulator(){
		assertEquals(value3, calculator.getAccumulator());
	}

	@Test
	public void haveTheSecondToLastValueInItsAccumulatorAfterASingleDrop(){
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
	}

	@Test
	public void haveTheFirstValueInItsAccumulatorAfterTwoDrops(){
		calculator.drop();
		calculator.drop();
		assertEquals(value1, calculator.getAccumulator());
	}

	@Test
	public void have0InItsAccumulatorAfterThreeDrops(){
		calculator.drop();
		calculator.drop();
		calculator.drop();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}
}
