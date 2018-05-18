package br.com.mrzappa.c_project.model.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.mrzappa.c_project.model.Condominio;
import br.com.mrzappa.c_project.model.interfacesDAO.CondominioDAO;

public class CondominioDAOHibernate implements CondominioDAO {

	@Inject
	private EntityManager em;

	@Override
	public Condominio salvar(Condominio condominio) {

		condominio = em.merge(condominio);

		return condominio;
	}

	@Override
	public void atualizar(Condominio condominio) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Condominio> listarCondominio() {
		return em.createQuery("from Condominio", Condominio.class).getResultList();
	}

}
