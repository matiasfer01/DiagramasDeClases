package ivmatisfilesorter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import ivmatisfilesorter.dominio.Etiqueta;

public class DialogoGestionEtiqueta extends JDialog implements ActionListener {

	private JTextField etiqueta;
	private JList<String> listaEtiquetas;
	private JScrollPane scrollpaneEtiquetas;

	private JButton nuevo;
	private JButton guardar;
	private JButton modificar;
	private JButton eliminar;
	private JButton cancelar;
	private Etiqueta listaEtiqueta[];

	/* moldes de las listas */
	private DefaultListModel<String> listasEtiquetasModel = new DefaultListModel<>();

	public void metodoNuevo() {

	}

	public void metodoGuardar() {

	}

	public void metodoModificar() {

	}

	public void metodoEliminar() {

	}

	public void metodoCancelar() {

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
