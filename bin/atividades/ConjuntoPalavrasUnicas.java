package atividades;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		palavrasUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavrasUnicas.add(palavra);
		System.out.println("tentando adicionar palavra");
	}
	
	public void removerPalavra(String palavra) {
		for(String encontrada : palavrasUnicas) {
			if(encontrada.equals(palavra)) {
				palavrasUnicas.remove(encontrada);
				System.out.println("palavra removida");
				break;
			}
		}
	}
	
	public void verificarPalavra(String palavra) {
		for(String encontrada : palavrasUnicas) {
			if(encontrada.equals(palavra)) {
				System.out.println("a palavra esta presente no conjunto");
				break;
			} else {
				System.out.println("a palavra nao esta presente");
				break;
			}
		}
	}
	
	public void exibirPalavras() {
		for(String palavras : palavrasUnicas) {
			System.out.println(palavras);
		}
	}
	
	public static void main(String[] args) {
		
        	ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

		
		 	conjunto.adicionarPalavra("Java");
	        conjunto.adicionarPalavra("Python");
	        conjunto.adicionarPalavra("Java"); 

	        conjunto.exibirPalavras();

	        conjunto.verificarPalavra("Java");
	        conjunto.verificarPalavra("C++");

	        conjunto.removerPalavra("Python");
	        conjunto.removerPalavra("C++"); 
	        
	        conjunto.exibirPalavras();
	}
}
