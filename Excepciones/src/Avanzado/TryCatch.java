package Avanzado;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TryCatch {

	public static void main(String[] args) {
		MarcoTexto1 mimarco=new MarcoTexto1();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto1 extends JFrame{
	public MarcoTexto1(){
		setBounds(600,300,600,350);
		LaminaTexto1 milamina=new LaminaTexto1();
		add(milamina);
		setVisible(true);
	}
}

class LaminaTexto1 extends JPanel{
	public LaminaTexto1(){
		
		//el objeto ImageIO lleva implicito el try catch
		try{
		imagen=ImageIO.read(new File("src/icono.gif"));
		}catch(IOException e){
			System.out.println("la imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g){
		
		//para evitar excepciones no comprobadas vamos a chequear que la imagen exista
		/*se puede tambier capturar solo la excepcion que nos va a generar
		 * public void paint Component(Graphics g) throws NullPointerException
		 * pondriamos el try al principio y catch(NullPointerException e) al final*/
		if (imagen==null){
			g.drawString("No podemos cargar la imagen", 10,10);
		}else{
		super.paintComponent(g);
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		g.drawImage(imagen, 0,0, null);
		for (int i=0;i<300;i++){		
			for (int j=0;j<200;j++){
				if(i+j>0){
					g.copyArea(0,0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);			
			}
		}
		}
		}
	}
	//la variable de clase se declara pero no esta inicializada
	private Image imagen;
}
