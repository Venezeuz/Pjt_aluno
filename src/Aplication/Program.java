package Aplication;
import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Bem vindo a Escola.com");
		System.out.println();
		
		System.out.println("Pfvr digite o nome do aluno: ");
		aluno.nome =sc.nextLine();
		System.out.println("Pfvr digite a nota1: ");
		aluno.nota1 =sc.nextDouble();
		System.out.println("Pfvr digite a nota2: ");
		aluno.nota2 =sc.nextDouble();
		System.out.println("Pfvr digite a nota3: ");
		aluno.nota3 =sc.nextDouble();
		
		System.out.println();
		
		if (aluno.Total() >= 60  ) {
			System.out.println("NOTA FINAL: " + aluno.Total() + "\nARPOVADO");
			}
			else {
				System.out.println("NOTA FINAL: " + aluno.Total() + "\nREPROVADO\nFALTOU: " + aluno.Reprovado() + " PONTOS");
				}
		
		sc.close();
	}

}
