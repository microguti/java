package graficos;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	public MarcoImagen(){
		setTitle("Marco con Imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
	}
}

class LaminaConImagen extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
	}
}