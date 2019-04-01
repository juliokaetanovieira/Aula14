package br.com.db1.pedido;

public class PedidoItem {
	private Produto produto;
	private Double quantidade;
	private Double valor;
	
	public PedidoItem(Produto produto, Double quantidade, Double valor) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

}
