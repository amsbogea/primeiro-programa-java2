package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // aqui será o João
		
		Aluno aluno2 = new Aluno(); // aqui será o Pedro
		
		Aluno aluno3 = new Aluno();// aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		System.out.println("Nome do aluno5 é: " + aluno5.nome);
		System.out.println("Idade do aluno5 é: " + aluno5.idade);
		System.out.println("Nome do aluno4 é: " + aluno4.nome);
		
	}
}
