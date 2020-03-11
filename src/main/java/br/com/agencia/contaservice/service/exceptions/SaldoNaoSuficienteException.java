package br.com.agencia.contaservice.service.exceptions;

public class SaldoNaoSuficienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public SaldoNaoSuficienteException(String msg) {
		super(msg);
	}
	
	public SaldoNaoSuficienteException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}