package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class DiscountCalculator {
	
	public BigDecimal calculate(Budget budget) {
		Discount chainOfDiscounts = new BudgetDiscountMoreThanFiveItems(
				new BudgetDiscountMoreThanFiveHundred(
						new NoDiscount()));
		
		return chainOfDiscounts.calculate(budget);
	}
}
