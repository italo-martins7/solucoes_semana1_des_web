package ex1;

public class Cilindro extends Circulo implements Volume {

	private double h;

	public Cilindro(double raio, double h) {
		super(raio);
		this.h = h;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	@Override
	public double CalculaVolume() {
		return Math.PI * (Math.pow(getRaio(), 2)) * h;
	}
}