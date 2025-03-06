package atividades;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listaCompras;
	
	public CarrinhoDeCompras() {
		listaCompras = new ArrayList<>();
	}
	
	private void adicionarItem(String nome, double preco, int quantidade) {
		Item itemAdd = new Item(nome, preco, quantidade);
		
		listaCompras.add(itemAdd);
		
		System.out.println("item adicionado " + itemAdd.getNome());
	}
	
	private void removerItem(String nome) {
		
		for(Item r : listaCompras) {
			if(r.getNome().equals(nome)) {
				System.out.println("Item removido " + r.getNome());
				listaCompras.remove(r);
			}
		}
	}
	
	private void calcularValorTotal() {
		double valorTotal = 0;
		
		for(Item valor : listaCompras) {
			valorTotal += valor.getPreco();
		}
		
		System.out.println(valorTotal);
	}
	
	private void exibirItens() {
		for(Item i : listaCompras) {
			System.out.println(i.getNome() + " " + i.getPreco() + " " + i.getQuantidade());
		}
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem("Maçã", 2.50, 4);
        carrinho.adicionarItem("Banana", 1.20, 6);
        carrinho.exibirItens();
        
        carrinho.removerItem("Maçã");
        carrinho.exibirItens();
        
        carrinho.calcularValorTotal();
	}
}
