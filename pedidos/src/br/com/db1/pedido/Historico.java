package br.com.db1.pedido;

import java.time.LocalDateTime;

public class Historico {
	private LocalDateTime data;
	private StatusPedido status;
	
	public Historico(StatusPedido status){
		this.data = LocalDateTime.now();
		this.status = status;
	}

}
