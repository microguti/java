package graficos;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	public MarcoImagen(){
		setTitle("Prueba con fuentes");
		setSize(400,400);
		LaminaConFuentes milamina=new LaminaConFuentes();
		add(milamina);
		milamina.setForeground(Color.BLUE);
		
	}
}

class LaminaConFuentes extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D) g;
		Font mifuente=new Font("Courier", Font.BOLD, 26);
		g2.setFont(mifuente);
		g2.drawString("Jose", 100, 100);
		
	}
}