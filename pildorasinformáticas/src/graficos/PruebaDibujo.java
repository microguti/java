package graficos;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos mimarco=new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos(){
		setTitle("Prueba de Dibujo");
		setSize(400,400);
		LaminaConFiguras milamina=new LaminaConFiguras();
		//el metodo add a partir de 5.0
		add(milamina);
		milamina.setBackground(SystemColor.window.pink);
	}
}

class LaminaConFiguras extends JPanel{
	//necesitamos un objeto de tipo graphics
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawRect(50, 50, 200, 200);
		g.drawLine(30, 30, 60, 60);
		
		/*La biblioteca Java 2D, permite operaciones mas complejas
		para crear un objeto graphics2d tenemos que castear, refundicion el objeto de g a Graphics 2D
		la clase Rectangle2D.Double hereda de la clase Rectangle2D*/
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(0,140,58).brighter());
		g2.fill(elipse);
		g2.draw(new Line2D.Double(100,100,200.50,150));
		
		double CentroenX=rectangulo.getCenterX();
		double CentroenY=rectangulo.getCenterY();
		double radio=150;
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		
	}
}