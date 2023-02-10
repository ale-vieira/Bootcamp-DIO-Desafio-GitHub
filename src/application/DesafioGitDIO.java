package application;

import java.util.Scanner;

public class DesafioGitDIO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite sua cidade: ");
		String cidade = sc.nextLine();
		
		System.out.println("Olá, meu nome é " + nome + ", e moro em " + cidade + ".");
		
		sc.close();
	}

}
