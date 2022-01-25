package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class NoDiscount extends Discount{

	public NoDiscount() {
		super(null);
		
	}
	
	@Override
	public BigDecimal performCalculations(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	@Override
	public boolean mustCalculate(Budget budget) {
		return true;
	}

}
