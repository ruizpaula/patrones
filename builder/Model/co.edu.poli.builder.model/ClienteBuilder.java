package co.edu.poli.builder.model;

import java.util.*;

/**
 * 
 */
public class ClienteBuilder {

    /**
     * Default constructor
     */
    public ClienteBuilder() {
    }

    /**
     * @param arg
     * colocar [] en UML
     */
    public static void main(String[] arg) {
        // quiero que mi casa sea igloo asi que creo un nuevo objeto para crear una nueva casa
    	
    	HouseBuilder iglooBuilder = new IglooHouseBuilder();
    	HouseBuilder tipiBuilder = new TipiHouseBuilder();
    	
    	
    	//LE DICE AL INGENIERO CIVIL QUE TIPO DE CASA QUIERO CONSTRUIR
    	//usando el construirtor de ingeniero civil que casa quiere construir
    	
    	//se elije construir igloo y le paso el objeto iglooBuilder
        CivilEngineer ingenierocivil = new CivilEngineer(iglooBuilder);
        
        CivilEngineer otroingenierocivil = new CivilEngineer(tipiBuilder);
        
        
        //llama a los metodos de houseBuilder
        //cosas que necesito para construir la casa
        ingenierocivil.constructHouse();
        
        otroingenierocivil.constructHouse();
        
        //llama el metodo obtener casa de houseBuilder
        House casa1 = ingenierocivil.getHouse();
        
        House casa2 = otroingenierocivil.getHouse();
        
        
        System.out.println("Casa construida: "+ casa1);
        
        System.out.println("Casa construida: "+ casa2);
    }

}