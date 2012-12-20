package com.epam.edu.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import com.epam.edu.dao.BookDao;
import com.epam.edu.db.Book;
import com.epam.edu.services.BooksCatalogBean;

/**
 * Servlet implementation class BooksServlet
 */
@WebServlet("/Books")
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	BooksCatalogBean booksCatalog;
	
	@EJB
	BookDao booker;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();		
		
		for (Book book : booksCatalog.fetchBooksByPage(1)) {
			out.print(book.getName() + "<br />");
		}
						
		out.print("Total books count:" + booksCatalog.getBooksCount());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
