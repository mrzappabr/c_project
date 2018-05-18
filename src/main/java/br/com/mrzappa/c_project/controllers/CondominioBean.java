package br.com.mrzappa.c_project.controllers;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.Condominio;
import br.com.mrzappa.c_project.model.service.CondominioService;
import br.com.mrzappa.c_project.util.MessagesFaces;

@Named
@ViewScoped
public class CondominioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Condominio condominio;

	private Bloco bloco;

	@Inject
	private CondominioService condominioService;

	public void adicionarBloco() {

		condominio.getBlocos().add(bloco);

		bloco.setCondominio(condominio);

	}

	public void novoBloco() {

		bloco = new Bloco();

	}

	public void salvar() {

		condominioService.salvar(condominio);

		MessagesFaces.addInfoMessage("Condominio salvo com sucesso");

	}

	public Condominio getCondominio() {
		return condominio;
	}

	public Bloco getBloco() {
		return bloco;
	}

}
