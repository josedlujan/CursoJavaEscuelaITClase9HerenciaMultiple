package ejemplo2;

public abstract class Figura {

	String color;
	int perimetro;
	
	public abstract void dibujar();
	
	public int calcularPerimetro(int lados){
		this.perimetro = lados;
		return this.perimetro;
	}
	
}
