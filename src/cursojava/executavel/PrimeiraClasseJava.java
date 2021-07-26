package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do aluno");
		/*
		 * String idade = JOptionPane.showInputDialog("Idade do aluno"); String
		 * nascimento = JOptionPane.showInputDialog("Data de nascimento do aluno");
		 * String rg = JOptionPane.showInputDialog("RG do aluno"); String cpf =
		 * JOptionPane.showInputDialog("CPF do aluno"); String mae =
		 * JOptionPane.showInputDialog("Mãe do aluno"); String pai =
		 * JOptionPane.showInputDialog("Pai do aluno"); String matricula =
		 * JOptionPane.showInputDialog("Data de matrícula do aluno"); String escola =
		 * JOptionPane.showInputDialog("Nome da escola do aluno"); String serie =
		 * JOptionPane.showInputDialog("Série do aluno");
		 */

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*
		 * aluno1.setIdade(Integer.valueOf(idade));
		 * aluno1.setDataNascimento(nascimento); aluno1.setRegistroGeral(rg);
		 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
		 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
		 * aluno1.setNomeEscola(escola);
		 */

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina deseja remover, 1, 2, 3, ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

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
