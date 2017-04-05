package com.trandreluis.visao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CadastroCurriculoBean {

	private String vaga;
	private String cargo;
	
	public CadastroCurriculoBean() {
		this.cargo = "Programador Java Sênior";
		this.vaga = "A0382D";
	}
	
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
