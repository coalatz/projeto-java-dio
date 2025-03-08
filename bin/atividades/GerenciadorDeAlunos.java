package atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GerenciadorDeAlunos {

	private Set<Aluno> gerenciadorAlunos;
	
	public GerenciadorDeAlunos() {
		gerenciadorAlunos = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, int matricula, double media) {
		Aluno alunoAdiciona = new Aluno(nome, matricula, media);
		gerenciadorAlunos.add(alunoAdiciona);
		System.out.println("aluno adicionado");
	}
	
	public void removerAluno(int matricula) {
		for(Aluno a : gerenciadorAlunos) {
			if(a.getMatricula() == matricula) {
				gerenciadorAlunos.remove(a);
				System.out.println("aluno removido");
				break;
			}
		}
	}
	
	public void exibirAlunos() {
		for(Aluno a : gerenciadorAlunos) {
			System.out.println(a.getNome() + " " + a.getMatricula() + " " + a.getNota());
		}
	}
	
	public void exibirAlunosPorNome() {
		List<Aluno> listaDeAlunos = new ArrayList<>(gerenciadorAlunos);
        Collections.sort(listaDeAlunos);

        System.out.println("Alunos ordenados por nome:");
        for (Aluno a : listaDeAlunos) {
            System.out.println(a.getNome() + " " + a.getMatricula() + " " + a.getNota());
        	}	
     }
	
	public void exibirAlunosPorNota() {
		OrdenarPorMatriucla ordenarMatriucla = new OrdenarPorMatriucla();
		List<Aluno> listaAlunos = new ArrayList<>(gerenciadorAlunos);
		Collections.sort(listaAlunos, ordenarMatriucla);
		
		 System.out.println("Alunos ordenados por matricula:");
	        for (Aluno a : listaAlunos) {
	            System.out.println(a.getNome() + " " + a.getMatricula() + " " + a.getNota());
	        	}	
	}
	
	public static void main(String[] args) {
		
		GerenciadorDeAlunos gerenciador = new GerenciadorDeAlunos();
		
		gerenciador.adicionarAluno("Carlos", 123, 8.5);
        gerenciador.adicionarAluno("Ana", 456, 9.0);
        gerenciador.adicionarAluno("Bruno", 789, 7.5);

        System.out.println("Lista de Alunos:");
        gerenciador.exibirAlunos();

        gerenciador.exibirAlunosPorNome();

        gerenciador.exibirAlunosPorNota();
    }
	
}
