package graficos;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco=new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("termine");
	}

}

class MarcoFoco extends JFrame{
	public MarcoFoco(){
		setVisible(true);
		setBounds(600,600,1000,1500);
		add(new LaminaFoco());
	}
	
	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setLayout(null);
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elFoco=new LanzaFocos();
		cuadro1.addFocusListener(elFoco);
		
	}
	//Vamos a necesitar en el futuro a estas variables fuera de paintComponet
			JTextField cuadro1;
			JTextField cuadro2;
	//Creamos la clase interna para poder acceder a los textos
	private class LanzaFocos implements FocusListener{

		public void focusGained(FocusEvent e) {
			System.out.println("No estas aqui");
		}

		public void focusLost(FocusEvent e) {
			System.out.println("has perdido el foco");
			String email=cuadro1.getText();
			boolean comprobacion=false;
			for(int i=0;i<email.length();i++){
				if(email.charAt(i)=='@'){
					comprobacion=true;
				}
			}
			if(comprobacion){
				System.out.println("Correcto");
			}else{
				System.out.println("Incorrecto");
			}
			
		}
		
	}
	
	
}

