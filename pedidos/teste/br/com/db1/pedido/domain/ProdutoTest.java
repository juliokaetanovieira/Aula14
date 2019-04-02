package br.com.db1.pedido.domain;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void deveRetornarCodigoProdutoEObrigatorio() {
		try {
			new Produto(null, "Lapis", 4.0);
		} catch (Exception e) {
			Assert.assertEquals("Campo código do produto é obrigatório.", e.getMessage());
		}
	}
	
	@Test
	public void deveRetornarNomeProdutoEObrigatorio() {
		try {
			new Produto("100", null, 4.0);
		} catch (Exception e) {
			Assert.assertEquals("Campo nome do produto é obrigatório.", e.getMessage());
		}
	}
	
	@Test
	public void deveRetornarValorProdutoEObrigatorio() {
		try {
			new Produto("101", "Lapis", null);
		} catch (Exception e) {
			Assert.assertEquals("Campo valor do produto é obrigatório.", e.getMessage());
		}
	}
	
	@Test
	public void deveCriarUmProduto() {
		Produto produto = new Produto("101", "Lapis", 4.0);
		
		Assert.assertEquals("101", produto.getCodigo());
		Assert.assertEquals("Lapis", produto.getNome());
		Assert.assertEquals(4.0, produto.getValor(), 0);
		Assert.assertEquals(StatusProduto.ATIVO, produto.getStatus());
	}

}
