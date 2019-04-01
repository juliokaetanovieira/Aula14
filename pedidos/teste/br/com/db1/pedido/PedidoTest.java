package br.com.db1.pedido;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {
	
	private Pedido pedido;
	
	@Before
	public void init() {
		
		Cliente cliente = new Cliente("Julio Vieira", "07717964988", StatusCliente.ATIVO);
		Produto produto = new Produto("01", "Processador", 1200.0, StatusProduto.ATIVO);
		Pedido pedido = new Pedido("100", StatusPedido.ABERTO, cliente, produto);	
		
		
	}
	
	@Test
	public void deveTestarPedido() {
		
	}
	
	
	


}
