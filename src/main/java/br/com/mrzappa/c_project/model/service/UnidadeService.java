package br.com.mrzappa.c_project.model.service;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.UnidadeDAO;
import br.com.mrzappa.c_project.util.interceptor.Transactional;

public class UnidadeService implements Serializable {

	private static final long serialVersionUID = -7606250922332039422L;

	@Inject
	private UnidadeDAO unidadeDAO;

	public Unidade carregar(long id) {

		return this.unidadeDAO.carregar(id);
	}

	@Transactional
	public Unidade salvar(Unidade unidade) {
		System.out.println("salvar do service");
		
	 unidadeDAO.salvar(unidade);

	 return unidade;
	}

	public List<Unidade> listar() {

		return unidadeDAO.listar();
	}

}
