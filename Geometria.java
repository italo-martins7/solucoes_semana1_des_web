package ex1;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Quadrado(2, 2));
		figuras.add(new Retangulo(3, 2));
		figuras.add(new Losango(2, 3));
		figuras.add(new Triangulo(8, 4));
		figuras.add(new Circulo(6));
		figuras.add(new Trapezio(6, 4, 4));
		figuras.add(new Cilindro(2, 4));
		figuras.add(new Esfera(3));
		figuras.add(new Cubo(2, 2, 2));
		figuras.add(new Piramide(2, 4, 2));

		for (Figura fig : figuras) {
			System.out.println("Area " + fig.area());
			System.out.println("Perimetro " + fig.perimetro());
			System.out.println(" ");

			if (fig instanceof Volume) {

				System.out.println("Volume " + ((Volume) fig).CalculaVolume());
				System.out.println(" ");

			} else if (fig instanceof Diagonal) {

				System.out.println("Diagonal " + ((Diagonal) fig).calculaDiagonal());
				System.out.println(" ");
			}
		}

	}
}
