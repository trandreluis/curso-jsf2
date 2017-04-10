package com.trandreluis.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TimeFavoritoBean {
	
	private String time;
	
	public void escolher() {
		System.out.println("Time selecionado: "+this.time);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
