package br.com.db1.pedido;

public class PedidoItem {
	private Produto produto;
	private Double quantidade;
	private Double valor;

	public PedidoItem(Produto produto, Double quantidade, Double valor) {
		Checker.naoDeveSerNulo(produto, "produto");
		Checker.naoDeveSerNulo(quantidade, "quantidade");
		Checker.statusDeveSerAtivo(produto, "produto");

		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;

	}

	public Produto getProduto() {
		return this.produto;
	}

	public Double getQuantidade() {
		return this.quantidade;
	}

}
