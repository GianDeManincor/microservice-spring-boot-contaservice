package br.com.agencia.contaservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.agencia.contaservice.process.ProcessosConta;

@Entity
@Table(name = "tb_conta")
public class Conta implements ProcessosConta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_conta")
	private Integer id;
	
	@Column(name = "agencia_conta")
	private String agencia;
	
	@Column(name = "numero_conta")
	private String numero;
	
	@Column(name = "saldo_conta")
	private Double saldo;
	
	public Conta() {
	}
	
	public Conta(String agencia, String numero, Double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	@Override
	public void depositar(Double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void sacar(Double valor) {
		this.saldo -= valor;
		
	}

	public Integer getId() {
		return id;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
}
