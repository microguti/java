package graficos;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion mimarco=new MarcoAccion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("termine");
	}

}

class MarcoAccion extends JFrame{
	public MarcoAccion(){
		setTitle("Prueba Acciones");
		setVisible(true);
		setBounds(600,600,600,600);
		PanelAccion lamina=new PanelAccion();
		add(lamina);
	}
	
	
}

class PanelAccion extends JPanel{
	public PanelAccion(){
		
		//instanciamos la clase oyente para los tres botones. Oyente fuente de evento
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/icono.gif"), Color.yellow);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/icono.gif"), Color.red);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/icono.gif"), Color.blue);
	
		/*JButton botonAmarillo=new JButton(accionAmarillo);
		add(botonAmarillo);*/
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		/*	JButton botonAmarillo=new JButton("Amarillo");
		JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		//1ª creamos el mapa de entrada
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//metodo que devuelve objeto InputMap
		
		
		//2ª creamos la combinacion de teclas. 
		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclaRoja=KeyStroke.getKeyStroke("ctrl R");
		
		//3º Asigna la combinacion de teclado con un objeto que creamos.
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		mapaEntrada.put(teclaAzul, "fondo_azul");
		mapaEntrada.put(teclaRoja, "fondo_rojo");
		
		//4º crear un mapa de accion. 
		ActionMap mapaAction=getActionMap();
		//Vincula el objeto creado con el vinculo de la acción.
		mapaAction.put("fondo_amarillo", accionAmarillo);
		mapaAction.put("fondo_azul", accionAzul);
		mapaAction.put("fondo_rojo", accionRojo);
	
	}
	
	//Podemos poner la lamina a la escucha creando una clase con la interface action o herede de AbastratcAction

	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_boton){
			//al instanciar la clase AccionColor al pasar new name lo guardara par clave:valor
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+nombre);
			putValue("color_de_fondo", color_boton); //generamos nosotros la clave:valor
			
		}

		public void actionPerformed(ActionEvent e){
			Color c=(Color) getValue("color_de_fondo");
			setBackground(c);//No conoce el metodo porque es de JPanel. habra que convertir la clase en interna y encapsularla
			System.out.println("Nombre: "+ getValue(Action.NAME)+ " Descripcion "+getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
	
}

