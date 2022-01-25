package br.com.alura.store.budget;

import java.math.BigDecimal;

public interface StatusStrategy {
	
	public BigDecimal discountPercentage(Budget budget);
}
