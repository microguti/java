package pildorasinformáticas;
import javax.swing.*;
import java.util.*;

public class Areas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Círulo");
		int figura=entrada.nextInt();
		
		switch(figura){
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
			System.out.println("El área del cuadrado es: "+Math.pow(lado,2));
			break;
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce un base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce un altura"));
			System.out.println("El area del rectangulo es: "+ base*altura);
			break;
		case 3:
			int base1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un base"));
			int altura1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un altura"));
			System.out.println("El area del triangulo es: "+ (base1*altura1)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El aread del circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));		
			break;
			
		default: System.out.println("La opcion no es correcta");
		}
		 
		

	}

}