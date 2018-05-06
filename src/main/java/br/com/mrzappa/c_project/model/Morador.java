package br.com.mrzappa.c_project.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "morador")
public class Morador implements Serializable {

	private static final long serialVersionUID = -7829901203674175654L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	private String unidade;

	@NotBlank
	@Column(name = "nome_completo", length = 150, nullable = false)
	private String nomeCompleto;

	@NotBlank
	@NaturalId
	@Column(length = 100, nullable = false, unique = true)
	private String email;

	private boolean ativo;

	private boolean proprietario;

	@Column(length = 15, nullable = true)
	private String telefone;

	@Column(length = 15, nullable = true)
	private String celular;

	@Column(name = "dt_nascimento", nullable = true)
	private LocalDate dataNascimento;

	@Lob
	@Column(name = "obs_morador", nullable = true)
	private String obsMorador;

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isProprietario() {
		return proprietario;
	}

	public void setProprietario(boolean proprietario) {
		this.proprietario = proprietario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getObsMorador() {
		return obsMorador;
	}

	public void setObsMorador(String obsMorador) {
		this.obsMorador = obsMorador;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
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
		Morador other = (Morador) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
