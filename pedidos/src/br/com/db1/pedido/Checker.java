package br.com.db1.pedido;

public class Checker {
	
	public static void naoDeveSerNulo(Object nome, String campo) {
		if(nome == null){
			throw new RuntimeException("O campo " + campo + " é obrigatório");
		}
	}
	
	public static void cpfObrigatorio(Object cpf) {
		if(cpf == null){
			throw new RuntimeException("Cpf é obrigatório");
		}		
	}
	
	public static void cpfDeveTerOnzeChar(String cpf) {
		if(cpf.length() != 11){
			throw new RuntimeException("CPF inválido");
		}		
				
	}
	
	public static void statusDeveSerAtivo(Object statuscli, String campo) {
		if(statuscli == null) {
			throw new RuntimeException("Status do Campo " + campo + " deve ser Ativo");
		}
	}
	
	public static void valorDeveSerMaiorQueZero(Double valor, String campo) {
		if(valor <= 0) {
			throw new RuntimeException("O valor do Campo " + campo + " deve ser maior que zero");
		}
	}

}
