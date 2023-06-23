
import java.util.*;

public class Socio {

	public Socio() {
	}

	private String nombre;

	private String apellido;

	private Integer dni;

	private String mail;

	private Integer telefono;

	public List<Prestamo> prestamos;

	private List<int> idsDePrestamos;

	private IEstadoConducta estado;

	private Integer prestamosRealizados;

	private Integer diasPenalizacion;

	private Boolean suspendido;

	private Integer diasBonificacion;

	private MedioComunicacion medioCom;













	public int calcularModificacionPlazo() {
		// TODO implement here
		return 0;
	}

	public int calcularModificacionPlazo() {
		// TODO implement here
		return 0;
	}

	public void setEstado(IEstadoConducta estado) {
		// TODO implement here
		return null;
	}

	public List<Prestamo> getUltimosPrestamos(int cantidad) {
		// TODO implement here
		return null;
	}

	public void setPrestamosRealizados() {
		// TODO implement here
		return null;
	}

	public void altaSocio() {
		// TODO implement here
		return null;
	}

	public void penalizarSocio(int dias) {
		// TODO implement here
		return null;
	}

	public void bonificarSocio(int dias) {
		// TODO implement here
		return null;
	}

	private void suspender(Boolean bool) {
		// TODO implement here
		return null;
	}

}