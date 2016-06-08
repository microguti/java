package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj(1000, true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para continuar");
		System.exit(0);
	}

}

class Reloj{
	public Reloj(int intervalo, boolean sonido){
	this.intervalo=intervalo;
	this.sonido=sonido;
	
	}
	
	public void enMarcha(){
		ActionListener oyente=new DameLahora2();
		Timer mitemporizador=new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	//Las clases internas pueden tener el modificador privado
	private class DameLahora2 implements ActionListener{
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
	
}

