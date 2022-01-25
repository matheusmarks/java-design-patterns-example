package br.com.alura.store.taxes;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class ISS extends Tax {

	public ISS(Tax otherTax) {
		super(otherTax);
	}

	@Override
	protected BigDecimal performTaxCalculus(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.06"));
	}

}
