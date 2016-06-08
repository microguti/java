package edX;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="volvo";
		String hp="130";
		Car c= new Car(b,hp);
		System.out.println(c.getHorsePower(b));
		System.out.println(c.getBrand());
		
	}

}
class Car{
	private String brand;
	private String horsepower;
	public Car(String brand, String horsepower){
		this.brand=brand;
		this.horsepower=horsepower;
	}
	public String getBrand(){
		return brand;
	}
	public String getHorsePower(){
		return horsepower;
	}
	public String getHorsePower(String brand){
		if(brand.equals("volvo")){
			return horsepower+20;
		}else{
			return horsepower;
		}
	}
	
}



//En Java Siempre tenemos que escribir el tipo al que pertenecen los parametros de entrada
//Tambien tenemos que indicar el tipo que devuelve un metodo
//Para devolver un parametro privado tenemos que usar los metodos setter/getter.
//Para comparar dos objetos no podemos usar == porque es un operador, debemos usar equals