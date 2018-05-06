package br.com.mrzappa.c_project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "unidade")
public class Unidade implements Serializable {

	private static final long serialVersionUID = 2012995096083075498L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String unidade;
	@Transient
	private List<Morador> moradores = new ArrayList<>();
	private int qtdeMorador;
	private Veiculo veiculo;
	private Morador responsavel;
	private String bloco;
	@Transient
	private List<HistoricoInfracao> historicoInfracoes = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Morador getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Morador responsavel) {
		this.responsavel = responsavel;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public List<HistoricoInfracao> getHistoricoInfracoes() {
		return historicoInfracoes;
	}

	public void setHistoricoInfracoes(List<HistoricoInfracao> historicoInfracoes) {
		this.historicoInfracoes = historicoInfracoes;
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

}