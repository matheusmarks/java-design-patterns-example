package br.com.alura.store.taxes;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class ICMS extends Tax {
	
	public ICMS(Tax otherTax) {
		super(otherTax);
	}

	public BigDecimal performTaxCalculus(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}
}
