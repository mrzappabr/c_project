package br.com.mrzappa.c_project.model.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.UnidadeDAO;

public class UnidadeDAOHibernate implements UnidadeDAO, Serializable {

	private static final long serialVersionUID = -1236868126423331221L;
	
	@Inject
	private EntityManager em;

	
	public Unidade salvar(Unidade unidade) {

		unidade = em.merge(unidade);

		return unidade;
	}

	@Override
	public void atualizar(Unidade unidade) {
		// TODO Auto-generated method stub
	}

	@Override
	public void excluir(Unidade unidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public Unidade carregar(Long id) {
		// TO DO fazer funcionar para o conversor

		
		return null;
	}

	@Override
	public List<Unidade> listar() {

		return em.createQuery("from Unidade", Unidade.class).getResultList();

	}

}
