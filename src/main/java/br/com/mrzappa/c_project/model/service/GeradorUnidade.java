package br.com.mrzappa.c_project.model.service;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.Unidade;

public class GeradorUnidade {

	// TODO não permitir colocar 2 digitos para mais de 9 unidades por andar
	// TODO limitar numero de andares e numero de unidades por andar

	private int nAndares;
	private int aptoPorAndar;
	private Bloco bloco;
	private int nDigito;
	private int aptoInicial = 0;

	public GeradorUnidade() {

	}

	public GeradorUnidade(int nAndares, int aptoPorAndar, Bloco bloco, int nDigito) {
		this.nAndares = nAndares;
		this.aptoPorAndar = aptoPorAndar;
		this.bloco = bloco;
		this.nDigito = nDigito;
	}

	public void geradorUnd() {

		if (nDigito == 2 && aptoPorAndar < 10) {

			for (int n = 0; n < nAndares; n++) {

				aptoInicial += 10;

				for (int i = 1; i <= aptoPorAndar; i++) {

					int a = aptoInicial + i;

					Unidade apto = new Unidade(String.valueOf(a), bloco);

					bloco.getUnidades().add(apto);

					apto.setBloco(bloco);

				}

			}

		} else if (nDigito == 3 && aptoPorAndar < 100) {

			for (int n = 0; n < nAndares; n++) {

				aptoInicial += 100;

				for (int i = 1; i <= aptoPorAndar; i++) {

					int a = aptoInicial + i;

					Unidade apto = new Unidade(String.valueOf(a), bloco);

					bloco.getUnidades().add(apto);

					apto.setBloco(bloco);

				}

			}

		} else {

			System.out.println("Informe apenas 2 ou 3 digitos.");

		}

	}

}
