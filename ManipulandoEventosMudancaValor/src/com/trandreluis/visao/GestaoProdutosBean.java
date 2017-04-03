package com.trandreluis.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.trandreluis.dominio.Produto;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

	private String fabricantePesquisa;
	private List<Produto> produtos;
	private Produto produto;
	
	private Produto produtoSelecionado;
	
	public GestaoProdutosBean() {
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	
	public void pesquisar() {
		System.out.println("Pesquisando...");
	}
	
	public void incluir() {
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}

	public void verificarInclusao(ActionEvent evento) {
		if("".equals(this.produto.getFabricante())) {
			this.produto.setFabricante("Sem Frabricante");
		}
		
		if("".equals(this.produto.getCategoria())) {
			this.produto.setCategoria("Sem Categoria");
		}
	}
	
	public void excluir() {
		this.produtos.remove(this.produtoSelecionado);
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public String getFabricantePesquisa() {
		return fabricantePesquisa;
	}

	public void setFabricantePesquisa(String fabricantePesquisa) {
		this.fabricantePesquisa = fabricantePesquisa;
	}
	
}
