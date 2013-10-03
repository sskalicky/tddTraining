package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SumTest {

	@Test
	public void shouldBeAbleToSum(){
		OperandStack operandStack = new OperandStack();

		operandStack.push(new BigDecimal(3));
		operandStack.push(new BigDecimal(4));
		operandStack.push(new BigDecimal(5));

		new SumOperation().execute(operandStack);

		assertEquals(new BigDecimal(12), operandStack.peek());
	}

}

