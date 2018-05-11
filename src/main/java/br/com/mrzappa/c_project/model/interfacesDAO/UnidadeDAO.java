package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Unidade;

public interface UnidadeDAO {

	public Unidade salvarUnidade(Unidade unidade);

	public void atualizarUnidade(Unidade unidade);

	public void excluirUnidade(Unidade unidade);

	public Unidade buscarUnidade(Long id);

	public List<Unidade> listarUnidade();

}
