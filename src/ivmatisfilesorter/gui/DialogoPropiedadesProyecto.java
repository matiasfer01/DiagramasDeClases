package ivmatisfilesorter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;

import ivmatisfilesorter.dominio.Proyecto;

public class DialogoPropiedadesProyecto extends JDialog implements ActionListener {
	
	private String nombreProyecto;
	private String propiedades;
	private Date fechaDeCreacion;
	private String descripcion;

	private JButton editar;
	private JButton guardar;
	private JButton cancelar;
	private JButton nuevaEtiqueta;
	private Proyecto listaProyecto[];

	public Proyecto[] getListaEtiquetas() {
		return listaProyecto;
	}

	public void setListaEtiquetas(Proyecto[] listaEtiquetas) {
		this.listaProyecto = listaProyecto;
	}

	public void metodoEditar() {

	}

	public void metodoGuardar() {

	}

	public void metodoCancelar() {

	}

	public void metodoNuevoEtiqueta() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
