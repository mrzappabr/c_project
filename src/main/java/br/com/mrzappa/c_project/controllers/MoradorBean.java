package br.com.mrzappa.c_project.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.Morador;
import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.service.MoradorService;
import br.com.mrzappa.c_project.model.service.UnidadeService;
import br.com.mrzappa.c_project.util.FacesUtil;
import br.com.mrzappa.c_project.util.MessagesFaces;

@Named
@ViewScoped
public class MoradorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Morador morador;

	// private Unidade unidadeFiltrada;

	private List<Morador> lista;

	private Unidade unidadeSelecionada;
	
	private Bloco blocoSelecionado;

	private List<Unidade> listaUnidades;

	private List<Bloco> listaBlocos;
	
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

		if (FacesUtil.isNotPostback()) {

			this.listaUnidades = unidadeService.listarUnidade();
		}

	}

	public void listarBlocos() {

		System.out.println("listando blocos....");

		if (FacesUtil.isNotPostback()) {

			this.listaBlocos = unidadeService.listarBloco();
		}

	}

	private void limpaFormulario() {
		morador = new Morador();

	}

	public void salvar() {

		// moradorService.salvar(morador);

		System.out.println("Unidade selecionada : " + unidadeSelecionada.getUnidade());
		System.out.println("Bloco Selecionado: " + blocoSelecionado.getBloco());
		
		MessagesFaces.addInfoMessage("Morador salvo com sucesso");
		limpaFormulario();

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

	
	public List<Bloco> getListaBlocos() {
		return listaBlocos;
	}

	public void setListaBlocos(List<Bloco> listaBlocos) {
		this.listaBlocos = listaBlocos;
	}

	public Unidade getUnidadeSelecionada() {
		return unidadeSelecionada;
	}

	public void setUnidadeSelecionada(Unidade unidadeSelecionada) {
		this.unidadeSelecionada = unidadeSelecionada;
	}

	public Bloco getBlocoSelecionado() {
		return blocoSelecionado;
	}

	public void setBlocoSelecionado(Bloco blocoSelecionado) {
		this.blocoSelecionado = blocoSelecionado;
	}

	
}
