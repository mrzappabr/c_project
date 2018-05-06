package br.com.mrzappa.c_project.model.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.MoradorDAO;

public class MoradorDAOHibernate implements MoradorDAO, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private EntityManager em;

	@Override
	public List<Morador> listar() {

		return em.createQuery("from Morador", Morador.class).getResultList();
	}

	@Override
	public Morador salvar(Morador morador) {

		morador = em.merge(morador);

		return null;
	}

	@Override
	public void atualizar(Morador morador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Morador morador) {
		// TODO Auto-generated method stub

	}

	@Override
	public Morador carregar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Morador> buscarPorApto(Unidade unidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
