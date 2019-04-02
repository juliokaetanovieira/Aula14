package br.com.db1.pedido.domain;

import br.com.db1.pedido.infraestrutura.Checker;

public class Cliente {
	
	private String nome;
	private String cpf;
	private StatusCliente statuscli;
	
	public Cliente(String nome, String cpf){		
		Checker.naoNulo(nome, "nome do cliente");
		Checker.naoNulo(cpf, "CPF do cliente");
		Checker.cpfOnzeChar(cpf);
				

		this.nome = nome;
		this.cpf = cpf;
		this.statuscli = StatusCliente.ATIVO;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public StatusCliente getStatus() {
		return statuscli;
	}
	
	public boolean isAtivo() {
		return StatusCliente.ATIVO.equals(this.statuscli);
	}
	
	public void  inativarCliente(){
		 this.statuscli = StatusCliente.INATIVO;
	}
	

	

	
	
}
