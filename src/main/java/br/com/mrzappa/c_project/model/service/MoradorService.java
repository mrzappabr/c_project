package br.com.mrzappa.c_project.model.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.MoradorDAO;
import br.com.mrzappa.c_project.util.interceptor.Transactional;

public class MoradorService implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private MoradorDAO moradorDAO;

	public Morador carregar(Long id) {

		return this.moradorDAO.buscar(id);
	}

	@Transactional
	public void salvar(Morador morador) {

		Long id = morador.getId();
		if (id == null || id == 0) {
			this.moradorDAO.salvar(morador);
		} else {
			this.moradorDAO.atualizar(morador);

		}

	}

	public void excluir(Morador morador) {
		this.moradorDAO.excluir(morador);
	}

	public List<Morador> buscaPorApto(Unidade apto) {

		return null;
	}

	public List<Morador> listar() {

		return this.moradorDAO.listar();
	}

}
