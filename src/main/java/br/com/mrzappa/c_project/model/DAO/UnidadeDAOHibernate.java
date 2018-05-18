package br.com.mrzappa.c_project.model.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.UnidadeDAO;

public class UnidadeDAOHibernate implements UnidadeDAO{

	
	@Inject
	private EntityManager em;

	@Override
	public Unidade salvarUnidade(Unidade unidade) {

		unidade = em.merge(unidade);

		return unidade;
	}

	@Override
	public void atualizarUnidade(Unidade unidade) {

	}

	@Override
	public void excluirUnidade(Unidade unidade) {

	}

	@Override
	public Unidade buscarUnidade(Long id) {

		return em.find(Unidade.class, id);

	}

	@Override
	public List<Unidade> listarUnidade() {

		return em.createQuery("from Unidade", Unidade.class).getResultList();

	}

	
}
