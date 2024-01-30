package ivmatisfilesorter.dominio;

import java.util.ArrayList;
import java.util.Date;

import ivmatisfilesorter.exception.ProyectoException;

public class Proyecto extends Exception {

	private String nombreProyecto;
	private String nombrePropietario;
	private String descripcion;
	private Date fechaCreacion;
	private Archivo listaArchivo;
	private Etiqueta listaEtiqueta;

	public Proyecto() {

	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto)  throws ProyectoException {
		this.nombreProyecto = nombreProyecto;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario)  throws ProyectoException{
		this.nombrePropietario = nombrePropietario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion)  throws ProyectoException{
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion)  throws ProyectoException{
		this.fechaCreacion = fechaCreacion;
	}

	public void consultarProyecto() {

	}

	public void crearProyecto() {

	}

	public void modificarProyecto() {

	}

}
