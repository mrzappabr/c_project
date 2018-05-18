package br.com.mrzappa.c_project.model.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.mrzappa.c_project.model.Condominio;
import br.com.mrzappa.c_project.model.interfacesDAO.CondominioDAO;
import br.com.mrzappa.c_project.util.interceptor.Transactional;

public class CondominioService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CondominioDAO condominioDAO;

	@Transactional
	public void salvar(Condominio condominio) {
		
		this.condominioDAO.salvar(condominio);

	}

}
