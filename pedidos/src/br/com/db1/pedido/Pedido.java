package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String numero;
	private StatusPedido statusped = StatusPedido.ABERTO;
	private Cliente cliente;
	private List<Produto> itens = new ArrayList<>();
	private List<Historico> historico = new ArrayList<>();
	
	private void novohistorico(StatusPedido status){
		Historico historico = new Historico(status);
		this.historico.add(historico);
	}

	public Pedido(String numero, StatusPedido statusped, Cliente cliente, Produto produto){
		this.numero = numero;
		this.statusped = statusped;
		this.cliente = cliente;
		this.itens = (List<Produto>) produto;
		
	}
	
	


}
