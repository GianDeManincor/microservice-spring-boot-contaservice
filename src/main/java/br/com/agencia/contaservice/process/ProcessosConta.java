package br.com.agencia.contaservice.process;

import br.com.agencia.contaservice.domain.Conta;

public interface ProcessosConta {
	
	void depositar(Double valor);
	void sacar(Double valor);

}
