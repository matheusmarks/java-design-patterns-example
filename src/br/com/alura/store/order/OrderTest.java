package br.com.alura.store.order;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.store.actions.SaveOrderOnDatabase;
import br.com.alura.store.actions.SendOrderEmail;

public class OrderTest {

	public static void main(String[] args) {
		String client = "Matheus";
		BigDecimal budgetValue = new BigDecimal("500");
		int itemsQuantity = Integer.parseInt("3");
		
		GenerateOrder go = new GenerateOrder(client, budgetValue, itemsQuantity);
		GenerateOrderHandler gh = new GenerateOrderHandler(
				Arrays.asList(
						new SaveOrderOnDatabase(),
						new SendOrderEmail(),
						new OrderLog()
						));
		gh.execute(go);
		
	}

}
