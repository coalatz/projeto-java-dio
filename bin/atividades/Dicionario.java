package atividades;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionario;
	
	public Dicionario() {
		dicionario = new HashMap<>();
	}
	
	private void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
		System.out.println("palvra adicionada");
	}
	
	private void removerPalavra(String palavra) {
		String palavraRemove = dicionario.get(palavra);
		if(palavraRemove != null) {
			dicionario.remove(palavra);
			System.out.println("palavra removida");
		} else {
			System.out.println("palavra nao existe");
		}
	}
	
	private void pesquisarPorPalavra(String palavra) {
		if(!dicionario.isEmpty()) {			
			System.out.println(dicionario.get(palavra)); 
		} else {
			System.out.println("dicionario esta vazio");
		}
	}
	
	public static void main(String[] args) {
		Dicionario meuDicionario = new Dicionario();

        meuDicionario.adicionarPalavra("cachorro", "Um animal de quatro patas que late.");
        meuDicionario.adicionarPalavra("gato", "Um animal de quatro patas que mia.");

        System.out.print("Definição de 'cachorro': ");
        meuDicionario.pesquisarPorPalavra("cachorro");

        meuDicionario.removerPalavra("gato");

        System.out.print("Definição de 'gato': ");
        meuDicionario.pesquisarPorPalavra("gato");

        meuDicionario.removerPalavra("papagaio");
	}
}
