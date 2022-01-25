package br.com.alura.store.order;

import java.time.LocalDateTime;

import br.com.alura.store.budget.Budget;

public class Order {
	
	private String clientName;
	private LocalDateTime date;
	private Budget budget;
	
	public Order(String clientName, LocalDateTime date, Budget budget) {
		super();
		this.clientName = clientName;
		this.date = date;
		this.budget = budget;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}
}
