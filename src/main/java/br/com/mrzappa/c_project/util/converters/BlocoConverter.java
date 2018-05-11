package br.com.mrzappa.c_project.util.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.com.mrzappa.c_project.model.Bloco;
import br.com.mrzappa.c_project.model.service.UnidadeService;

 
@FacesConverter(value = "blocoConverter", managed = true)
public class BlocoConverter implements Converter<Bloco>{
	
	@Inject
	private UnidadeService unidadeService;

	@Override
	public Bloco getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null || value.isEmpty()) {

			return null;
		}

		if (!value.matches("\\d+")) {
			throw new ConverterException("O value não é um numero valido: " + value);
		}

		Long id = Long.parseLong(value);
		return unidadeService.buscarBloco(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Bloco value) {
		if (value == null) {
			return null; // Ou uma string vazia.
		}
		if (!(value instanceof Bloco)) {
			throw new ConverterException("O valor não é um tipo Uninade : " + value);
		}

		Long id = ((Bloco) value).getId();
		return (id != null) ? String.valueOf(id) : null;
	
	}

}
