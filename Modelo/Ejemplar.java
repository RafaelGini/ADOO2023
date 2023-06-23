
import java.util.*;

public abstract class Ejemplar extends Libro implements SistemaExternoAdapter {

	public Ejemplar() {
	}

	private Integer id;

	private String titulo;

	private Date fechaPublicacion;

	private String autor;

	private boolean disponible;

	private SistemaExternoAdapter adaptadorUbicacion;

	private void categoria;







	public abstract int getPlazoPrestamo();

	public abstract void setPlazoPrestamo(int plazo);

	public abstract void setPlazoPrestamo(int plazo);

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