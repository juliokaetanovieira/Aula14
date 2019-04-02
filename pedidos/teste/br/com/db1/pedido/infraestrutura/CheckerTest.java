package br.com.db1.pedido.infraestrutura;

import org.junit.Assert;
import org.junit.Test;

public class CheckerTest {
	
	@Test
	public void deveRetornarExceptionQuandoValorNulo() {
		try {
			Checker.naoNulo(null, "teste");
		} catch (Exception e) {
			Assert.assertEquals("Campo teste é obrigatório.", e.getMessage());
		}
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoValorNaoNulo() {
		Checker.naoNulo("Valor", "teste");
	}
	
	@Test
	public void deveRetornarExceptionQuandoCpfInvalido() {
		try {
			Checker.cpfOnzeChar("077");
		} catch (Exception e) {
			Assert.assertEquals("CPF 077 é inválido.", e.getMessage());
		}
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoCpfValido() {
		Checker.cpfOnzeChar("07717964988");
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorMenorQueZero() {
		try {
			Checker.maiorQueZero(-1.0, "teste");
		} catch (Exception e) {
			Assert.assertEquals("Campo teste deve ser maior que zero.", e.getMessage());
		}
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorIgualAZero() {
		try {
			Checker.maiorQueZero(0.0, "teste");
		} catch (Exception e) {
			Assert.assertEquals("Campo teste deve ser maior que zero", e.getMessage());
		}
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoValorMaiorQueZero() {
		Checker.maiorQueZero(10.0, "teste");
	}

}
