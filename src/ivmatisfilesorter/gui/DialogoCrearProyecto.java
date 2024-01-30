package ivmatisfilesorter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import ivmatisfilesorter.dominio.Proyecto;

public class DialogoCrearProyecto extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField nombreProyecto;
	private JTextField propitario;
	private JDateChooser fechaDeCreacion;
	private JTextField descripcion;

	private JButton guardar;
	private JButton cancelar;

	private Proyecto listaProyecto[];

	public Proyecto[] getListaEtiquetas() {
		return listaProyecto;
	}

	public void setListaEtiquetas(Proyecto[] listaEtiquetas) {
		this.listaProyecto = listaProyecto;
	}

	public void metodoGuardar() {

	}

	public void metodoCancelar() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
