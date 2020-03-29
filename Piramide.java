package ex1;

public class Piramide extends Poligono implements Volume {
	private double comprimento;

	public Piramide(double base, double altura, double comprimento) {
		super(base, altura);
		this.comprimento = comprimento;
	}

	public double getWidth() {
		return comprimento;
	}

	public void setWidth(double comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public double CalculaVolume() {
		return (comprimento * getBase() * getAltura()) / 3;
	}

	@Override
	public double perimetro() {
		return getBase() / 4;
	}

	@Override
	public double area() {
		return 0;
	}

}