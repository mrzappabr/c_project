package br.com.mrzappa.c_project.model.service;

import java.util.ArrayList;
import java.util.List;

import br.com.mrzappa.c_project.model.UnidadeTeste;

public class GeradorUnidadesTeste {

	// TODO não permitir colocar 2 digitos para mais de 9 unidades por andar
	// TODO limitar numero de andares e numero de unidades por andar

	private int nAndares;
	private int aptoPorAndar;
	private String bloco;
	private int nDigito;
	private int aptoInicial = 0;

	private List<UnidadeTeste> unidades = new ArrayList<>();

	public static void main(String[] args) {

		GeradorUnidadesTeste gunidades = new GeradorUnidadesTeste();

		gunidades.setnAndares(13);
		gunidades.setUnidadesPorAndar(4);
		gunidades.setnDigito(2);
		gunidades.setBloco("Unico");

		if (gunidades.getnDigito() == 2 && gunidades.getUnidadesPorAndar() < 10) {

			int aptoInicial = gunidades.getAptoInicial();
			int nAndares = gunidades.getnAndares();
			int unidadePorAndar = gunidades.getUnidadesPorAndar();
			String nomeBloco = gunidades.getBloco();
			int c = 0;

			for (int n = 0; n < nAndares; n++) {

				aptoInicial += 10;

				for (int i = 1; i <= unidadePorAndar; i++) {

					int a = aptoInicial + i;

					UnidadeTeste und = new UnidadeTeste(String.valueOf(a), nomeBloco);
					gunidades.unidades.add(und);

					c += 1;

				}

			}

			for (UnidadeTeste unidade : gunidades.unidades) {

				System.out.print("Unidade: " + unidade.getApto() + "-");
				System.out.println("Bloco: " + unidade.getBloco());

			}
			System.out.println("Numero de apartamentos: " + c);

		} else if (gunidades.getnDigito() == 3 && gunidades.getUnidadesPorAndar() < 100) {

			int aptoInicial = gunidades.getAptoInicial();
			int nAndares = gunidades.getnAndares();
			int unidadePorAndar = gunidades.getUnidadesPorAndar();
			String nomeBloco = gunidades.getBloco();
			int c = 0;

			for (int n = 0; n < nAndares; n++) {

				aptoInicial += 100;

				for (int i = 1; i <= unidadePorAndar; i++) {

					int a = aptoInicial + i;

					UnidadeTeste und = new UnidadeTeste(String.valueOf(a), nomeBloco);
					gunidades.unidades.add(und);

					c += 1;

				}

			}

			for (UnidadeTeste unidade : gunidades.unidades) {

				System.out.println("Unidade: " + unidade.getApto());
				System.out.println("Bloco: " + unidade.getBloco());

			}

			System.out.println("Numero de apartamentos: " + c);

		} else {

			System.out.println("Informe apenas 2 ou 3 digitos.");

		}//fim else

	}//fim main

	public int getnAndares() {
		return nAndares;
	}

	public void setnAndares(int nAndares) {
		this.nAndares = nAndares;
	}

	public int getUnidadesPorAndar() {
		return aptoPorAndar;
	}

	public void setUnidadesPorAndar(int unidadesPorAndar) {
		this.aptoPorAndar = unidadesPorAndar;
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
