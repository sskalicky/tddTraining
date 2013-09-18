package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class DivideTest {

	@Test
	public void shouldBeAbleToDivide(){
		OperandStack operandStack = new OperandStack();
		operandStack.push(new BigDecimal(12));
		operandStack.push(new BigDecimal(2));

		DivideOperation divideOperation = new DivideOperation();
		divideOperation.execute(operandStack);

		assertEquals(new BigDecimal(6), operandStack.peek());
	}
}
