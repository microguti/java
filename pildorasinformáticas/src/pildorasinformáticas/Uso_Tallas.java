package pildorasinformáticas;
import java.util.*;
public class Uso_Tallas {

	/*Los tipos enumerados siempre tienen que estar fuera del main
	enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};*/
	
	
	enum Talla{
		
		//definimos los posibles valores
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		//creamos un constructor
		private Talla(String abreviatura){
			this.abreviatura=abreviatura;
		}
		
		//podemos igualmente crear setters y getters
		public String dameAbreviatura(){
			return abreviatura;
		}
		private String abreviatura;
	}
	
	
	
	public static void main(String[] args) {
		/*
		Talla s=Talla.MINI;
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;*/
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Escribe una talla: Mini, Mediano, Grande, Muy Grande");
		
		//se queda a la espera de la entrada de un valor
		String entrada_datos=entrada.next().toUpperCase();
		
		//Devuelve el valor
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla= "+la_talla);
		System.out.println("Abreviatura="+ la_talla.dameAbreviatura());
		
	}

}
