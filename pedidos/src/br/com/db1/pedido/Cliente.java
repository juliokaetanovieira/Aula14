package br.com.db1.pedido;

public class Cliente {
	
	private String nome;
	private String cpf;
	private StatusCliente statuscli;
	
	public Cliente(String nome, String cpf){
		
		Checker.naoDeveSerNulo(nome, "nome");
		Checker.cpfObrigatorio(cpf);
		Checker.cpfDeveTerOnzeChar(cpf);
		Checker.statusDeveSerAtivo(statuscli, "statuscli");		

		this.nome = nome;
		this.cpf = cpf;
		this.statuscli = StatusCliente.ATIVO;
		
	}
	
	public void  inativarCliente(){
		 this.statuscli = StatusCliente.INATIVO;
	}
	
	public boolean statusCliente(){
		if(statuscli == StatusCliente.ATIVO){
			return true;
		}
		return false;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	
}
