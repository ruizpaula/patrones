package co.edu.poli.Singleton.model;


import java.util.*;

/**
 * 
 */
public class Singleton {

    /**
     * Default constructor
     */
    private Singleton() {
    }

    /**
     * 
     */
    private static Singleton instance;

    /**
     * @return
     */
    public static Singleton getInstance() {
        if(Singleton.instance == null) {
        	Singleton.instance = new Singleton();
        }
        return instance;
    }
    public String conn(String u) {
    	u = "Coneccion : "+ instance;
        return u;
    }

}