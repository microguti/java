package graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;


public class CampoContraseña {

	public static void main(String[] args) {
		MarTexto mimarco=new MarTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarTexto extends JFrame{
	public MarTexto(){
		setBounds(600,300,600,350);
		LaminaText milamina=new LaminaText();
		add(milamina);
		setVisible(true);
	}
}

class LaminaText extends JPanel{
	public LaminaText(){
		
		setLayout(new BorderLayout());
		JPanel lamina_superior=new JPanel();
		lamina_superior.setLayout(new GridLayout(2,2));
		add(lamina_superior, BorderLayout.NORTH);
		
		JLabel etiqueta1=new JLabel("Usuario");
		JLabel etiqueta2=new JLabel("Contraseña");
		JTextField c_usuario = new JTextField(15);
		
		Comprueba_pass mievento=new Comprueba_pass();
		c_contra=new JPasswordField(15);
		c_contra.getDocument().addDocumentListener(mievento);
		
		lamina_superior.add(etiqueta1);
		lamina_superior.add(c_usuario);
		lamina_superior.add(etiqueta2);
		lamina_superior.add(c_contra);
		
		JButton enviar=new JButton("Enviar");
		add(enviar, BorderLayout.SOUTH);
		
	}
	
	private class Comprueba_pass implements DocumentListener{

	
		public void insertUpdate(DocumentEvent e) {
			
			char[] pass;
			pass=c_contra.getPassword();
			if(pass.length<8 || pass.length>12){
				c_contra.setBackground(Color.red);
			} else{
				c_contra.setBackground(Color.green);
			}
		}

		
		public void removeUpdate(DocumentEvent e) {
			char[] pass;
			pass=c_contra.getPassword();
			if(pass.length<8 || pass.length>12){
				c_contra.setBackground(Color.red);
			} else{
				c_contra.setBackground(Color.green);
			}
			
		}

		
		public void changedUpdate(DocumentEvent e) {
			
			
		}
		
	}
	JPasswordField c_contra;
}
