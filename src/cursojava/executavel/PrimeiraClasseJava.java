package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(); // aqui sera o Joao

		aluno1.setNome("Joao da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("04/07/1986");
		aluno1.setRegistroGeral("0988452789");
		aluno1.setNumeroCpf("048.821.987-85");
		aluno1.setNomeMae("Julieta M.M.");
		aluno1.setNomePai("Manuel A.S.");
		aluno1.setDataMatricula("01/07/2021");
		aluno1.setNomeEscola("JDev Treinamentos");
		aluno1.setSerieMatriculado("Java");
		aluno1.setNota1(90.5);
		aluno1.setNota2(80.3);
		aluno1.setNota3(70.8);
		aluno1.setNota4(84.6);

		System.out.println("Nome do aluno1 : " + aluno1.getNome());
		System.out.println("Idade do aluno1 : " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno1 : " + aluno1.getDataNascimento());
		System.out.println("RG do aluno1 : " + aluno1.getRegistroGeral());
		System.out.println("CPF do aluno1 : " + aluno1.getNumeroCpf());
		System.out.println("Nome da mae do aluno1 : " + aluno1.getNomeMae());
		System.out.println("Nome do pai do aluno1 : " + aluno1.getNomePai());
		System.out.println("Data de matricula do aluno1 : " + aluno1.getDataMatricula());
		System.out.println("Nome da escola do aluno1 : " + aluno1.getNomeEscola());
		System.out.println("serie do aluno1 : " + aluno1.getSerieMatriculado());
		System.out.println("M�dia do aluno1 : " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 " + aluno1.getAlunoAprovado2());

		System.out.println("===================================================");
		/*
		 * =============================================================================
		 * ======
		 */

		Aluno aluno2 = new Aluno(); // aqui sera o Pedro

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
		aluno2.setNota1(60.5);
		aluno2.setNota2(50.3);
		aluno2.setNota3(70.8);
		aluno2.setNota4(64.6);

		System.out.println("Nome do aluno2 �: " + aluno2.getNome());
		System.out.println("Idade do aluno2 �: " + aluno2.getIdade());
		System.out.println("Data de nascimento do aluno2 �: " + aluno2.getDataNascimento());
		System.out.println("RG do aluno2 �: " + aluno2.getRegistroGeral());
		System.out.println("CPF do aluno2 �: " + aluno2.getNumeroCpf());
		System.out.println("Nome da mãe do aluno2 �: " + aluno2.getNomeMae());
		System.out.println("Nome do pai do aluno2 �: " + aluno2.getNomePai());
		System.out.println("Data de matricula do aluno2 �: " + aluno2.getDataMatricula());
		System.out.println("Nome da escola do aluno2 �: " + aluno2.getNomeEscola());
		System.out.println("serie do aluno2 �: " + aluno2.getSerieMatriculado());
		System.out.println("M�dia do aluno2 : " + aluno2.getMediaNota());
		System.out.println("Resultado = " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 " + aluno2.getAlunoAprovado2());

		System.out.println("===================================================");
		/*
		 * =============================================================================
		 * ======
		 */

		Aluno aluno3 = new Aluno();// aqui sera o Alex

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("Jos�", 50);

		/*
		 * System.out.println("Nome do aluno5 é: " + aluno5.nome);
		 * System.out.println("Idade do aluno5 é: " + aluno5.idade);
		 * System.out.println("Nome do aluno4 é: " + aluno4.nome);
		 */

	}
}
