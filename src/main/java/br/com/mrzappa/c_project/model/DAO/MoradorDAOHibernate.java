package br.com.mrzappa.c_project.model.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.interfacesDAO.MoradorDAO;

public class MoradorDAOHibernate implements MoradorDAO{

	@Inject
	private EntityManager em;

	@Override
	public List<Morador> listar() {

		return em.createQuery("from Morador", Morador.class).getResultList();
	}

	@Override
	public Morador salvar(Morador morador) {

		morador = em.merge(morador);

		return morador;
	}

	@Override
	public void atualizar(Morador morador) {
		

	}

	@Override
	public void excluir(Morador morador) {
		

	}

	@Override
	public Morador buscar(Long id) {
	
		return null;
	}

	@Override
	public List<Morador> buscarPorApto(Unidade apto) {
		
		return null;
	}

}
