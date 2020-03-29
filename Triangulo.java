package ex1;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		return Math.sqrt((Math.pow((getBase() / 2), 2) + Math.pow(getAltura(), 2)) * 2) + getBase();
	}

}
