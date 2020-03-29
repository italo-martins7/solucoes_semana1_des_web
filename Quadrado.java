package ex1;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		return (2 * super.getBase()) + (2 * super.getAltura());

	}

	@Override
	public double calculaDiagonal() {
		return (Math.sqrt(area())) * (Math.sqrt(2));
	}

}
