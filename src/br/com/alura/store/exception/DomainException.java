package br.com.alura.store.exception;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = -7034209305339877313L;
	
	public DomainException(String errorMessage) {
		super(errorMessage);
	}

}
