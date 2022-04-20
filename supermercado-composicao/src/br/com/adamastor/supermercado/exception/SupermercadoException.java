package br.com.adamastor.supermercado.exception;

public class SupermercadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;	

	public SupermercadoException(String mensagemErro) {
		super(mensagemErro);
	}
}
