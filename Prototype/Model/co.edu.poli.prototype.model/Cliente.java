package co.edu.poli.prototype1.model;

import java.util.*;

/**
 * 
 */
public class Cliente {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     * @param String arg [ ]
     */
    public static void main( String arg [ ]) {
        Book b = new Book("ABC111", "Gabriel García Marquéz", 2010, "Oveja Negra", "La Hojarasca", new int[120]);
        System.out.println(b);

		Book cloneBook = (Book)b.cloneObj();

		cloneBook.setISBN("XYZ999");
		cloneBook.setAño(2021);
		System.out.println("Objeto clonado Book : " + cloneBook);
		
		
		Movie m = new Movie("AVATAR", 22092022, "James "," Cameron", new int[1],"Estados Unidos" );
        System.out.println(m);

        Movie cloneMovie = (Movie) m.cloneObj();

        cloneMovie.setNumframes(new int[4]);
        cloneMovie.setProductor("John Refoua");
		System.out.println("Objeto clonado Movie : " + cloneMovie);
		
    }
    
    

}