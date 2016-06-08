package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;


public class MarcoImagen1 {

	public static void main(String[] args) {
		Marcodeimagen mimarco=new Marcodeimagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marcodeimagen extends JFrame{
	public Marcodeimagen(){
		setTitle("Marco con Imagen");
		setBounds(750,300,300,200);
		Laminaconimagen1 milamina=new Laminaconimagen1();
		add(milamina);
		
	}
}

class Laminaconimagen1 extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//File miimagen=new File("src/graficos/icono.gif");
		
		try{
			//imagen=ImageIO.read(miimagen);
			imagen=ImageIO.read(new File("src/graficos/iconos.gif"));
		}
		catch(IOException e){
			System.out.println("Imagen not found");
		}
		g.drawImage(imagen, 5,5,null);
	}
	private Image imagen;
	
}