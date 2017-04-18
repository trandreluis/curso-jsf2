package com.trandreluis.bean;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CadastroUsuarioBean {

	private String nome;
	private String email;
	private String senha;

	public void cadastrar() {

		if (this.getNome() != null || this.getNome().length() < 10) {
			this.adicionarMenasagem("frm:nome", FacesMessage.SEVERITY_ERROR, "Informe o nome corretamente.",
					"O nome deve conter mais de 10 caracters!");
		}

		if (diaDeDescanso()) {
			this.adicionarMenasagem(null, FacesMessage.SEVERITY_WARN, "Hoje é domingo",
					"Domingo é um dia de descanso.");
		}

	}

	/**
	 * 
	 * @param componentID
	 *            tambem conhecido como clientID
	 */
	private void adicionarMenasagem(String componentID, Severity severidade, String sumarioErro, String detalheErro) {

	}

	public boolean diaDeDescanso() {
		
		if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return true;			
		}
		
		return false;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
