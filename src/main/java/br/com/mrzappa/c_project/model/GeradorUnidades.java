package br.com.mrzappa.c_project.model;

import java.util.ArrayList;
import java.util.List;

public class GeradorUnidades {
	
	//TODO não permitir colocar 2 digitos para mais de 9 unidades por andar
	//TODO limitar numero de andares e numero de unidades por andar

	private int nAndares;
	private int unidadesPorAndar;
	private String bloco;
	private int nDigito;
	private int aptoInicial = 0;
	private List<UnidadeTeste> unidades = new ArrayList<>();

	public static void main(String[] args) {

		GeradorUnidades gunidades = new GeradorUnidades();

		gunidades.setnAndares(13);
		gunidades.setUnidadesPorAndar(4);
		gunidades.setnDigito(2);
		gunidades.setBloco("Unico");

		if (gunidades.getnDigito() == 2) {

			int aptoInicial = gunidades.getAptoInicial();
			int nAndares = gunidades.getnAndares();
			int unidadePorAndar = gunidades.getUnidadesPorAndar();
			String nomeBloco = gunidades.getBloco();

			for (int n = 0; n < nAndares; n++) {

				aptoInicial = aptoInicial += 10;

				for (int i = 1; i <= unidadePorAndar; i++) {
					
					int a = aptoInicial + i;
					
					UnidadeTeste und = new UnidadeTeste(String.valueOf(a), nomeBloco);
					gunidades.unidades.add(und);

				}

			}

			for (UnidadeTeste unidade : gunidades.unidades) {

				System.out.print("Unidade: " + unidade.getApto() + "-");
				System.out.println("Bloco: " + unidade.getBloco());

			}

		} else if (gunidades.getnDigito() == 3) {
			
			int aptoInicial = gunidades.getAptoInicial();
			int nAndares = gunidades.getnAndares();
			int unidadePorAndar = gunidades.getUnidadesPorAndar();
			String nomeBloco = gunidades.getBloco();

			for (int n = 0; n < nAndares; n++) {

				aptoInicial = aptoInicial += 100;

				for (int i = 1; i <= unidadePorAndar; i++) {
					
					int a = aptoInicial + i;
					
					UnidadeTeste und = new UnidadeTeste(String.valueOf(a), nomeBloco);
					gunidades.unidades.add(und);

				}

			}

			for (UnidadeTeste unidade : gunidades.unidades) {

				System.out.println("Unidade: " + unidade.getApto());
				System.out.println("Bloco: " + unidade.getBloco());

			}

		} else {

			System.out.println("Informe apenas 2 ou 3 digitos.");

		}

	}

	public int getnAndares() {
		return nAndares;
	}

	public void setnAndares(int nAndares) {
		this.nAndares = nAndares;
	}

	public int getUnidadesPorAndar() {
		return unidadesPorAndar;
	}

	public void setUnidadesPorAndar(int unidadesPorAndar) {
		this.unidadesPorAndar = unidadesPorAndar;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public int getnDigito() {
		return nDigito;
	}

	public void setnDigito(int nDigito) {
		this.nDigito = nDigito;
	}

	public int getAptoInicial() {
		return aptoInicial;
	}

	public void setAptoInicial(int aptoInicial) {
		this.aptoInicial = aptoInicial;
	}

	public List<UnidadeTeste> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<UnidadeTeste> unidades) {
		this.unidades = unidades;
	}

}
