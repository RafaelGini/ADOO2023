package modelo;

import java.util.*;

public class Ejemplar extends Libro implements SistemaExternoAdapter {

	public Ejemplar() {
	}

	private Integer id;

	private String titulo;

	private Date fechaPublicacion;

	private String autor;

	private boolean disponible;

	private SistemaExternoAdapter adaptadorUbicacion;

	private Categoria categoria;



	public Integer getPlazoPrestamo() {
		return null;
	}

	public void setPlazoPrestamo(int plazo) {
	}


	public String getUbicacionFisica() {
		// TODO implement here
		return "";
	}

	public boolean isDisponible() {
		// TODO implement here
		return false;
	}

	public String getUbicacionFisica(Ejemplar ejemplar) {
		// TODO implement here
		return "";
	}

}
