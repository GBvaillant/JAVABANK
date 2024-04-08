package contas;

import cliente.Cliente;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public void deposita(double valor) {
		saldo += valor;
	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}

		else {
			System.out.println("Ocorreu um erro !!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Erro na transação !");
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}

	public double getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}
}
