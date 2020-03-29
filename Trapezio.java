package ex1;

public class Trapezio extends Figura {

	private double baseM, basem, h;

	public Trapezio(double baseM, double basem, double h) {
		super();
		this.baseM = baseM;
		this.basem = basem;
		this.h = h;
	}

	@Override
	public double area() {
		return ((baseM + basem) * h) / 2;
	}

	@Override
	public double perimetro() {
		return (baseM + basem) + (2 * (Math.sqrt(Math.pow((baseM - basem), 2) + Math.pow(h, 2))));
	}

}
