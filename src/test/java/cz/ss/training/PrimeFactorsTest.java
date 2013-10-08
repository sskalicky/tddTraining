package cz.ss.training;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

	private BigDecimal value;
	private OperandStack stack;

	@Test
	public void Of1ShouldGiveEmptyStack(){
		givenAValueOf(1);
		whenCalculatingItsPrimeFactors();
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of2ShouldBe2(){
		givenAValueOf(2);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(2);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of3ShouldBe3(){
		givenAValueOf(3);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(3);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of4ShouldBe2And2(){
		givenAValueOf(4);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(2);
		and(2);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of5ShouldBe5(){
		givenAValueOf(5);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(5);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of6ShouldBe3And2(){
		givenAValueOf(6);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(3);
		and(2);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of8ShouldBeThree2s(){
		givenAValueOf(8);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(2);
		and(2);
		and(2);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of9ShouldBe3And3(){
		givenAValueOf(9);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(3);
		and(3);
		andTheResultShouldBeEmpty();
	}

	@Test
	public void Of1024ShouldBeTen2s(){
		givenAValueOf(1024);
		whenCalculatingItsPrimeFactors();
		thenTheResultShouldInclude(2);
		and(2);
		and(2);
		and(2);
		and(2);
		and(2);
		and(2);
		and(2);
		and(2);
		and(2);
		andTheResultShouldBeEmpty();
	}

	private void givenAValueOf(int i) {
		value = new BigDecimal(i);
	}

	private void whenCalculatingItsPrimeFactors() {
		stack = new OperandStack();
		stack.push(value);
		PrimeFactorOperation primeFactorOperation = new PrimeFactorOperation();

		primeFactorOperation.execute(stack);
	}

	private void andTheResultShouldBeEmpty() {
		assertEquals(0, stack.size());
	}

	private void and(int i) {
		thenTheResultShouldInclude(i);
	}

	private void thenTheResultShouldInclude(int i) {
		assertEquals(new BigDecimal(i), stack.peek());
		stack.pop();
	}
}
