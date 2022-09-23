package co.edu.poli.prototype1.model;

import java.util.*;

public class Book extends Item {

    
    private String ISBN;
    private String autor;
    private int año;
    private String publisher;
    private String titulo;
    private int[] numpag;

    
    
	public Book(String iSBN, String autor, int año, String publisher, String titulo, int[] numpag) {
		super();
		ISBN = iSBN;
		this.autor = autor;
		this.año = año;
		this.publisher = publisher;
		this.titulo = titulo;
		this.numpag = numpag;
	}
	
	private Book(Book b) {
    	this.ISBN = b.ISBN;
		this.autor = b.autor;
		this.año = b.año;
		this.publisher = b.publisher;
		this.titulo = b.titulo;
		this.numpag = b.numpag;
    }

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int[] getNumpag() {
		return numpag;
	}

	public void setNumpag(int[] numpag) {
		this.numpag = numpag;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", autor=" + autor + ", año=" + año + ", publisher=" + publisher + ", titulo="
				+ titulo + ", numpag=" + numpag + "]";
	}

	@Override
	public int goTo(int location) {
		return numpag [location];
		
	}

	@Override
	public Object cloneObj() {
		return new Book(this);
		
	}

	

	

}