package application;

import java.util.Scanner;

public class DesafioGitDIO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Olá, meu nome é " + nome + ", e tenho " + idade + " anos.");
		
		sc.close();
	}

}
