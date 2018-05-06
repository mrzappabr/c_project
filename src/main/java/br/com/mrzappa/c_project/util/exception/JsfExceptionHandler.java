package br.com.mrzappa.c_project.util.exception;

import java.io.IOException;
import java.util.Iterator;
import javax.faces.FacesException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;
import org.hibernate.exception.ConstraintViolationException;

public class JsfExceptionHandler extends ExceptionHandlerWrapper {



	public JsfExceptionHandler(ExceptionHandler wrapped) {
		super(wrapped);
	}

	@Override
	public void handle() throws FacesException {

		Iterator<ExceptionQueuedEvent> events = getUnhandledExceptionQueuedEvents().iterator();

		while (events.hasNext()) {
			ExceptionQueuedEvent event = events.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
			Throwable exception = context.getException();

			if (exception instanceof ConstraintViolationException) {
				try {
					
					redirect("/");

				} finally {
					events.remove();
				}
				
			}else if (exception instanceof FacesException) {
				
							
				try {
					System.out.println("faces erro");
					
					
					
					redirect("/");

				} finally {
					events.remove();
				}
				
				
			} else if (exception instanceof RuntimeException) {
				try {
					System.out.println("runtime erro");
					redirect("/");

				} finally {
					events.remove();
				}
			} else {

				getWrapped().handle();
			}

		}

	}

	private void redirect(String pagina) {

		try {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			String contextPath = externalContext.getRequestContextPath();
			externalContext.redirect(contextPath + pagina);
			facesContext.responseComplete();

		} catch (IOException e) {
			throw new FacesException(e);
		}

	}

}
