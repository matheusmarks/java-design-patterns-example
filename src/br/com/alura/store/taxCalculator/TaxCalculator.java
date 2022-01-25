package br.com.alura.store.taxCalculator;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.taxes.Tax;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, Tax taxType) {
		
		return taxType.calculate(budget);
		
	}
}
