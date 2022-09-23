package co.edu.poli.builder.model;

import java.util.*;

/**
 * 
 */
public class House implements HousePlan {

    /**
     * Default constructor
     */
    public House() {
    }

    /**
     * 
     */
    private String basement;

    /**
     * 
     */
    private String structure;

    /**
     * 
     */
    private String roof;

    /**
     * 
     */
    private String interior;

    /**
     * @param basement
     */
    public void setBasement(String basement) {
    	this.basement = basement;
    }

    /**
     * @param structure
     */
    public void setStructure(String structure) {
    	 this.structure = structure;
    }

    /**
     * @param roof
     */
    public void setRoof(String roof) {
    	 this.roof = roof;
    }

    /**
     * @param interior
     */
    public void setInterior(String interior) {
    	 this.interior = interior;
    }

	@Override
	public String toString() {
		return "Casa planeada con  [sotano = " + basement + ", "
				+ "estructura = " + structure + ", "
				+ "techo = " + roof + ","
				+ " interior = " + interior
				+ ", clase = " + getClass() + "]";
	}

}