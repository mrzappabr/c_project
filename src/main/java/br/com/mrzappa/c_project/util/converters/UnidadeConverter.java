package br.com.mrzappa.c_project.util.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.com.mrzappa.c_project.model.Unidade;
import br.com.mrzappa.c_project.model.service.UnidadeService;

@FacesConverter(value = "unidadeConverter", managed = true)
public class UnidadeConverter implements Converter<Unidade> {

	@Inject
	private UnidadeService unidadeService;
	
	@Override
	public Unidade getAsObject(FacesContext context, UIComponent component, String value) {

		Unidade retorno = null;

		if (value != null) {
			Long id = new Long(value);
			retorno = unidadeService.carregar(id);

		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Unidade value) {

		if (value != null) {

			((Unidade) value).getId().toString();

		}

		return "";
	}

}
