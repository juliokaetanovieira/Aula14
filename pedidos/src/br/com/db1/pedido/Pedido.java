package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String numero;
	private StatusPedido statusped = StatusPedido.ABERTO;
	private Cliente cliente;
	private List<Produto> itens = new ArrayList<>();
	private PedidoHistorico historico;

	public Pedido(String numero, Cliente cliente) {
		Checker.naoDeveSerNulo(cliente, "cliente");
		Checker.naoDeveSerNulo(numero, "numero");
		Checker.statusDeveSerAtivo(cliente, "cliente");
		
		
		this.numero = numero;
		this.statusped = StatusPedido.ABERTO;
		this.cliente = cliente;
		this.historico = historico;

	}
	
	public void addItem(){
		
	}
	
	public void removerItem(){
		Checker.statusDeveSerAtivo(produto, "produto");
		Checker.statusDeveSerAtivo(pedido, "pedido");
	}
	
	public void  faturar(){
		
	}
	
	public void cancelar(){
		
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

}
