package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorNewOperatorRegistrationTest {
	@Test
	public void sumThenMultiply(){
		RpnCalculator calculator = new RpnCalculator();

		calculator.startProgram();
		calculator.addToProgram("+");
		calculator.addToProgram("*");
		calculator.saveProgramAs("SumThenMultiply");

		calculator.setAccumulator(new BigDecimal(4));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(3));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(-7));

		calculator.execute("SumThenMultiply");

		assertEquals(new BigDecimal(-16), calculator.getAccumulator());
	}
}
