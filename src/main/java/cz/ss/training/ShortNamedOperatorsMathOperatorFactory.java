package cz.ss.training;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShortNamedOperatorsMathOperatorFactory implements MathOperatorFactory {

	private Map<String, MathOperation> operationByName;

	public ShortNamedOperatorsMathOperatorFactory() {
		operationByName = new ConcurrentHashMap<String, MathOperation>();
		registerOperations();
	}

	private void registerOperations() {
		operationByName.put("+", new AddOperation());
		operationByName.put("-", new SubtractOperation());
		operationByName.put("*", new MultiplyOperation());
		operationByName.put("/", new DivideOperation());
		operationByName.put("!", new FactorialOperation());
		operationByName.put("sum", new SumOperation());
	}

	public MathOperation findOperationByOperatorName(String operatorName) {
		MathOperation operation = operationByName.get(operatorName);
		if(operation == null)
			throw new NoSuchOperator();

		return operation;
	}
}
