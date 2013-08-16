package cz.ss.training;

import java.math.BigDecimal;

public class RpnCalculator {

	private BigDecimal accumulator = BigDecimal.ZERO;

	public BigDecimal getAccumulator() {
		return this.accumulator;
	}

	public void setAccumulator(BigDecimal accumulator) {
		this.accumulator = accumulator;
	}
}
