package br.com.alura.store.budget;


public class Denied extends BudgetStatusStrategy {

	@Override
	public void finished(Budget budget) {
		budget.setStatus(new Finished());
	}
}
