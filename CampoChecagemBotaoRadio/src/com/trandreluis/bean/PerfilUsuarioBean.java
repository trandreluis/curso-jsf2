package com.trandreluis.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PerfilUsuarioBean {

	public String enviar() {
		return "Confirmacao";
	}
	
}