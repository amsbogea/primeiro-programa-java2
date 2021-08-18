package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 1; qtd ++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Idade do aluno"); String
			 * nascimento = JOptionPane.showInputDialog("Data de nascimento do aluno");
			 * String rg = JOptionPane.showInputDialog("RG do aluno"); String cpf =
			 * JOptionPane.showInputDialog("CPF do aluno"); String mae =
			 * JOptionPane.showInputDialog("Mae do aluno"); String pai =
			 * JOptionPane.showInputDialog("Pai do aluno"); String matricula =
			 * JOptionPane.showInputDialog("Data de matricula do aluno"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola do aluno"); String serie =
			 * JOptionPane.showInputDialog("Serie do aluno");
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

			if (escolha == 0) {/* opcao SIM eh ZERO */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual a disciplina deseja remover, 1, 2, 3, ou 4 ?");
					posicao++;
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
				}
			}
			alunos.add(aluno1);
		}
		
		for (int pos = 0; pos < alunos.size(); pos ++) {
			Aluno aluno = alunos.get(pos);
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = "+ aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------------");
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++) {
				
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("O nome da disciplina é = " + disc.getDisciplina() + " a nota de disciplina é = " + disc.getNota() );
			}
		}
	}
}
