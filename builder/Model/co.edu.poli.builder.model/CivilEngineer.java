package co.edu.poli.builder.model;

import java.util.*;

/**
 * 
 */
public class CivilEngineer {

    /**
     * Default constructor con parametro tipo interface houseBuilder
     */
    public CivilEngineer(HouseBuilder houseBuilder) {
    	//objeto actual interface houseBuilder
    	this.houseBuilder =  houseBuilder;
    }

    /**
     * atributo tipo interface houseBuilder
     */
    private HouseBuilder houseBuilder;

    /**
     * @param houseBuilder
     * se agrego constructor en el DIAGRAMA UML con parametro interface houseBuilder
     */
//    public void CivilEngineer(HouseBuilder houseBuilder) {
//        // TODO implement here
//    }

    
    /**
     * trabajo con el objeto actual interface houseBuilder y sus metodos
     */
    public void constructHouse() {
        
    	this.houseBuilder.buildBasement();
    	this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }

    
    /**
     * @return
     * retorna el objeto actual si es construir tipi o igloo
     */
    public House getHouse() {
    	//metodo que retorna de la interface housebuilder el metodo gethouse() que es de tipo House
        return houseBuilder.getHouse();
    }

    
}