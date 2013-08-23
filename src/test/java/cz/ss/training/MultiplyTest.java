package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {

	@Test
	public void canMultiplyTwoValues(){
		OperandStack operandStack = new OperandStack();
		operandStack.push(new BigDecimal(3));
		operandStack.push(new BigDecimal(7));

		MultiplyOperation  multiplyOperation = new MultiplyOperation();
		multiplyOperation.execute(operandStack);

		assertEquals(new BigDecimal(21), operandStack.peek());
	}
}
