package br.com.mrzappa.c_project.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

	private EntityManagerFactory factory;

	public EntityManagerProducer() {
		
		factory = Persistence.createEntityManagerFactory("bluecondoPU");
	}
	
	@Produces @RequestScoped
	public EntityManager createEntityManager() {
		return factory.createEntityManager();
		
	}
	
	public void closeEntitymanager(@Disposes EntityManager em) {
		em.close();
		
	}

}
