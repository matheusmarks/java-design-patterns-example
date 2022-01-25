package br.com.alura.store.order;

import java.math.BigDecimal;

public class GenerateOrder {
	
	private String client;
	private BigDecimal budgetValue;
	private int itemsQuantity;
	
	public GenerateOrder(String client, BigDecimal budgetValue, int itemsQuantity) {
		super();
		this.client = client;
		this.budgetValue = budgetValue;
		this.itemsQuantity = itemsQuantity;
	}

	public String getClient() {
		return client;
	}

	public BigDecimal getBudgetValue() {
		return budgetValue;
	}

	public int getItemsQuantity() {
		return itemsQuantity;
	}
	
	
	
}
