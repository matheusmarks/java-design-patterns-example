package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Discount {
	
	protected Discount nextOne;
	
	public Discount(Discount nextOne) {
		this.nextOne = nextOne;
	}
	
	public BigDecimal calculate(Budget budget) {
		if(mustCalculate(budget)) {
			return performCalculations(budget);
		}
		
		return nextOne.calculate(budget);
	}
	
	protected abstract BigDecimal performCalculations(Budget budget);
	protected abstract boolean mustCalculate(Budget budget);
}
