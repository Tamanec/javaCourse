package com.epam.edu.db;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the books database table.
 * 
 */
@Entity
@Table(name="books")
@NamedQueries({
	@NamedQuery(
		name  = "fetchBooksByPage",
		query = "select b from Book b"
	),
	@NamedQuery(
		name  = "getBooksCount",
		query = "select count(b) from Book b"
	)
})
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String author;

	private String genre;

	private String name;
	
	private String cover;
	
	private int year;
	
	private int pagesCount;
	
	private Long cost;

	public Book() {}
		
	public Book(String author, String genre, String name, String cover,	int year, int pagesCount, Long cost) {		
		this.author = author;
		this.genre = genre;
		this.name = name;
		this.cover = cover;
		this.year = year;
		this.pagesCount = pagesCount;
		this.cost = cost;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPagesCount() {
		return pagesCount;
	}

	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

}