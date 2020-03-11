package br.com.agencia.contaservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agencia.contaservice.domain.Conta;


public interface ContaRepository extends JpaRepository<Conta, Integer> {
		
	Conta findContaById(Integer contaid);
	Optional<Conta> findContaByAgenciaAndNumero(String agencia, String numero);
}
