package br.com.alura.store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import br.com.alura.store.actions.ActionAfterOrderCreation;
import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;

public class GenerateOrderHandler {
	
	private List<ActionAfterOrderCreation> actionAfterOrderCreation;
	
	
	public GenerateOrderHandler(List<ActionAfterOrderCreation> actionAfterOrderCreation) {
		this.actionAfterOrderCreation = actionAfterOrderCreation;
	}

	public void execute(GenerateOrder data) {
		Budget budget = new Budget();
		budget.addItem(new BudgetItem(new BigDecimal(data.getItemsQuantity())));
		LocalDateTime localDate = LocalDateTime.now();
		
		Order order = new Order(data.getClient(), localDate, budget);
		
		this.actionAfterOrderCreation.forEach(action -> action.executeAction(order));
	}
}
