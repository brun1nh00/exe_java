package exe_estruturaCondicional;

import java.util.Scanner;
public class Exe_3 {

    public static void main(String... args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são Multiplos");
        }

        sc.close();
    }
}
