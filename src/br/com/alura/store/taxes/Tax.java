package br.com.alura.store.taxes;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Tax {
	
	private Tax otherTax;
	
	public Tax(Tax otherTax) {
		this.otherTax = otherTax;
	}
	
	protected abstract BigDecimal performTaxCalculus(Budget budget); 

	public BigDecimal calculate(Budget budget) {
		BigDecimal taxValue = performTaxCalculus(budget);
		BigDecimal otherTaxValue = BigDecimal.ZERO;
		
		if(otherTax != null) {
			otherTaxValue = otherTax.performTaxCalculus(budget);
		}
		
		return taxValue.add(otherTaxValue);
	}
}
