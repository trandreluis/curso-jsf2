package com.trandreluis.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TimesFavoritosBean {
	
	private List<String> times;
	
	public void escolher() {
		System.out.println("Times selecionados: "+this.times);
//		this.times.add(e)
	}

	public List<String> getTimes() {
		return times;
	}

	public void setTimes(List<String> times) {
		this.times = times;
	}
	
}
