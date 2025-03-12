package atividades;

import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {

	private Map<String, Integer> contagemPalavra;
	
	public ContagemDePalavras() {
		contagemPalavra = new HashMap<>();
	}
	
	private void adicionarPalavra(String palavra, Integer contagem) {
		String palavraAchada = palavra;
		
		if(contagemPalavra.get(palavraAchada) != null) {
			contagem += contagemPalavra.get(palavra);
			contagemPalavra.put(palavra, contagem);
			System.out.println("a palavra teve sua contagem aumentada");
		} else {
			contagemPalavra.put(palavraAchada, contagem);
			System.out.println("uma palavra foi adicionada");
		}
	}
	
	private void removerPalavra(String palavra) {
		if(!contagemPalavra.isEmpty()) {
			contagemPalavra.remove(palavra);
			System.out.println("palavra removida");
		} else {
			System.out.println("a palavra nao existe");
		}
	}
	
	private void exibirPalavras() {
		if(!contagemPalavra.isEmpty()) {
			System.out.println(contagemPalavra);
		} else {
			System.out.println("nao existe palavras");
		}
	}
	
	private void encontrarPalavraMaisFrequente() {
		Integer contador = 0;
		
		for(Integer quantidade : contagemPalavra.values()) {
			if(quantidade > contador) {
				contador = quantidade;
				
			}
		}
		for(String palavra : contagemPalavra.keySet()) {
			if(contagemPalavra.get(palavra).equals(contador)) {
				System.out.println("palavra mais frenquente: " + palavra + " " + contador);
			}
		}
	}
	
	public static void main(String[] args) {
ContagemDePalavras contagem = new ContagemDePalavras();
        
        contagem.adicionarPalavra("exemplo", 1);
        contagem.adicionarPalavra("teste", 2);
        contagem.adicionarPalavra("exemplo", 1);
        
        contagem.exibirPalavras();
        
        contagem.encontrarPalavraMaisFrequente();
        
        contagem.removerPalavra("teste");
        
        contagem.exibirPalavras();
	}
}
