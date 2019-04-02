package br.com.db1.pedido.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.db1.pedido.infraestrutura.Checker;

public class Pedido {
	private static final int QUANTIDADE_MAXIMA_ITENS = 10;
	private String codigo;
	private StatusPedido statusped;
	private LocalDateTime data;
	private Cliente cliente;
	private List<PedidoHistorico> historicos = new ArrayList<>();
	private List<PedidoItem> itens = new ArrayList<>();
	

	public Pedido(String codigo, Cliente cliente) {
		Checker.naoNulo(codigo, "código");
		Checker.naoNulo(cliente, "cliente");
		this.verificarClienteAtivo();
		
		
		this.codigo = codigo;
		this.cliente = cliente;
		this.novoHistoricoStatus();

	}
	
	public void addItem(Produto produto, Double quantidade){
		this.verificarStatusPedidoParaAlterar();
		
		if(this.itens.size() == QUANTIDADE_MAXIMA_ITENS) {
			throw new RuntimeException("Quantidade máxima de itens excedida: " + QUANTIDADE_MAXIMA_ITENS);
		}
		
		this.itens.add(new PedidoItem(produto, quantidade));
	}
	

	public void removerItem(Produto produto){
		this.verificarStatusPedidoParaAlterar();
		this.itens.removeIf(item -> item.getProduto().getCodigo().equals(produto.getCodigo()));
	}
	
	public void  faturar(){
		if(!StatusPedido.ABERTO.equals(this.statusped)) {
			throw new RuntimeException("Pedido está " + this.statusped);
		}
		
		if(this.itens.size() == 0 || this.itens.size() > QUANTIDADE_MAXIMA_ITENS) {
			throw new RuntimeException("Pedido deve ter no minímo 1 item e no máximo 10 itens. Quantidade atual: " + this.itens.size());
		}
		
		this.verificarClienteAtivo();
		
		this.statusped = StatusPedido.FATURADO;
		this.novoHistoricoStatus();
	}
	
	public void cancelar(){
		this.verificarStatusPedidoParaAlterar();
		this.statusped = StatusPedido.CANCELADO;
		this.novoHistoricoStatus();
	}

	public void reabrir(){
		if(!StatusPedido.CANCELADO.equals(this.statusped)) {
			throw new RuntimeException("Pedido está " + this.statusped);
		}
		
		this.statusped = StatusPedido.ABERTO;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public StatusPedido getStatus() {
		return statusped;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public List<PedidoHistorico> getHistoricos(){
		return Collections.unmodifiableList(historicos);
	}
	
	public List<PedidoItem> getItens(){
		return Collections.unmodifiableList(itens);
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	private void novoHistoricoStatus() {
		PedidoHistorico historico = new PedidoHistorico(this.statusped);
		this.historicos.add(historico);
		this.data = historico.getData();
	}
	
	private void verificarClienteAtivo() {
		if(!cliente.isAtivo()) {
			throw new RuntimeException("Pedido está " + this.statusped);
		}
	}
	
	private void verificarStatusPedidoParaAlterar() {
		if(!StatusPedido.ABERTO.equals(this.statusped)) {
			throw new RuntimeException("Pedido está " + this.statusped);
		}
	}

}
