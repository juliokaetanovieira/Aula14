package br.com.db1.pedido;

import java.time.LocalDateTime;

public class PedidoHistorico {
	private LocalDateTime data;
	private StatusPedido status;
	
	public PedidoHistorico(StatusPedido status){
		this.data = LocalDateTime.now();
		this.status = status;
	}
	
	public StatusPedido getStatus(){
		return this.status;
	}	

}
