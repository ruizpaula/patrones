package co.edu.poli.Singleton.model;


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
     * @param arg
     * Singleton = una unica isntancia
     */
    public static void main(String arg []) {
    	Singleton objt1 = Singleton.getInstance();
    	Singleton objt2 = Singleton.getInstance();
    	System.out.println(objt1.conn("Hola 1"));
    	System.out.println(objt2.conn("Hola 2"));
    }

}