package cz.ss.training;

public interface MathOperatorFactory {
	public MathOperation findOperationByOperatorName(String operatorName);
}
