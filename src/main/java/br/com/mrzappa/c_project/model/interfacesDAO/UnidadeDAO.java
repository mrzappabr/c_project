package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Unidade;

public interface UnidadeDAO {

	public Unidade salvar(Unidade unidade);

	public void atualizar(Unidade unidade);

	public void excluir(Unidade unidade);

	public Unidade carregar(Long id);

	public List<Unidade> listar();

}
