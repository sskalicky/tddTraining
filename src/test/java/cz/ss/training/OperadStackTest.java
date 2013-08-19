package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperadStackTest {
	OperandStack operandStack;


	@Before
	public void init(){
		operandStack = new OperandStack();
	}

	@Test
	public void isNeverEmpty(){
		assertEquals(BigDecimal.ZERO, operandStack.peek());

	}

	@Test
	public void canReplaceATopValue(){
		operandStack.replaceTop(BigDecimal.TEN);
		assertEquals(BigDecimal.TEN, operandStack.peek());
	}

	@Test
	public void canHaveValuesPushed(){
		operandStack.push(BigDecimal.ONE);
		assertEquals(BigDecimal.ONE, operandStack.peek());
	}

	@Test
	public void canRemoveATopValueByPop(){
		operandStack.replaceTop(new BigDecimal(19));
		operandStack.pop();
		assertEquals(BigDecimal.ZERO, operandStack.peek());
	}

	@Test
	public void popCanBeCalledWhenEmpty(){
		operandStack.pop();
	}

}
