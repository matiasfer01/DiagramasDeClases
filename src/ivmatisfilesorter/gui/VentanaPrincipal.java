package ivmatisfilesorter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import ivmatisfilesorter.utilerias.MiFocusTraversalPolicy;

public class VentanaPrincipal extends JFrame implements ActionListener, WindowListener {
	// Proyecto
	private JMenu proyecto;
	private JMenuItem crearProyecto;
	private JMenuItem AbrirProyecto;
	private JMenuItem propiedadesDelProyecto;
	private JMenuItem salir;
	// Gestion del Proyecto
	private JMenu gestionDelProyecto;
	private JMenuItem gestionDeArchivos;
	private JMenuItem gestionDeEtiquetas;
	private JMenuItem busquedaDeArchivos;
	// Ayuda
	private JMenu ayuda;
	private JMenuItem acercaDe;
	private JMenuItem manualDeUsuario;

	// Constructor de la clase
	public VentanaPrincipal() {
		// TODO Auto-generated constructor stub

	}

	// Resto de tus métodos y overrides aquí...

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
