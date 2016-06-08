package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class ClasesInternasLocales {

	public static void main(String[] args) {
		
		Reloj1 mireloj=new Reloj1();
		mireloj.enMarcha(1000, true);
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para continuar");
		System.exit(0);
	}

}

class Reloj1{
	
	
	public void enMarcha(int intervalo, final boolean sonido){
		//Las clases internas local no pueden tener el modificador privado
		class DameLahora2 implements ActionListener{
					public void actionPerformed(ActionEvent evento){
						Date ahora=new Date();
						System.out.println("Hora actualizada cada 3sg: "+ ahora);
						
				/*La ventaja de utilizar clases internas es que estamos utilizando una variable externa a la clase que esta
				 * encapsulada, se podria hacer sin clases internas pero tendriamos que crear los setter y getters*/
						if(sonido){
							Toolkit.getDefaultToolkit().beep();
						}
					}
				}
		ActionListener oyente=new DameLahora2();
		Timer mitemporizador=new Timer(intervalo, oyente);
		mitemporizador.start();
		

	}
	
	
		
}

