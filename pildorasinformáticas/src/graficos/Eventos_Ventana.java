package graficos;
import javax.swing.*;
import java.awt.event.*;//paquete de eventos


public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mimarco=new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(300,300,400,340);
		MarcoVentana mimarco2=new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco2.setTitle("ventana 2");
		mimarco2.setBounds(900,300,400,340);
	}

}

class MarcoVentana extends JFrame{
	public MarcoVentana(){
		setVisible(true);
		
		/*M_Ventana oyente_ventana=new M_Ventana();
		Ponemos a nuestra ventana a la escucha de cualquier evento
		addWindowListener(oyente_ventana); */
		addWindowListener(new M_Ventana());
		
	}
}

/*Gracias a las clases adaptadores se simplifica mucho mas el codigo*/
class M_Ventana extends WindowAdapter{
	public void windowIconified(WindowEvent e){
		System.out.println("Ventana minimizada");
	}
	public void windowOpened(WindowEvent e){
		System.out.println("Ventana abierta");
	}
}
/* Esta es la forma de implementar la interface con todos los metodos
class M_Ventana implements WindowListener{
	public void windowActivated(WindowEvent e){
		System.out.println("Ventana Activada");
	}
	public void windowClosed(WindowEvent e){
		System.out.println("Cerrando Ventana");
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("Ventana desactivada");
	}
	public void windowClosing(WindowEvent e){
		System.out.println("Cerrando Ventana");
	}
	public void windowDeiconified(WindowEvent e){
		System.out.println("Ventana restaurada");
	}
	public void windowIconified(WindowEvent e){
		System.out.println("Ventana minimizada");
	}
	public void windowOpened(WindowEvent e){
		System.out.println("Ventana abierta");
	}
}*/