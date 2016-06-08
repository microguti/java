package Avanzado;

import java.util.*;

import javax.swing.*;

public class Areas_Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo ");
		
		try{
		figura=entrada.nextInt();
		}catch(Exception e){
		System.out.println("Se ha producido un error");
		}finally{
		entrada.close();
		}
		
		switch (figura){
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			System.out.println(Math.pow(lado,2));
			System.out.println("El area del cuadrado es");
			break;
		case 2:	
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es");
			System.out.println(base*altura);
			break;
		case 3:
			int base1=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura1=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo es");
			System.out.println(base1*altura1/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce la radio"));
			System.out.println("El area del cirulo es");
			System.out.println(Math.PI*(Math.pow(radio,2)));
			break;
		
		}
		
//--------------------------------------------------------------------------------------------
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		System.out.println("Tu peso ideal si eres hombre es: " + (altura-110));
		System.out.println("Tu peso ideal si eres mujer es: " + (altura-120));
	}
	static int figura;
	
}
