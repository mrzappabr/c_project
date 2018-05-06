package br.com.mrzappa.c_project.util.exception;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class JsfExceptionHandlerFactory extends ExceptionHandlerFactory {

    public JsfExceptionHandlerFactory(ExceptionHandlerFactory wrapped) {
        super(wrapped);
    }

    @Override
    public ExceptionHandler getExceptionHandler() {
        ExceptionHandler parentHandler = getWrapped().getExceptionHandler();
        return new JsfExceptionHandler(parentHandler);
    }

}