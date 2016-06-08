package Avanzado;
import javax.swing.*;


public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mi_matriz=new int[5];
		mi_matriz [0]=5;
		mi_matriz [0]=8;
		mi_matriz [0]=35;
		mi_matriz [0]=56;
		mi_matriz [0]=6;
		for(int i=0;i<5;i++){
			System.out.println("Poscion " + i + " = "+ mi_matriz[i]);
		}
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre ");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce Edad"));
		System.out.println("Hola " + nombre +" Tienes "+ edad +" años.");
			
	}

}
