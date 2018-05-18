package br.com.mrzappa.c_project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unidade")
public class Unidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String unidade;

	@OneToMany
	private List<Morador> moradores = new ArrayList<>();

	private int qtdeMorador;

	@OneToMany(mappedBy = "unidade", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Veiculo> veiculos;

	@OneToOne
	private Morador responsavel;

	@ManyToOne
	private Bloco bloco;

	@OneToMany(mappedBy = "unidadeInfracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<HistoricoInfracao> historicoInfracoes = new ArrayList<>();

	public Unidade() {

	}

	public Unidade(String unidade, Bloco bloco) {
		this.unidade = unidade;
		this.bloco = bloco;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public List<Morador> getMoradores() {
		return moradores;
	}

	public void setMoradores(List<Morador> moradores) {
		this.moradores = moradores;
	}

	public int getQtdeMorador() {
		return qtdeMorador;
	}

	public void setQtdeMorador(int qtdeMorador) {
		this.qtdeMorador = qtdeMorador;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Morador getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Morador responsavel) {
		this.responsavel = responsavel;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}

	public List<HistoricoInfracao> getHistoricoInfracoes() {
		return historicoInfracoes;
	}

	public void setHistoricoInfracoes(List<HistoricoInfracao> historicoInfracoes) {
		this.historicoInfracoes = historicoInfracoes;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidade other = (Unidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	  @Override
	  public String toString() { return String.format("%s[id=%d]",
	  getClass().getSimpleName(), getId()); }
	 

}