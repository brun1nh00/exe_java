package exe_estruturaSequencial;

import java.util.Scanner;

public class Exe_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A1, A2;
		int B1, B2; 
		int C1, C2;
		int D1, D2;
		int diferença1, diferença2;
		
		A1 = sc.nextInt();
		B1 = sc.nextInt();
		C1 = sc.nextInt();
		D1 = sc.nextInt();
		A2 = sc.nextInt();
		B2 = sc.nextInt();
		C2 = sc.nextInt();
		D2 = sc.nextInt();
		
		diferença1 = (A1 * B1 - C1 * D1);
		diferença2 = (A2 * B2 - C2 * D2);
		
		System.out.println("DIFERENÇA = " + diferença1);
		System.out.println("DIFERENÇA = " + diferença2);
		
			sc.close();
		
	}

}
