package atividades;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int matricula;
	private double nota;
	
	public Aluno(String nome, int matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareTo(o.getNome()); 
	}
}
