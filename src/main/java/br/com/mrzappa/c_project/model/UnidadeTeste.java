package br.com.mrzappa.c_project.model;

public class UnidadeTeste {

	private String apto;
	private String bloco;
	
	public UnidadeTeste() {
		
	}
	
	public UnidadeTeste(String apto, String bloco) {
		super();
		this.apto = apto;
		this.bloco = bloco;
	}



	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

}
