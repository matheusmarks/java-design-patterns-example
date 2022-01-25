package br.com.alura.store.order;


import java.util.logging.Logger;

import br.com.alura.store.actions.ActionAfterOrderCreation;

public class OrderLog implements ActionAfterOrderCreation{
	
	static Logger log = Logger.getLogger(OrderLog.class.getName());

	@Override
	public void executeAction(Order order) {
		log.info("Order was initialized");
		
	}
	
}
