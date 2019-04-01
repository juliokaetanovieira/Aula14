package br.com.db1.pedido;

public class Produto {
	private String codigo;
	private String nome;
	private Double valor;
	private StatusProduto statusprod;
	
	
	public Produto(String codigo, String nome, Double valor, StatusProduto statusprod) {
		
		Checker.naoDeveSerNulo(codigo, "codigo");
		Checker.naoDeveSerNulo(nome, "nome");
		Checker.valorDeveSerMaiorQueZero(valor, "valor");
		
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.statusprod = StatusProduto.ATIVO;
	}
	
	public void inativarProduto(){
		this.statusprod = StatusProduto.INATIVO;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getValor() {
		return this.valor;
	}

}
