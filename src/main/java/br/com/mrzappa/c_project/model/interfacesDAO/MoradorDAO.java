package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;

public interface MoradorDAO {

	public Morador salvar(Morador morador);

	public void atualizar(Morador morador);

	public void excluir(Morador morador);

	public Morador buscar(Long id);

	public List<Morador> buscarPorApto(Unidade apto);

	public List<Morador> listar();

}
