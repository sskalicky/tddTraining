package cz.ss.training;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class ABinaryMathOperationShould {

	BinaryMathOperation mockOp;
	OperandStack stackMock;

	@Before
	public void init(){
		mockOp = mock(BinaryMathOperation.class);
		stackMock = mock(OperandStack.class);
	}

	@Test
	public void acquireTwoParametersFromStack(){
		mockOp.execute(stackMock);

		verify(stackMock, times(2)).peek();
		verify(stackMock, times(1)).pop();
	}

	@Test
	public void executeExtensionPoint(){
		BigDecimal lhs = new BigDecimal(9);
		BigDecimal rhs = new BigDecimal(-4);

		when(stackMock.peek()).thenReturn(rhs).thenReturn(lhs);
		mockOp.execute(stackMock);

		verify(mockOp, times(1)).executeMathOperation(lhs, rhs);

	}

	@Test
	public void reduceStackSizeByOne(){
		OperandStack stack = new OperandStack();
		stack.push(BigDecimal.ONE);
		stack.push(BigDecimal.ONE);
		mockOp.execute(stack);

		assertEquals(1, stack.size());
	}

	@Test
	public void storeResultsOnStack(){
		when(mockOp.executeMathOperation(any(BigDecimal.class), any(BigDecimal.class))).thenReturn(BigDecimal.TEN);
		mockOp.execute(stackMock);

		verify(stackMock, times(1)).replaceTop(BigDecimal.TEN);
	}
}
