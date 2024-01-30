package ivmatisfilesorter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import ivmatisfilesorter.dominio.Archivo;

public class DialogoGestionArchivo extends JDialog implements ActionListener {

	private JList<String> listaDeArchivos;
	private JScrollPane scrollpaneArchivo;
	private JTextField ruta;
	private JComboBox<String> etiquetas;
	private JList<String> listaEtiquetas;
	private JScrollPane scrollpaneEtiquetas;

	// botones del dialogo
	private JButton selecccionarArchivo;
	private JButton agregar;
	private JButton quitar;
	private JButton aplicar;
	private JButton modificar;
	private JButton eliminar;
	private JButton cancelar;

	/* medelos de las listas de archivo */
	private DefaultListModel<String> archivoListModel = new DefaultListModel<>();
	private DefaultListModel<String> etiquetasListModel = new DefaultListModel<>();
	private DefaultComboBoxModel<String> etiquetasComboBoxModel = new DefaultComboBoxModel<>();

	private Archivo listaArchivo[];

	public Archivo[] getListaEtiquetas() {
		return listaArchivo;
	}

	public void setListaEtiquetas(Archivo[] listaEtiquetas) {
		this.listaArchivo = listaArchivo;
	}

	public void metodoSeleccionarArchivo() {

	}

	public void metodoAgregar() {

	}

	public void metodoQuitar() {

	}

	public void metodoAplicar() {

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
