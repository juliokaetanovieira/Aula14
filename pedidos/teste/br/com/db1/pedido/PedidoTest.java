package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PedidoTest {
	
	private Pedido pedido;
	
	@Before
	public void init() {
		
		Cliente cliente = new Cliente("Julio Vieira", "07717964988", StatusCliente.ATIVO);		
		List<Produto> produto = new ArrayList<>();
		List<PedidoHistorico> historico = new ArrayList<>();		
		
		pedido = new Pedido("100", StatusPedido.ABERTO, cliente, produto, historico);	
		Produto produto1 = new Produto("100", "001", "Processador", 1200.0, StatusProduto.ATIVO);
		
	}
	
	@Test
	public void deveRetornarRelatorio1() {
		
		Assert.assertEquals("100", pedido.getNumero(), 0);
		
		
	}
	
	
	


}
