package exe_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_6 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D, E, F;
		double trian1, circ1, trapez1, quad1, retang1;
		double trian2, circ2, trapez2, quad2, retang2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
		E = sc.nextDouble();
		F = sc.nextDouble();
		
		trian1 = A * C / 2.0;
		circ1 = 3.14159 * C * C;
		trapez1 = (A + B) / 2.0 * C;
		quad1 = B * B;
		retang1 = A * B;
		
		trian2 = D * F / 2.0;
		circ2 = 3.14159 * F * F;
		trapez2 = (D + E) / 2.0 * F;
		quad2 = E * E;
		retang2 = D * E;
		
		System.out.printf("TRIANGULO: %.3f%n", trian1);
		System.out.printf("CIRCULO: %.3f%n", circ1);
		System.out.printf("TRAPEZIO: %.3f%n", trapez1);
		System.out.printf("QUADRADO: %.3f%n", quad1);
		System.out.printf("RETANGULO: %.3f%n", retang1);
		
		System.out.println();
		
		System.out.printf("TRIANGULO: %.3f%n", trian2);
		System.out.printf("CIRCULO: %.3f%n", circ2);
		System.out.printf("TRAPEZIO: %.3f%n", trapez2);
		System.out.printf("QUADRADO: %.3f%n", quad2);
		System.out.printf("RETANGULO: %.3f%n", retang2);
		
		sc.close();
	}
}
