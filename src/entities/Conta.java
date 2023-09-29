package entities;

import exceptions.OperacaoInvalidaException;


public class Conta {
	private int numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}
	public Conta(int numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
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
	
	public void deposoitar(Double valor) {
		this.saldo += valor;
	}
	public void Sacar(Double valor) throws OperacaoInvalidaException {
		if(valor > this.getSaldo()) {
			throw new OperacaoInvalidaException("Erro de operação: Saldo insuficiente");
		} 
		else if(valor > this.getLimiteSaque()) {
			throw new OperacaoInvalidaException("Erro de operação: O valor excede o limite de saque");
		}
		else {
			this.saldo -= valor;			
		}
	}
}
