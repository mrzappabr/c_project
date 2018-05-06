package br.com.mrzappa.c_project.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.service.UnidadeService;
import br.com.mrzappa.c_project.util.MessagesFaces;

@Named
@ViewScoped
public class UnidadeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	

	private Unidade unidade;
	private List<Unidade> listaUnidades;
	@Inject
	private UnidadeService unidadeService;
	
	//Construtor reinicializando valores do formulario
	public UnidadeBean() {
		limpaFormulario();
	}

	//Metodo reinicialiaza objetos e valores
	private void limpaFormulario() {
		unidade = new Unidade();

	}

	public Unidade salvar() {

		unidadeService.salvar(unidade);
		MessagesFaces.addInfoMessage("Unidade salva com sucesso");
		limpaFormulario();
		
		return null;
	}

	public List<Unidade> getListaUnidades() {

		System.out.println("Lista unidades...");
		this.listaUnidades = unidadeService.listar();
		return this.listaUnidades;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

}
