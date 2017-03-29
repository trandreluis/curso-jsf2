package com.trandreluis.backingbean;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class OlaBackingBean {

	private HtmlInputText campo;
	private HtmlCommandButton botao;
	
	public HtmlInputText getCampo() {
		return campo;
	}
	public void setCampo(HtmlInputText campoNome) {
		this.campo = campoNome;
	}
	
	public HtmlCommandButton getBotao() {
		return botao;
	}
	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}
	
	public void desabilitar() {
		this.getBotao().setDisabled(true);
	}
	
}
