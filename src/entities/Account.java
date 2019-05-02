package entities;

import models.exception.DomainException;

public class Account {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Account() {
	}

	// metodo construtor
	public Account(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	// Get and Set
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void saque(double quantia) {

		if (limiteSaque < quantia) {
			//lança a exceção / "corta" o método
			throw new DomainException("Valor acima do limite de saque");
		}
		if(saldo<quantia) {
			//lança a exceção / "corta" o método
			throw new DomainException("Saldo insuficiente");
		}
		saldo -= quantia;
	}
}
