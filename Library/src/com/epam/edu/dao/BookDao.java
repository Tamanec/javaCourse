package com.epam.edu.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.epam.edu.db.Book;

/**
 * Session Bean implementation class BookDao
 */
@Stateless
@LocalBean
public class BookDao extends GenericDao<Book> {

    /**
     * Default constructor. 
     */
    public BookDao() {}

	@Override
	public Book findById(Long id) {
		return em.find(Book.class, id);
	}

}
