package pildorasinformáticas;
import java.util.*;
public class Evaluar_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la edad, plis ");
		int edad=entrada.nextInt();
		
		if(edad>=18){
			System.out.println("Eres mayor de edad");
		} else{
			System.out.println("No eres mayor de edad");
		}
	}

}
