package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("Idade do aluno");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento do aluno");
		String rg = JOptionPane.showInputDialog("RG do aluno");
		String cpf = JOptionPane.showInputDialog("CPF do aluno");
		String mae = JOptionPane.showInputDialog("Mãe do aluno");
		String pai = JOptionPane.showInputDialog("Pai do aluno");
		String matricula = JOptionPane.showInputDialog("Data de matrícula do aluno");
		String escola = JOptionPane.showInputDialog("Nome da escola do aluno");
		String serie = JOptionPane.showInputDialog("Série do aluno");
		String note1 = JOptionPane.showInputDialog("Digite a nota 1");
		String note2 = JOptionPane.showInputDialog("Digite a nota 2");
		String note3 = JOptionPane.showInputDialog("Digite a nota 3");
		String note4 = JOptionPane.showInputDialog("Digite a nota 4");

		Aluno aluno1 = new Aluno(); // aqui sera o Joao

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(note1));
		aluno1.setNota2(Double.parseDouble(note2));
		aluno1.setNota3(Double.parseDouble(note3));
		aluno1.setNota4(Double.parseDouble(note4));

		System.out.println("===================================================");
		
		System.out.println(aluno1);
		System.out.println("média do Aluno " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		System.out.println("===================================================");
		/*
		 * =============================================================================
		 * ======
		 */

	}
}
