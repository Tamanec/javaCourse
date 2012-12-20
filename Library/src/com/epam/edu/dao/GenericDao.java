package com.epam.edu.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDao<E> implements Dao<E> {

	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public void persist(E entity) {
		em.persist(entity);		
	}
	
	@Override
	public void merge(E entity) {
		em.merge(entity);		
	}

	@Override
	public void remove(E entity) {
		em.remove(entity);		
	}

	@Override
	public abstract E findById(Long id);
	
}
