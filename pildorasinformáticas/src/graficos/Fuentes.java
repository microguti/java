package graficos;
import java.awt.GraphicsEnvironment;
import javax.swing.*;
public class Fuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuente=false;
		String [] nombresdefuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String nombredelafuente: nombresdefuentes){
			if (nombredelafuente.equals(fuente)){
				estalafuente=true;
				System.out.println("Fuente instalada");
			}
					
		}
	}

}
