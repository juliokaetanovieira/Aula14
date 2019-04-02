package br.com.db1.pedido.domain;

import java.time.LocalDateTime;

import br.com.db1.pedido.infraestrutura.Checker;

public class PedidoHistorico {
	private LocalDateTime data;
	private StatusPedido status;
	
	public PedidoHistorico(StatusPedido status){
		Checker.naoNulo(status, "status");
		this.data = LocalDateTime.now();
		this.status = status;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public StatusPedido getStatus(){
		return this.status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}

}
