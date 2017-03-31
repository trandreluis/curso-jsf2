package com.trandreluis.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
		if(this.produtos.size() > 0) {
			return "AjudaGestaoProdutosTelefone";
		}
		return "AjudaGestaoProdutos";
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
