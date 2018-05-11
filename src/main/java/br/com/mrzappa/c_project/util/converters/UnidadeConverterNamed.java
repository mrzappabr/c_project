package br.com.mrzappa.c_project.util.converters;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.service.UnidadeService;

@Named
@RequestScoped
public class UnidadeConverterNamed implements Converter<Unidade> {

	@Inject
	private UnidadeService unidadeService;

	@Override
	public Unidade getAsObject(FacesContext context, UIComponent component, String value) {

		if (value == null || value.isEmpty()) {

			return null;
		}

		if (!value.matches("\\d+")) {
			throw new ConverterException("O value não é um numero valido: " + value);
		}

		Long id = Long.parseLong(value);
		return unidadeService.buscarUnidade(id);

	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Unidade value) {

		if (value == null) {
			return null; // Ou uma string vazia.
		}
		if (!(value instanceof Unidade)) {
			throw new ConverterException("O valor não é um tipo Uninade : " + value);
		}

		Long id = ((Unidade) value).getId();
		return (id != null) ? String.valueOf(id) : null;
	}

}
