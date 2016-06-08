package Avanzado;

import java.util.*;

public class EntradaDatos {

	public static void main(String[] args) {
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir programa");
		
		Scanner entrada=new Scanner(System.in);
		int decision=entrada.nextInt();
		if(decision==1){
			try{
			PedirDatos();
			}catch(InputMismatchException e){
				System.out.println("Edad mal introducida");
			}
		}else{
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
		

		
	}
	
	//para ver las excepciones obligamos a lanzar una excepcion en caso de no coincidir los tipos pedidos
	//throws se utiliza en la declaracion de un metodo
	static void PedirDatos() throws InputMismatchException{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre por favor");
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introudce edad por favor");
		int edad=entrada.nextInt();
		
		System.out.println("Hola "+ nombre_usuario+ " el año que viente tendras"+ (edad+1)+ " años.");
		
		entrada.close();
		
		System.out.println("Hemos terminado");
		
	}

}
