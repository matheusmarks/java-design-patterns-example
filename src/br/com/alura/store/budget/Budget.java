package br.com.alura.store.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {
	
	private BigDecimal value;
	private BudgetStatusStrategy status;
	private List<Budgetable> budgetItems;
	
	public Budget() {
		this.value = BigDecimal.ZERO;
		this.budgetItems = new ArrayList<Budgetable>();
		this.status = new InAnalisys();
	}

	public void applyExtraDiscount() {
		BigDecimal extraDiscountValue = BigDecimal.ZERO;
		
		extraDiscountValue = this.status.calculateExtraDiscountValue(this);
		
		this.value = this.value.subtract(extraDiscountValue);
		
	}
	
	public void approve() {
		this.status.approve(this);
	}
	
	public void deny() {
		this.status.deny(this);
	}
	
	public void finish() {
		this.status.finished(this);
	}
	
	public BigDecimal getValue() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return value;
	}
	
	public Integer getItemsQuantity() {
		return this.budgetItems.size();
	}
	
	public BudgetStatusStrategy getStatus() {
		return status;
	}

	public void setStatus(BudgetStatusStrategy status) {
		this.status = status;
	}
	
	public boolean isFinished() {
		return this.status instanceof Finished;
	}
	
	public void addItem(Budgetable item) {
		this.value = value.add(item.getValue());
		this.budgetItems.add(item);
	}

}
