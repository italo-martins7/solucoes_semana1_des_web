package ex1;

public class Cubo extends Poligono implements Volume {

	private double comprimento;

	public Cubo(double base, double altura, double comprimento) {
		super(base, altura);
		this.comprimento = comprimento;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public double CalculaVolume() {
		return Math.pow(getBase(), 3);
	}

	@Override
	public double area() {
		return 6 * (Math.pow(getBase(), 2));
	}

	@Override
	public double perimetro() {
		return getBase() * 12;
	}

}
