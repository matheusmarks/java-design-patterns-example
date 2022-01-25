package br.com.alura.store.budget;

import java.util.HashMap;
import java.util.Map;
import br.com.alura.store.exception.DomainException;
import br.com.alura.store.http.HttpAdapter;

public class RegisterOrder {
	
	private HttpAdapter http;
	
	public RegisterOrder(HttpAdapter http) {
		this.http = http;
	}
	
	public void register(Budget budget) {
		if(!budget.isFinished()) {
			throw new DomainException("O orçamento não foi finalizado");
		}
		
		String apiUrl = "https://gorest.co.in/public/v1/users";
		Map<String, Object> data = new HashMap<String, Object>();
		
		data.put("value", budget.getValue());
		data.put("quantity", budget.getItemsQuantity());
		
		http.post(apiUrl, data);
	}
}
