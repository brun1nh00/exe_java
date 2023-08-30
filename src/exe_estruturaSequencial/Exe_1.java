package exe_estruturaSequencial;

import java.util.Scanner;

public class Exe_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, E, F, soma1, soma2, soma3;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();
		
		soma1 = A + B;
		soma2 = C + D;
		soma3 = E + F;
		
		System.out.println("SOMA = " + soma1);
		System.out.println("SOMA = " + soma2);
		System.out.println("SOMA = " + soma3);
		
		sc.close();
	}

}
