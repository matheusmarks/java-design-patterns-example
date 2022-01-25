package br.com.alura.store.budget;

import java.math.BigDecimal;

public class InAnalisys extends BudgetStatusStrategy {

	public BigDecimal calculateExtraDiscountValue(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	public void approve(Budget budget) {
		budget.setStatus(new Approved());
	}
	
	public void deny(Budget budget) {
		budget.setStatus(new Denied());
	}
}
