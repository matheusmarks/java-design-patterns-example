package br.com.alura.store.http;

import java.util.Map;
public class JavaHttp implements HttpAdapter{

	@Override
	public void post(String url, Map<String, Object> data) {
		
		try {
			/*URL apiUrl = new URL(url);
			URLConnection openConnection = apiUrl.openConnection();
			openConnection.connect();
			System.out.println(openConnection.getContent().toString());*/
			
		}catch(Exception e) {
			throw new RuntimeException("ERROR: " + e);
		}
		
		
	}

}
