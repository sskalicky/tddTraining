package cz.ss.training;

import java.math.BigDecimal;

public class AddOperation implements MathOperation {

	public void execute(OperandStack operandStack){
		BigDecimal rhs = operandStack.peek();;
		operandStack.pop();
		BigDecimal lhs = operandStack.peek();
		operandStack.replaceTop(lhs.add(rhs));
	}
}
