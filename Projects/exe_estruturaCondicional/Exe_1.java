package exe_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe_1 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ent1, ent2, ent3;
		
		ent1 = sc.nextInt();
		
		if (ent1 < 0) {
			System.out.println("NEGATIVO");
		}
		
		ent2 = sc.nextInt();
		
		if (ent2 > 0) {
			System.out.println("NÃO NEGATIVO");
		}
		
		ent3 = sc.nextInt();
		
		if (ent3 <= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}
}
