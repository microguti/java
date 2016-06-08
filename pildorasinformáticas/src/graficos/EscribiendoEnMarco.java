package graficos;
import java.awt.*;
import javax.swing.*;
public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto mimarco=new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTexto extends JFrame{
	public MarcoConTexto(){
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Primer Texto");
		Lamina miLamina=new Lamina();
		add(miLamina);
		
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g){
		//Tenemos que invocar a PaintComponent de la clase JComponent
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo SWing", 100, 100);
	}
}