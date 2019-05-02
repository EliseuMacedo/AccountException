package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import models.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados da conta	");
		System.out.print("Numero: ");
		int numero = sc.nextInt();

		System.out.print("Titular: ");
		String titular = sc.nextLine();
		titular = sc.nextLine();

		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();

		System.out.print("Limite de saque: ");

		double limiteSaque = sc.nextDouble();

		System.out.println(numero);
		System.out.println(titular);
		System.out.println(saldo);
		System.out.println(limiteSaque);

		Account ac = new Account(numero, titular, saldo, limiteSaque);
		System.out.print("\nDigite o valor do saque: ");
		double quantia = sc.nextDouble();
		
		//onde iniciam as possibilidades de erro
		try {
			ac.saque(quantia);
			System.out.print("Saldo atualizado: " + String.format("%.2f", ac.getSaldo()));
		}
		catch (DomainException e) {
			System.out.println("Erro de saque: " + e.getMessage());
		}
		sc.close();
	}
}
