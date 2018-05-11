package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Bloco;

public interface BlocoDAO {

	public Bloco salvarBloco(Bloco unidade);

	public void atualizarBloco(Bloco unidade);

	public void excluirBloco(Bloco unidade);

	public Bloco buscarBloco(Long id);

	public List<Bloco> listarBloco();

}
