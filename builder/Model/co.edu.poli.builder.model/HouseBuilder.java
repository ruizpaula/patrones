package co.edu.poli.builder.model;

import java.util.*;

/**
 * 
 */
public interface HouseBuilder {

    /**
     * 
     */
    public void buildBasement();

    /**
     * 
     */
    public void buildStructure();

    /**
     * 
     */
    public void buildRoof();

    /**
     * 
     */
    public void buildInterior();

    /**
     * @return
     */
    public House getHouse();

}