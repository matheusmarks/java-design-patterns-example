package br.com.alura.store.actions;

import br.com.alura.store.order.Order;

public interface ActionAfterOrderCreation {
	
	public void executeAction(Order order);
}
