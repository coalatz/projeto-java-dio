package atividades;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer> numerosParaOrdenar;
	
	public OrdenacaoNumeros() {
		numerosParaOrdenar = new ArrayList<>();
	}

	public List<Integer> getNumerosParaOrdenar() {
		return numerosParaOrdenar;
	}

	public void setNumerosParaOrdenar(List<Integer> numerosParaOrdenar) {
		this.numerosParaOrdenar = numerosParaOrdenar;
	}
	
	
}
