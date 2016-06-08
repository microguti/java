package poo;
import javax.swing.*;


public class Uso_Vehiculo {

	public static void main(String[] args) {
	
		/* instanciar una clase, ejemplar de clase 
		
			Coche micoche = new Coche();
			micoche.establece_color(JOptionPane.showInputDialog("Introduce el color del coche: "));
			micoche.configura_asientos(JOptionPane.showInputDialog("Tiene Asientos de cuero? "));
			System.out.println(micoche.dime_color());
			System.out.println(micoche.dime_asientos());
			
			micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador? "));
			System.out.println(micoche.dime_climatizador());
			System.out.println(micoche.dime_peso_coche());
			System.out.println("El precio final del coche es: "+micoche.precio_coche());
			*/
			
		Coche micoche1=new Coche();
		micoche1.establece_color("green");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		mifurgoneta1.establece_color("blue");
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.configura_climatizador("si");
		System.out.println(micoche1.dime_datos_generales()+mifurgoneta1.dime_color());
	}

}
