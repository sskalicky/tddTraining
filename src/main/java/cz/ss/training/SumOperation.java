package cz.ss.training;

public class SumOperation implements MathOperation{

	public static final AddOperation ADD_OPERATION = new AddOperation();

	@Override
	public void execute(OperandStack operandStack) {
		while (operandStack.size() > 1){
			ADD_OPERATION.execute(operandStack);
		}
	}
}
