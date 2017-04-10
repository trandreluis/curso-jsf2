package com.trandreluis.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PerfilUsuarioBean {

	private String sexo;
	private boolean receberNovidades;
	private ArrayList<String> linguagens;
	
	public String enviar() {
		return "Confirmacao";
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isReceberNovidades() {
		return receberNovidades;
	}

	public void setReceberNovidades(boolean receberNovidades) {
		this.receberNovidades = receberNovidades;
	}

	public ArrayList<String> getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(ArrayList<String> linguagens) {
		this.linguagens = linguagens;
	}
	
}
