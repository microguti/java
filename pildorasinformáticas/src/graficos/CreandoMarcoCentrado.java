package graficos;
import java.awt.*;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado miMarco=new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	public MarcoCentrado(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamañoPantalla = mipantalla.getScreenSize();
		int alturaPantalla=tamañoPantalla.height;
		int anchoPantalla=tamañoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("marcoCentrado");
		Image miIcono=mipantalla.getImage("src/graficos/icono");
		setIconImage(miIcono);
	}
}