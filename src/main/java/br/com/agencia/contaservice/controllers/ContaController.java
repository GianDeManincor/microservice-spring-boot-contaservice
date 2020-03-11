package br.com.agencia.contaservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agencia.contaservice.domain.Conta;
import br.com.agencia.contaservice.service.ContaService;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {
	
	@Autowired
	ContaService contaService;
	
	@GetMapping(value = "/depositar/{valor}/{agencia}/{numero}")
	public Conta depositarValor(@PathVariable Double valor, @PathVariable String agencia, @PathVariable String numero) {
		Conta conta = new Conta();
		return conta;
	}
	
	@GetMapping(value = "/sacar/{valor}/{agencia}/{numero}")
	public ResponseEntity<?> sacarValor(@PathVariable Double valor, @PathVariable String agencia, @PathVariable String numero) {
		Object conta = contaService.sacar(valor, agencia, numero);
		return ResponseEntity.ok().body(conta);
	}
}
