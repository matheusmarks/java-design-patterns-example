package br.com.alura.store.actions;

import br.com.alura.store.order.Order;

public class SendOrderEmail implements ActionAfterOrderCreation {
	
	public void executeAction(Order order) {
		System.out.println("Enviando e-mail com dados do pedido");
	}
}
