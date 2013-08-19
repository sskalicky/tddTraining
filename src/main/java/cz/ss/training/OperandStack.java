package cz.ss.training;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {
	private Stack<BigDecimal> stack = new Stack<BigDecimal>();

	public BigDecimal peek() {
		if(!stack.isEmpty()){
			return stack.peek();
		} else {
			return BigDecimal.ZERO;
		}
	}

	public void replaceTop(BigDecimal newTop) {
		pop();
		stack.push(newTop);
	}

	public void push(BigDecimal value) {
		stack.push(value);
	}

	public void pop() {
		if(!stack.isEmpty())
			stack.pop();
	}
}
