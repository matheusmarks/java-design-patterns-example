package br.com.alura.store.budget;

import java.math.BigDecimal;

import br.com.alura.store.exception.DomainException;

public abstract class BudgetStatusStrategy {
	
	public BigDecimal calculateExtraDiscountValue(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	public void approve(Budget budget) {
		throw new DomainException("O or�amento n�o pode ser aprovado");
	}
	
	public void deny(Budget budget) {
		throw new DomainException("O or�amento n�o pode ser reprovado");
	}
	
	public void finished(Budget budget) {
		throw new DomainException("O or�amento n�o pode ser finalizado");
	}
}
