package br.com.alura.store.budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatusStrategy{


	public BigDecimal calculateExtraDiscountValue(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finished(Budget budget) {
		budget.setStatus(new Finished());
	}
}
