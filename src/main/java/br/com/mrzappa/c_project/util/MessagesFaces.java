package br.com.mrzappa.c_project.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessagesFaces {

	public static void addErrorMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
	}
	
	public static void addInfoMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
	}
	
	public static void addWarningMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_WARN, message, message));
	}
	
	
	
}