package exe_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, codigo3;
		int codigo4, codigo5, codigo6;
		
		int quantidade1, quantidade2, quantidade3;
		int quantidade4, quantidade5, quantidade6;
		
		double valor1 = 5.30;
		double valor2 = 5.10;
		double valor3 = 15.30;
		double valor4 = 5.20;
		double valor5 = 15.10;
		double valor6 = 15.10;
		
		double total1, total2, total3;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		codigo3 = sc.nextInt();
		quantidade3 = sc.nextInt();
		codigo4 = sc.nextInt();
		quantidade4 = sc.nextInt();
		codigo5 = sc.nextInt();
		quantidade5 = sc.nextInt();
		codigo6 = sc.nextInt();
		quantidade6 = sc.nextInt();
		
		total1 = ((quantidade1 * valor1) + (quantidade2 * valor2));
		total2 = ((quantidade3 * valor3) + (quantidade4 * valor4));
		total3 = ((quantidade5 * valor5) + (quantidade6 * valor6));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total1);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total3);
		
		sc.close();
	}
}
