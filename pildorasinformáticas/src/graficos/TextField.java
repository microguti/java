package graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class TextField {

	public static void main(String[] args) {
		MarcoTexto2 mimarco=new MarcoTexto2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoTexto2 extends JFrame{
	public MarcoTexto2(){
		setBounds(600,300,600,350);
		LaminaTexto2 milamina=new LaminaTexto2();
		add(milamina);
		setVisible(true);
	}
}

class LaminaTexto2 extends JPanel{
	public LaminaTexto2(){
		JTextField micampo = new JTextField("no lo veo", 20);
		add(micampo);
		EscuchaTexto evento=new EscuchaTexto();
		Document midoc = micampo.getDocument();
		midoc.addDocumentListener(evento);
		
	}
	private class EscuchaTexto implements DocumentListener{

		
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has insertado texto");
			
		}

	
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado texto");
			
		}

	
		public void changedUpdate(DocumentEvent e) {
			
			
		}
		
	}
}
