package com.epam.edu.dao;

public interface Dao<E> {

	void persist(E entity);
	
	void merge(E entity);
	
    void remove(E entity);
    
    E findById(Long id);
	
}
