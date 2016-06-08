package poo;

public class Coche {
	/*ENCAPSULACION. No se pueden modificar valores generales para todos los objetos.*/
		private int ruedas;
		private int ancho;
		private int largo;
		private int motor;
		private int peso_plataforma;
		private String color;
		private int peso_total;
		private boolean asientos_cuero, climatizador;
		
		
		/*Metodo Constructor, mismo nombre que la clase*/
		
		public Coche(){
			ruedas = 4;
			largo = 2000;
			ancho = 300;
			motor = 1600;
			peso_plataforma = 500;
			
		}
		
		
		/* Getter. Publico para que todos puedan verlo, y String porque devuelve un String*/
		public String dime_largo(){
			
			return "El largo del coche es "+ largo;
		}
		
		public String dime_color(){
			
			return " El color del coche es "+ color;
		}
		
		public String dime_asientos(){
			if(asientos_cuero == true)/*if(asientos_cuero) --Es lo mismo--*/{
				return "El coche tiene asientos de cuero";
			} else {
				return "El coche no tiene asientos de cuero";
			}
		}
		
		public String dime_climatizador(){
			if(climatizador == true){
				return "El coche incorpora climatizador";
			}else{
				return "El coche lleva AC";
			}
		}
		
		public String dime_datos_generales(){
			return "La plataforma del vehiculo tiene "+ruedas+" Mide "+largo+" metros "+ " con un ancho "+ancho+
					" y un peso de plataforma de "+peso_plataforma+ " Kg ";
		}
		
		/* Setter. Publico, void que no devuelve valor*/
		public void establece_color(String color_coche){ 
	   /*var de clase = argumento*/
			color = color_coche;
		}
		
		/* Hemos puesto el mismo nombre del argumento, que el nombre de la variable de la clase, asientos_cuero*/
		public void configura_asientos(String asientos_cuero){
			
		/* hacemos referencia a la variable de la clase no al argumento*/
			if(asientos_cuero.equalsIgnoreCase ("si")){
				this.asientos_cuero = true;
			} else{
				this.asientos_cuero = false;
				
			}
		}
		
		public void configura_climatizador(String climatizador){
			if (climatizador.equalsIgnoreCase ("si")){
				this.climatizador = true;
			}else{
				this.climatizador = false;
			}
		}
		
		
		/*Setter y Getter todo junto no es aconsejable*/
		public String dime_peso_coche(){
			int peso_carroceria = 500;
			peso_total = peso_plataforma+peso_carroceria;
			if (asientos_cuero == true){
				peso_total = peso_total +50;
			}
			if (climatizador == true){
				peso_total = peso_total +50;
			}
			return "el peso total del coche es " + peso_total;
			
		}
		public int precio_coche(){
			int precio_final = 10000;
			if(asientos_cuero == true){
				precio_final += 2000;
			}
			if (climatizador == true){
				precio_final += 1000;
			}
			return precio_final;
			
		}
		
}

