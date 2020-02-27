package curso_programacao;

import javax.swing.JOptionPane;

import curso_progamacaoAluno.Aluno;
import curso_progamacaoAluno.Disciplina;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Caixa de Perguntas 
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		String matricula = JOptionPane.showInputDialog("Qual a matricula do aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		
		//String nota1 = JOptionPane.showInputDialog("Qual a Primeira nota ");
		//String nota2 = JOptionPane.showInputDialog("Qual a Segunda nota");
		//String nota3 = JOptionPane.showInputDialog("Qual a Terceira nota");
		//String nota4 = JOptionPane.showInputDialog("Qual a Quarta nota");
		
		//String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina ? ");
		
		
		
		Aluno aluno1 = new Aluno();
		
		//Cria o objeto 
		//Disciplina disciplinabd = new Disciplina();
		//disciplinabd.setDisciplina("Banco de dados");
		//disciplinabd.setNota(90);
		
		// adiciona na lista; 
		//aluno1.getDisciplinas().add(disciplinabd);
		
		
		// fazer um integer tranformar string em inteiro 
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNome(nome);
		aluno1.setMatricula(matricula);
		
		// Receber a nota e as disciplinas 
		
		for (int pos = 1 ; pos <=4 ; pos ++ ) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " +pos+ " ? ");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " +pos+ " ? ");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		
		
		//transformar em um double de string 
		//aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		//aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		//aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		//aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
			 
		// Mudando para Tostring tem que fazer o metodo na classe aluno
		// usando sorce toString
		/*System.out.println("Nome do aluno é: " + aluno1.getNome());
		System.out.println("Idade do aluno: " + aluno1.getIdade());
		System.out.println("Matricula: " + aluno1.getMatricula());*/
		System.out.println(aluno1.toString());
		
		System.out.println("Nota do aluno = " + aluno1.getMediaAluno());
	}

}
