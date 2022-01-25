import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.discount.DiscountCalculator;
import br.com.alura.store.taxCalculator.TaxCalculator;
import br.com.alura.store.taxes.ISS;

public class TaxTest {

	public static void main(String[] args) {
		Budget budget1 = new Budget();
		Budget budget2 = new Budget();
		budget1.addItem(new BudgetItem(new BigDecimal("20")));
		budget2.addItem(new BudgetItem(new BigDecimal("30")));
		
		DiscountCalculator discountCalculator = new DiscountCalculator();
		System.out.println(discountCalculator.calculate(budget1));
		System.out.println(discountCalculator.calculate(budget2));
		
		
		TaxCalculator taxCalculator = new TaxCalculator();
		System.out.println(taxCalculator.calculate(budget1, new ISS(null)));
		
	}

}
