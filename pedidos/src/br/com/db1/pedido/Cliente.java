package br.com.db1.pedido;

public class Cliente {
	
	private String nome;
	private String cpf;
	private StatusCliente statuscli;
	
	public Cliente(String nome, String cpf, StatusCliente statuscli){
		
		Checker.nomeObrigatorio(nome);
		Checker.cpfObrigatorio(cpf);
		Checker.cpfDeveTerOnzeChar(cpf);
		Checker.statusClienteDeveSerAtivo(statuscli);		

		this.nome = nome;
		this.cpf = cpf;
		this.statuscli = statuscli;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	
}
