package br.com.mrzappa.c_project.model.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.interfacesDAO.BlocoDAO;

public class BlocoDAOHibernate implements BlocoDAO, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager em;

	@Override
	public Bloco salvarBloco(Bloco unidade) {
		
		return null;
	}

	@Override
	public void atualizarBloco(Bloco unidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluirBloco(Bloco unidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public Bloco buscarBloco(Long id) {
		return em.find(Bloco.class, id);
	}

	@Override
	public List<Bloco> listarBloco() {
		
		return em.createQuery("from Bloco", Bloco.class).getResultList();
	}

}
