package br.com.agencia.contaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
public class ContaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaServiceApplication.class, args);
	}

}
