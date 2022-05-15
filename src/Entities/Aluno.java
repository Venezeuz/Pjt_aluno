package Entities;

public class Aluno {
	public double nota1, nota2, nota3;
	public String nome;

	public double Total() {
		return nota1 + nota2 + nota3;
	}
	public double Reprovado() {
		return 100.00 - (nota1 + nota2 + nota3);
	}
	
}
