package br.com.mrzappa.c_project.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.service.MoradorService;
import br.com.mrzappa.c_project.model.service.UnidadeService;
import br.com.mrzappa.c_project.util.MessagesFaces;

@Named
@ViewScoped
public class MoradorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private Morador morador;

	// private Unidade unidadeFiltrada;

	private List<Morador> lista;

	private List<Unidade> listaUnidades;

	@Inject
	private MoradorService moradorService;

	@Inject
	private UnidadeService unidadeService;
	
	
	public MoradorBean() {
		limpaFormulario();
	}

	public List<Morador> getLista() {
		if (this.lista == null) {
			this.lista = moradorService.listar();
		}
		return this.lista;
	}

	public void listarUnidades() {
		System.out.println("listando unidades....");

		this.listaUnidades = unidadeService.listar();

	}

	private void limpaFormulario() {
		morador = new Morador();
		

	}

	public Morador salvar() {

		moradorService.salvar(morador);
		MessagesFaces.addInfoMessage("Morador salvo com sucesso");
		limpaFormulario();

		return null;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

	public List<Unidade> getListaUnidades() {
		return listaUnidades;
	}

	public void setListaUnidades(List<Unidade> listaUnidades) {
		this.listaUnidades = listaUnidades;
	}

}
