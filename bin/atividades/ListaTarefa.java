package atividades;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	
	private Set<Tarefa> listaDeTarefas;
	
	public ListaTarefa() {
		listaDeTarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		Tarefa tarefaAdicionar = new Tarefa(descricao, false);
		listaDeTarefas.add(tarefaAdicionar);
	}
	
	public void removerTarefa(String descricao) {
		for(Tarefa e : listaDeTarefas) {
			if(e.getDescricao().equals(descricao)) {
				listaDeTarefas.remove(e);
				System.out.println("tarefa removida");
				break;
			}
		}
	}
	
	public void exibirTarefas() {
		for(Tarefa e : listaDeTarefas) {
			System.out.println(e.getDescricao() + " " + e.isConcluida());
		}
	}
	
	public void contarTarefas() {
		System.out.println(listaDeTarefas.size());
	}
	
	public void obterTarefasConcluidas() {
		
		for(Tarefa e : listaDeTarefas) {
			if(e.isConcluida()) {
				System.out.println(e.getDescricao() + " " + e.isConcluida());
			}
		}
	}
	
	public void obterTarefasPendentes() {
		
		for(Tarefa e : listaDeTarefas) {
			if(!e.isConcluida()) {
				System.out.println(e.getDescricao() + " " + e.isConcluida());
			}
		}
	}
	
	public void marcarTarefaConcluida(String descricao) {
		
		for(Tarefa e : listaDeTarefas) {
			if(e.getDescricao().equals(descricao)) {
				e.setConcluida(true);
				System.out.println("tarefa concuida");
				break;
			}
		}
		
	}
	
	public void marcarTarefaPedente(String descricao) {
		
		for(Tarefa e : listaDeTarefas) {
			if(e.getDescricao().equals(descricao)) {
				e.setConcluida(false);
				System.out.println("tarefa pendente");
				break;
			}
		}
	}
	
	public void limparListaTarefas() {
		listaDeTarefas.clear();
		System.out.println("tarefas removidas");
	}
	
	public static void main(String[] args) {
	       ListaTarefa lista = new ListaTarefa();
	        
	       lista.adicionarTarefa("Comprar pão");
	        lista.adicionarTarefa("Estudar Java");
	        lista.adicionarTarefa("Ir ao mercado");
	        
	        System.out.println("Todas as Tarefas:");
	        lista.exibirTarefas();
	        
	        lista.contarTarefas();
	        
	        lista.marcarTarefaConcluida("Estudar Java");
	        
	        System.out.println("\nTarefas Concluídas:");
	        lista.obterTarefasConcluidas();
	        
	        System.out.println("\nTarefas Pendentes:");
	        lista.obterTarefasPendentes();
	        
	        lista.marcarTarefaPedente("Estudar Java");
	        
	        lista.removerTarefa("Comprar pão");
	        
	        System.out.println("\nTarefas Atualizadas:");
	        lista.exibirTarefas();
	        
	        lista.limparListaTarefas();
	        
	        System.out.println("\nLista após limpeza:");
	        lista.exibirTarefas();
	}
	
}
