package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o número da agência");
		int numAgencia = sc.nextInt();
		System.out.println("Por favor, digite o nome da agência");
		sc.nextLine();
		String nomeAgencia = sc.nextLine();
		System.out.println("Por favor, digite seu nome completo");
		String nome = sc.nextLine();
		System.out.println("Por favor digite seu saldo");
		float saldo = sc.nextFloat();
		String output = String.format("Olá, %s. obrigado por criar uma conta em nosso banco."
				+ "Sua agência é %s, conta %d e seu saldo é %.2f"
				, nome, nomeAgencia,numAgencia,saldo);
		System.out.println(output);
	}

}
