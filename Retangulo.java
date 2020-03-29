package ex1;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public double calculaDiagonal() {
		return Math.sqrt((Math.pow(super.getBase(), 2)) + (Math.pow(super.getAltura(), 2)));
	}

	public double perimetro() {
		return (2 * super.getBase()) + (2 * super.getAltura());
	}

}
