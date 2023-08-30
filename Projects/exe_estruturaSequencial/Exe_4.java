package exe_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionarios1, funcionarios2, funcionarios3;
		int horas1, horas2, horas3;
		
		double valor1 = 5.50; 
		double valor2 = 20.50; 
		double valor3 = 15.55;
		double saida1, saida2, saida3;
		
		funcionarios1 = sc.nextInt();
		horas1 = sc.nextInt();
		funcionarios2 = sc.nextInt();
		horas2 = sc.nextInt();
		funcionarios3 = sc.nextInt();
		horas3 = sc.nextInt();
		
		saida1 = (horas1 * valor1);
		saida2 = (horas2 * valor2);
		saida3 = (horas3 * valor3);
		
		System.out.println("NUMBER = " + funcionarios1);
		System.out.printf("SALARY = U$ %.2f%n", saida1);
		System.out.println("NUMBER = " + funcionarios2);
		System.out.printf("SALARY = U$ %.2f%n", saida2);
		System.out.println("NUMBER = " + funcionarios3);
		System.out.printf("SALARY = U$ %.2f%n", saida3);
		
			sc.close();
		
		
	}	

}
