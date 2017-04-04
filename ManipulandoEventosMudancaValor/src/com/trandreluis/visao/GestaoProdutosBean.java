package com.trandreluis.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import com.trandreluis.dominio.Produto;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

	private String nomePesquisa;
	private List<Produto> produtos;
	private List<Produto> produtosFiltrados;
	private Produto produto;

	private Produto produtoSelecionado;

	public GestaoProdutosBean() {
		this.produtos = new ArrayList<Produto>();
		this.produtosFiltrados = new ArrayList<Produto>();
		this.produto = new Produto();
	}

	public void nomePesquisaAlterado(ValueChangeEvent evento) {
		System.out.println("Valor atual: " + this.nomePesquisa);
		System.out.println("Valor novo: " + evento.getNewValue());

		this.produtosFiltrados.clear();

		for (Produto produto : this.produtos) {
			if (produto.getNome().toLowerCase().startsWith(evento.getNewValue().toString().toLowerCase())) {
				this.produtosFiltrados.add(produto);
			}
		}

	}

	public void incluir() {
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}

	public void verificarInclusao(ActionEvent evento) {
		if ("".equals(this.produto.getFabricante())) {
			this.produto.setFabricante("Sem Frabricante");
		}

		if ("".equals(this.produto.getCategoria())) {
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

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public List<Produto> getProdutosFiltrados() {
		return produtosFiltrados;
	}

}
