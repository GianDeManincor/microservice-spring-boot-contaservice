package br.com.agencia.contaservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agencia.contaservice.domain.Conta;
import br.com.agencia.contaservice.repositories.ContaRepository;
import br.com.agencia.contaservice.service.exceptions.ObjectNotFoundException;
import br.com.agencia.contaservice.service.exceptions.SaldoNaoSuficienteException;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepo;
	
	public Object sacar(Double valor, String agencia, String numero) {
		Optional<Conta> conta = contaRepo.findContaByAgenciaAndNumero(agencia, numero);
		if(conta != null && conta.isPresent()) {
			if(valor > conta.get().getSaldo()) {
				conta.filter(c -> conta.get().getSaldo() > valor)
				.orElseThrow(() -> new SaldoNaoSuficienteException(
						"Saldo insuficiente! Seu saldo é de: " + conta.get().getSaldo()));
			}
			conta.get().sacar(valor);
		}
		return conta.orElseThrow(() -> new ObjectNotFoundException("A conta não foi encontrada! AGENCIA: " + agencia + ", NUMERO: " + numero));
	}
}
