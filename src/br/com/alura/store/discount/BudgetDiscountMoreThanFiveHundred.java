package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class BudgetDiscountMoreThanFiveHundred extends Discount{
	
	public BudgetDiscountMoreThanFiveHundred(Discount nextOne) {
		super(nextOne);
	}

	public BigDecimal performCalculations(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public boolean mustCalculate(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) > 0;
	}
}
