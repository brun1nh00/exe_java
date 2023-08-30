package exe_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R1, R2, R3, π = 3.14159;
		double A1, A2, A3;
		
		R1 = sc.nextDouble();
		R2 = sc.nextDouble();
		R3 = sc.nextDouble();
		
		A1 = π * R1 * R1;
		A2 = π * R2 * R2;
		A3 = π * R3 * R3;
		
		System.out.printf("A=%.4f%n", A1);
		System.out.printf("A=%.4f%n", A2);
		System.out.printf("A=%.4f%n", A3);
		
			sc.close();
	}

}
