package br.com.mrzappa.c_project.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.service.UnidadeService;
import br.com.mrzappa.c_project.util.FacesUtil;
import br.com.mrzappa.c_project.util.MessagesFaces;

@Named
@ViewScoped
public class UnidadeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Unidade unidade;

	private List<Unidade> listaUnidades;

	@Inject
	private UnidadeService unidadeService;

	private List<Bloco> listaBlocos;

	private Bloco blocoSelecionado;

	// Construtor reinicializando valores do formulario
	public UnidadeBean() {
		limpaFormulario();
	}

	// Metodo reinicialiaza objetos e valores
	private void limpaFormulario() {
		unidade = new Unidade();

	}

	public Unidade salvar() {

		unidadeService.salvarUnidade(unidade);
		MessagesFaces.addInfoMessage("Unidade salva com sucesso");
		limpaFormulario();

		return null;
	}

	public void listarBlocos() {

		System.out.println("listando blocos....");
		if (FacesUtil.isNotPostback()) {
			this.listaBlocos = unidadeService.listarBloco();
		}

	}

	public List<Unidade> getListaUnidades() {

		System.out.println("Lista unidades...");

		this.listaUnidades = unidadeService.listarUnidade();
		return this.listaUnidades;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<Bloco> getListaBlocos() {
		return listaBlocos;
	}

	public void setListaBlocos(List<Bloco> listaBlocos) {
		this.listaBlocos = listaBlocos;
	}

	public Bloco getBlocoSelecionado() {
		return blocoSelecionado;
	}

	public void setBlocoSelecionado(Bloco blocoSelecionado) {
		this.blocoSelecionado = blocoSelecionado;
	}

}
