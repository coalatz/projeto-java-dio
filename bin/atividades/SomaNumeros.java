package atividades;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> listanumeros;
	
	public SomaNumeros() {
		listanumeros = new ArrayList<>();
	}
	
	private void adicionarNumero(int numero) {
		listanumeros.add(numero);
		System.out.println("numero adicionado " + numero);
	}
	
	private void calcularSoma() {
		Integer soma = 0;
		for(Integer numero : listanumeros) {
			soma += numero;
		}
		System.out.println("SOMA: " + soma);
	}
	
	private void encontrarMaiorNumero() {
		Integer numeroMaior = 0;
		for(Integer numero : listanumeros) {
			if(numero > numeroMaior) numeroMaior = numero;
		}
		System.out.println("numweo maior " + numeroMaior);
	}
	
	private void encontrarMenorNumero() {
		Integer numeroMenor = 1000000000;
		for(Integer numero : listanumeros) {
			if(numero < numeroMenor) numeroMenor = numero;
		}
		System.out.println("numero menor " + numeroMenor);
	}
	
	private void exibirNumeros() {
		for(Integer numero : listanumeros) {
			System.out.println(numero + " ");
		}
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
        
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(15);
        
        System.out.println("Números na lista:");
        somaNumeros.exibirNumeros();
        
        somaNumeros.calcularSoma();
        
        somaNumeros.encontrarMaiorNumero();
        
        somaNumeros.encontrarMenorNumero();
	}
}
