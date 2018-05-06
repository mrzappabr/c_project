package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;

public interface MoradorDAO {

	public Morador salvar(Morador morador);

	public void atualizar(Morador morador);

	public void excluir(Morador morador);

	public Morador carregar(Integer id);

	public List<Morador> buscarPorApto(Unidade unidade);

	public List<Morador> listar();

}
