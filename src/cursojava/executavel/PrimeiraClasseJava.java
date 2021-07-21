package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // aqui será o João
		
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("04/07/1986");
		aluno1.setRegistroGeral("0988452789");
		aluno1.setNumeroCpf("048.821.987-85");
		aluno1.setNomeMae("Julieta M.M.");
		aluno1.setNomePai("Manuel A.S.");
		aluno1.setDataMatricula("01/07/2021");
		aluno1.setNomeEscola("JDev Treinamentos");
		aluno1.setSerieMatriculado("Java");
		
		System.out.println("Nome do aluno1 é: " + aluno1.getNome());
		System.out.println("Idade do aluno1 é: " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno1 é: " + aluno1.getDataNascimento());
		System.out.println("RG do aluno1 é: " + aluno1.getRegistroGeral());
		System.out.println("CPF do aluno1 é: " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe do aluno1 é: " + aluno1.getNomeMae());
		System.out.println("Nome do pai do aluno1 é: " + aluno1.getNomePai());
		System.out.println("Data de matricula do aluno1 é: " + aluno1.getDataMatricula());
		System.out.println("Nome da escola do aluno1 é: " + aluno1.getNomeEscola());
		System.out.println("serie do aluno1 é: " + aluno1.getSerieMatriculado());
		
		System.out.println("===================================================");
		/*===================================================================================*/
		
		Aluno aluno2 = new Aluno(); // aqui será o Pedro
		
		aluno2.setNome("Pedro dos Santos");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("20/12/1999");
		aluno2.setRegistroGeral("09181961689");
		aluno2.setNumeroCpf("048.865.198-02");
		aluno2.setNomeMae("Mainha");
		aluno2.setNomePai("Painho");
		aluno2.setDataMatricula("17/10/2008");
		aluno2.setNomeEscola("JDev Escola");
		aluno2.setSerieMatriculado("Java WEB");
		
		System.out.println("Nome do aluno2 é: " + aluno2.getNome());
		System.out.println("Idade do aluno2 é: " + aluno2.getIdade());
		System.out.println("Data de nascimento do aluno2 é: " + aluno2.getDataNascimento());
		System.out.println("RG do aluno2 é: " + aluno2.getRegistroGeral());
		System.out.println("CPF do aluno2 é: " + aluno2.getNumeroCpf());
		System.out.println("Nome da mãe do aluno2 é: " + aluno2.getNomeMae());
		System.out.println("Nome do pai do aluno2 é: " + aluno2.getNomePai());
		System.out.println("Data de matricula do aluno2 é: " + aluno2.getDataMatricula());
		System.out.println("Nome da escola do aluno2 é: " + aluno2.getNomeEscola());
		System.out.println("serie do aluno2 é: " + aluno2.getSerieMatriculado());
		
		System.out.println("===================================================");
		/*===================================================================================*/
		
		Aluno aluno3 = new Aluno();// aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		/*
		 * System.out.println("Nome do aluno5 é: " + aluno5.nome);
		 * System.out.println("Idade do aluno5 é: " + aluno5.idade);
		 * System.out.println("Nome do aluno4 é: " + aluno4.nome);
		 */
		
	}
}
