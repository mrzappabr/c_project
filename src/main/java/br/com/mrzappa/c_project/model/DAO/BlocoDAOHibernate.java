package br.com.mrzappa.c_project.model.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.interfacesDAO.BlocoDAO;

public class BlocoDAOHibernate implements BlocoDAO {

	@Inject
	private EntityManager em;

	@Override
	public Bloco salvarBloco(Bloco bloco) {

		bloco = em.merge(bloco);

		return bloco;
	}

	@Override
	public void atualizarBloco(Bloco bloco) {

	}

	@Override
	public void excluirBloco(Bloco bloco) {

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
