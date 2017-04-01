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

	private List<Produto> produtos;
	private Produto produto;
	
	public GestaoProdutosBean() {
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	
	public void incluir() {
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}

	public String obterAjuda() {
		if(this.produtos.isEmpty()) {
			return "AjudaGestaoProdutosTelefone?faces-redirect=true";
		}
		return "AjudaGestaoProdutos?faces-redirect=true";
	}

	public void verificarInclusao(ActionEvent evento) {
		if("".equals(this.produto.getFabricante())) {
			this.produto.setFabricante("Sem Frabricante");
		}
		
		if("".equals(this.produto.getCategoria())) {
			this.produto.setCategoria("Sem Categoria");
		}
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
