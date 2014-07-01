package ejemplo2;

public class Main {
	public static void main(String[] argumentos){
		
		Cuadrado cuadrado = new Cuadrado();
		System.out.println(cuadrado.calcularPerimetro(5));
		cuadrado.dibujar();
		
	    Circulo circulo = new Circulo();
	    System.out.println(circulo.calcularPerimetro(2));
	    circulo.dibujar();
	}
}
