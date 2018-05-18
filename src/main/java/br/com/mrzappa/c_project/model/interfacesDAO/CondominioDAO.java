package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Condominio;

public interface CondominioDAO {
	
	public Condominio salvar(Condominio condominio);

	public void atualizar(Condominio condominio);

	public List<Condominio> listarCondominio();

}
