package br.com.mrzappa.c_project.model.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.BlocoDAO;
import br.com.mrzappa.c_project.model.interfacesDAO.UnidadeDAO;
import br.com.mrzappa.c_project.util.interceptor.Transactional;

public class UnidadeService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UnidadeDAO unidadeDAO;

	@Inject
	private BlocoDAO blocoDAO;

	public Unidade buscarUnidade(Long id) {

		return this.unidadeDAO.buscarUnidade(id);
	}

	public Bloco buscarBloco(Long id) {

		return this.blocoDAO.buscarBloco(id);
	}

	@Transactional
	public Bloco salvarBloco(Bloco bloco) {

		return blocoDAO.salvarBloco(bloco);

	}

	@Transactional
	public Unidade salvarUnidade(Unidade unidade) {

		return unidadeDAO.salvarUnidade(unidade);

	}

	public List<Unidade> listarUnidade() {

		return unidadeDAO.listarUnidade();
	}

	public List<Bloco> listarBloco() {

		return blocoDAO.listarBloco();

	}

}
