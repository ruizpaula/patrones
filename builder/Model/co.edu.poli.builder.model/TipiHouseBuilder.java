package co.edu.poli.builder.model;

import java.util.*;

/**
 * 
 */
public class TipiHouseBuilder implements HouseBuilder {

    /**
     * Default constructor
     */
    public TipiHouseBuilder() {
    	//objeto actual NUEVA casa
    	this.house = new House();
    }

    /**
     * 
     */
    private House house;

    /**
     * metodo para  acceder  a los metodos del objeto NUEVA casa de la clase construir casa tipi
     */
    public void buildBasement() {
        house.setBasement("Postes de madera");
    }

    /**
     * 
     */
    public void buildStructure() {
        house.setBasement("Madera y Hielo");
    }

    /**
     * 
     */
    public void buildRoof() {
        house.setRoof("Madera, caribú y pieles de foca");
    }

    /**
     * 
     */
    public void buildInterior() {
       house.setInterior("Madera de fuego");
    }

    /**
     * @return
     */
    public House getHouse() {
    	//retorna la casa actual
        return this.house;
    }

}