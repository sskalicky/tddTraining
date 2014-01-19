package cz.ss.training;

import java.util.LinkedList;
import java.util.List;

public class CompositeMathOperator implements MathOperation{

	List<MathOperation> operators = new LinkedList<MathOperation>();

	@Override
	public void execute(OperandStack operandStack) {
		for(MathOperation currentOperation: operators){
			currentOperation.execute(operandStack);
		}
	}

	public void append(MathOperation mathOperation) {
		operators.add(mathOperation);
	}
}
