package br.com.mrzappa.c_project.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.mrzappa.c_project.model.enums.TipoPenalizacao;


@Table(name = "infracao")
@Entity
public class HistoricoInfracao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Unidade unidadeInfracao;
	
	private Date dataInfracao;
	private Date dataNotificacao;
	private TipoPenalizacao tipoPenalizacao;
	private String DescricaoInfracao;

	public Unidade getUnidade() {
		return unidadeInfracao;
	}

	public void setUnidade(Unidade unidadeInfracao) {
		this.unidadeInfracao = unidadeInfracao;
	}

	public Date getDataInfracao() {
		return dataInfracao;
	}

	public void setDataInfracao(Date dataInfracao) {
		this.dataInfracao = dataInfracao;
	}

	public Date getDataNotificacao() {
		return dataNotificacao;
	}

	public void setDataNotificacao(Date dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}

	public TipoPenalizacao getTipoPenalizacao() {
		return tipoPenalizacao;
	}

	public void setTipoPenalizacao(TipoPenalizacao tipoPenalizacao) {
		this.tipoPenalizacao = tipoPenalizacao;
	}

	public String getDescricaoInfracao() {
		return DescricaoInfracao;
	}

	public void setDescricaoInfracao(String descricaoInfracao) {
		DescricaoInfracao = descricaoInfracao;
	}

	public long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		HistoricoInfracao other = (HistoricoInfracao) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
