package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private StatusPedido status = StatusPedido.ABERTO;
	private Cliente cliente;
	private List<Produto> itens = new ArrayList<>();
	private String numero;
	private List<Historico> historico = new ArrayList<>();
	
	private void novohistorico(StatusPedido status){
		Historico historico = new Historico(status);
		this.historico.add(historico);
	}

	public Pedido(StatusPedido status, Cliente cliente, List<Produto> itens, String numero){
		this.status = status;
		this.cliente = cliente;
		this.numero = numero;
	}
	

}
