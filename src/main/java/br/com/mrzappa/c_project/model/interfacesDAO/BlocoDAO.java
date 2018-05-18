package br.com.mrzappa.c_project.model.interfacesDAO;

import java.util.List;

import br.com.mrzappa.c_project.model.Bloco;

public interface BlocoDAO {

	public Bloco salvarBloco(Bloco bloco);

	public void atualizarBloco(Bloco bloco);

	public void excluirBloco(Bloco bloco);

	public Bloco buscarBloco(Long id);

	public List<Bloco> listarBloco();

}
