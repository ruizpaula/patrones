package co.edu.poli.builder.model;

import java.util.*;

/**
 * 
 */
public class IglooHouseBuilder implements HouseBuilder {

    /**
     * Default constructor
     */
    public IglooHouseBuilder() {
    	//objeto actual casa igloo
    	this.house = new House();
    }

    /**
     * 
     */
    private  House house;

    /**
     * UML genero constructor void ya que se agrego como metodo en el diagrama
     */
//    public void IglooHouseBuilder() {
//    	
//    }

    /**
     * metodo para  acceder  a los metodos del objeto casa de la clase  construir casa igloo
     */
    public void buildBasement() {
        house.setBasement("bloques de hielo");
    }

    /**
     * 
     */
    public void buildStructure() {
        house.setStructure("bloques de hielo");
    }

    /**
     * 
     */
    public void buildRoof() {
        house.setRoof("tallas de hielo");
    }

    /**
     * 
     */
    public void buildInterior() {
        house.setInterior("cúpula de hielo");
    }

    /**
     * @return
     */
    public House getHouse() {
    	//retorna el objeto actual casa
    	return this.house;
    }

	@Override
	public String toString() {
		return "IglooHouseBuilder [casa Igloo =" + house + "]";
	}

}