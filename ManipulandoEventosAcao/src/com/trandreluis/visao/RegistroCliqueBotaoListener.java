package com.trandreluis.visao;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

@ManagedBean
public class RegistroCliqueBotaoListener implements ActionListener {

	@Override
	public void processAction(ActionEvent evento) throws AbortProcessingException {
		
		if(evento.getComponent().getId().equals("incluir")) {
			System.out.println("Clicando no botao: "+evento.getComponent().getId());			
		}
		
		else if(evento.getComponent().getId().equals("ajuda")) {
			System.out.println("AJUDA");
		}
		
	}

}
