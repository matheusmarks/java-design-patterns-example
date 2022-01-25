import java.math.BigDecimal;
import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.budget.BudgetProxy;

public class CompositionTest {

	public static void main(String[] args) {
		Budget oldOne = new Budget();
		oldOne.addItem(new BudgetItem(new BigDecimal("200")));
		oldOne.deny();
		
		Budget newOne = new Budget();
		newOne.addItem(new BudgetItem(new BigDecimal("500")));
		newOne.addItem(oldOne);
		
		BudgetItem newBudgetItem = new BudgetItem(new BigDecimal("1500"));
		
		BudgetProxy proxy  = new BudgetProxy(newOne);
		BudgetProxy proxy2  = new BudgetProxy(newBudgetItem);
		
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
		System.out.println(proxy2.getValue());
		System.out.println(proxy2.getValue());
		System.out.println(proxy2.getValue());
	}

}
