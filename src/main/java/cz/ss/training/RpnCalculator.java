package cz.ss.training;

import java.math.BigDecimal;
import java.util.Stack;

public class RpnCalculator {

	private Stack<BigDecimal> stack = new Stack<BigDecimal>();

	public BigDecimal getAccumulator() {
		if(!stack.isEmpty()){
			return stack.peek();
		} else{
			return BigDecimal.ZERO;
		}

	}

	public void setAccumulator(BigDecimal accumulator) {
		if(!stack.isEmpty())
			stack.pop();
		stack.push(accumulator);

	}

	public void enter() {
		stack.push(getAccumulator());
	}

	public void drop() {
		if(!stack.isEmpty())
			stack.pop();
	}
}
