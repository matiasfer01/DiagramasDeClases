package ivmatisfilesorter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JScrollPane;

import ivmatisfilesorter.dominio.Archivo;

public class DialogoBusquedaArchivos extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JList <String>listaDeEtiquetasdisponibles;
	private JScrollPane scrollpaneEtiquetasDisponibleVertical;
	
	private JList<String> listadoDeEtiquetasSeleccionadas;
	private JScrollPane scrollpaneEtiquetasSeleccionadasHorizontal;
	
	
	private JList<String> listaDeArchivo;
	private JScrollPane scrollpaneArchivoVertical;
	private JScrollPane scrollpaneArchivoHorizontal;
	
	private JButton agregar;
	private JButton buscar;
	private JButton quitar;
	private JButton abrirArchivo;
	private JButton aceptar;
	private JButton exportar;
	
	// modeles
	private DefaultListModel<String> listaEtiquetaDisponibleModel = new DefaultListModel<>();
	private DefaultListModel<String> listaEtiquetaSeleccionadaModel = new DefaultListModel<>();
	private DefaultListModel<String> listaArchivoMolde = new DefaultListModel<>();

	private Archivo listaArchivos[];

	public Archivo[] getListaEtiquetas() {
		return listaArchivos;
	}

	public void setListaEtiquetas(Archivo[] listaEtiquetas) {
		this.listaArchivos = listaArchivos;
	}

	public void metodoAgregar() {

	}

	public void metodoBuscar() {

	}

	public void metodoQuitar() {

	}

	public void metodoAbrir() {

	}

	public void metodoAceptar() {

	}

	public void metodoExportar() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
