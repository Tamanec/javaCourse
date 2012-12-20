package com.epam.edu.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.epam.edu.db.Book;

/**
 * Session Bean implementation class LibraryBean
 */
@Stateless
@LocalBean
public class BooksCatalogBean {
	
	@PersistenceContext
	private EntityManager em;

	private int booksPerPage = 8;
	    
    public BooksCatalogBean() {
    }
    
    public List<Book> fetchBooksByPage(int page) {
    	Query query = em.createNamedQuery("fetchBooksByPage");
    	
    	if (page < 1) {
    		page = 1;
    	}
    	
    	// Номер первой книги
    	int firstBookNumber = page * booksPerPage - booksPerPage;
    	
    	// Устанавливаем ограничения для постраничной выборки
    	query.setFirstResult(firstBookNumber);
    	query.setMaxResults(booksPerPage);
    	
    	return query.getResultList();
    }
    
    public int getBooksCount() {
    	Query query = em.createNamedQuery("getBooksCount");
    	
    	return ((Long) query.getSingleResult()).intValue(); 
    }

}
