package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(9);

		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matématica");
		disciplina2.setNota(8);

		aluno1.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(9.7);

		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(7);

		aluno1.getDisciplinas().add(disciplina4);

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
