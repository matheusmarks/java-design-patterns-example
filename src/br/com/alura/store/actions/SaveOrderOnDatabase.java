package br.com.alura.store.actions;

import br.com.alura.store.order.Order;

public class SaveOrderOnDatabase implements ActionAfterOrderCreation {
	
	public void executeAction(Order order) {
		System.out.println("Salvando pedido no banco de dados relacional");
	}
}
