package exe_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe_2 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		int n2 = sc.nextInt();
		
		if(n2 % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		int n3 = sc.nextInt();
		
		if(n3 % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
		
		}
}
