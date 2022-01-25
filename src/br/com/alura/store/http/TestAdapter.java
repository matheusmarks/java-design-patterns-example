package br.com.alura.store.http;

import java.math.BigDecimal;
import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.budget.RegisterOrder;

public class TestAdapter {
	
	public static void main(String[] args) {
		
		Budget budget = new Budget();
		budget.addItem(new BudgetItem(new BigDecimal("10")));
		budget.approve();
		budget.finish();
		
		RegisterOrder rb = new RegisterOrder(new JavaHttp());
		rb.register(budget);
	}
}
