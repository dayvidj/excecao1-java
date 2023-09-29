package application;

import java.util.Scanner;


import entities.Conta;
import exceptions.OperacaoInvalidaException;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados da conta");

		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		Double saldo = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		Double limite = sc.nextDouble();

		Conta conta = new Conta(numero, titular, saldo, limite);
		
		System.out.print("\nValor para saque: ");
		Double valor = sc.nextDouble();

		try {
			conta.Sacar(valor);
			System.out.println("Saldo atual: "+ conta.getSaldo());
		}
		catch(OperacaoInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo Teste: "+conta.getSaldo());
		sc.close();
	}
}
