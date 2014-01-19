package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CompositeMathOperatorTest {

	@Test
	public void ItCanAddAndMultiply(){
		OperandStack operandStack = new OperandStack();

		operandStack.push(new BigDecimal(4));
		operandStack.push(new BigDecimal(3));
		operandStack.push(new BigDecimal(-7));

		CompositeMathOperator op = new CompositeMathOperator();
		op.append(new AddOperation());
		op.append(new MultiplyOperation());

		op.execute(operandStack);

		assertEquals(new BigDecimal(-16), operandStack.peek());

	}
}
