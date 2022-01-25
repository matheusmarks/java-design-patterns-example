package br.com.alura.store.taxes;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.taxCalculator.TaxCalculator;

public class TaxTest {

	public static void main(String[] args) {
		Budget budget = new Budget();
		budget.addItem(new BudgetItem(new BigDecimal("100")));
		TaxCalculator taxCalculator = new TaxCalculator();
		
		System.out.println(taxCalculator.calculate(budget, new ISS(null)));
	}

}
