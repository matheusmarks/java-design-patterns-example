package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class BudgetDiscountMoreThanFiveItems extends Discount{
	
	public BudgetDiscountMoreThanFiveItems(Discount nextOne) {
		super(nextOne);
	}

	public BigDecimal performCalculations(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}
	
	@Override
	public boolean mustCalculate(Budget budget) {
		return budget.getItemsQuantity() > 5;
	}
}
