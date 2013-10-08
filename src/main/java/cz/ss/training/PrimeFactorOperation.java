package cz.ss.training;

import java.math.BigDecimal;

public class PrimeFactorOperation implements MathOperation {

	public static final BigDecimal TWO = new BigDecimal(2);

	@Override
	public void execute(OperandStack operandStack) {
		BigDecimal value = operandStack.peek();
		operandStack.pop();

		BigDecimal divisor = TWO;
		while (value.compareTo(divisor) >= 0){
			while(value.remainder(divisor).equals(BigDecimal.ZERO)){
				operandStack.push(divisor);
				value = value.divide(divisor);
			}

			divisor = divisor.add(BigDecimal.ONE);
		}
	}
}
