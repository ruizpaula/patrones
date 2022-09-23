package co.edu.poli.prototype1.model;

import java.util.*;

/**
 * 
 */
public class Movie extends Item {

    private String titulo;
    private int estreno;
    private String direcctor;
    private String productor;
    private int[] numframes;
    private String pais;

    private  Movie(Movie m) {
    	this.titulo = m.titulo;
		this.estreno = m.estreno;
		this.direcctor = m.direcctor;
		this.productor = m.productor;
		this.numframes = m.numframes;
		this.pais = m.pais;
    }

	public Movie(String titulo, int estreno, String direcctor, String productor, int[] numframes, String pais) {
		super();
		this.titulo = titulo;
		this.estreno = estreno;
		this.direcctor = direcctor;
		this.productor = productor;
		this.numframes = numframes;
		this.pais = pais;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}

	public String getDirecctor() {
		return direcctor;
	}

	public void setDirecctor(String direcctor) {
		this.direcctor = direcctor;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public int[] getNumframes() {
		return numframes;
	}

	public void setNumframes(int[] numframes) {
		this.numframes = numframes;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Movie [titulo=" + titulo + ", estreno=" + estreno + ", direcctor=" + direcctor + ", productor="
				+ productor + ", numframes=" + numframes + ", pais=" + pais + "]";
	}

	@Override
	public int goTo(int location) {
		return numframes [location];
	}

	@Override
	public Object cloneObj() {
		return new Movie(this);
	}

	

}