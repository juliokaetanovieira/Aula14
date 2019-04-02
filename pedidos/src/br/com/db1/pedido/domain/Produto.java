package br.com.db1.pedido.domain;

import br.com.db1.pedido.infraestrutura.Checker;

public class Produto {
	private String codigo;
	private String nome;
	private Double valor;
	private StatusProduto statusprod;
	
	
	public Produto(String codigo, String nome, Double valor) {
		
		Checker.naoNulo(codigo, "código do produto");
		Checker.naoNulo(nome, "nome do produto");
		Checker.naoNulo(valor, "valor do produto");
		
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.statusprod = StatusProduto.ATIVO;
	}
	
	public void inativar(){
		if(StatusProduto.ATIVO.equals(this.statusprod)) {
			throw new RuntimeException("Produto está " + this.statusprod);
		}
		this.statusprod = StatusProduto.INATIVO;
	}
	
	public boolean isAtivo() {
		return StatusProduto.ATIVO.equals(this.statusprod);
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
	
	public StatusProduto getStatus() {
		return statusprod;
	}

}
