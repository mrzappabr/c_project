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

	private Unidade unidade;

	@Inject
	private Bloco bloco;
	
	@Inject
	private UnidadeService unidadeService;

	private List<Unidade> listaUnidades;

	private List<Bloco> listaBlocos;

	private Bloco blocoSelecionado;

	private boolean mostrarLabelSeOBlocoForCodigo1 = false;
	
	
	public void imprimeBloco() {
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxx TESTE IMPRESSÃO BLOCO xxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("Nome do Bloco: " + bloco.getBloco() + " ID: " + bloco.getId());
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		
	}
	

	public boolean isMostrarLabelSeOBlocoForCodigo1() {

		this.mostrarLabelSeOBlocoForCodigo1 = false;

		if (this.getBloco().getId().equals(1L)) {
			
			
			this.mostrarLabelSeOBlocoForCodigo1 = true;

		}

		return mostrarLabelSeOBlocoForCodigo1;
	}

	public void limparFormulario() {

		unidade = new Unidade();

	}

	public void novaUnidade() {

		unidade = new Unidade();
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}

	public void adicionarUnd() {

		bloco.getUnidades().add(unidade);
		unidade.setBloco(bloco);

	}

	public Unidade salvarUnidade() {

		unidadeService.salvarUnidade(unidade);
		MessagesFaces.addInfoMessage("Unidade salva com sucesso");
		limparFormulario();

		return null;
	}

	public Bloco salvarBloco() {

		unidadeService.salvarBloco(bloco);

		MessagesFaces.addInfoMessage("Bloco salvo com sucesso, acrescente unidades");

		return null;
	}

	public void listarBlocos() {

		if (FacesUtil.isNotPostback()) {
			this.listaBlocos = unidadeService.listarBloco();
		}

	}

	public List<Unidade> getListaUnidades() {

		this.listaUnidades = unidadeService.listarUnidade();
		return this.listaUnidades;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setListaBlocos(List<Bloco> listaBlocos) {
		this.listaBlocos = listaBlocos;
	}

	public List<Bloco> getListaBlocos() {
		return listaBlocos;
	}

	public Bloco getBlocoSelecionado() {
		return blocoSelecionado;
	}

	public void setBlocoSelecionado(Bloco blocoSelecionado) {
		this.blocoSelecionado = blocoSelecionado;
	}

	public Bloco getBloco() {
		return bloco;
	}
	

}
