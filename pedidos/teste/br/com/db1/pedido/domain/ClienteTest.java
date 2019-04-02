package br.com.db1.pedido.domain;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void deveRetornarNomeEObrigatorio() {
		try {
			new Cliente(null, "123");
		} catch (Exception e) {
			Assert.assertEquals("Campo nome do cliente é obrigatório.", e.getMessage());
		}
	}
	
	
	@Test
	public void deveRetornarCpfEObrigatorio() {
		try {
			new Cliente("Julio", null);
		} catch (Exception e) {
			Assert.assertEquals("Campo CPF do cliente é obrigatório.", e.getMessage());
		}
	}
	
	
	@Test
	public void deveRetornarCpfInvalido() {
		try {
			new Cliente("Julio", "003");
		} catch (Exception e) {
			Assert.assertEquals("CPF 013 é inválido.", e.getMessage());
		}
	}
	
	
	@Test
	public void deveCriarUmCliente() {
		Cliente cliente = new Cliente("Julio", "07717964988");
		
		Assert.assertEquals("Julio", cliente.getNome());
		Assert.assertEquals("07717964988", cliente.getCpf());
		Assert.assertEquals(StatusCliente.ATIVO, cliente.getStatus());
	}
	
	
	@Test
	public void deveRetornarClienteAtivo() {
		Cliente cliente = new Cliente("Julio", "07717964988");
		
		Assert.assertTrue(cliente.isAtivo());
	}

}
