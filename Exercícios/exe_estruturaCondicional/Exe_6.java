package exe_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe_6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor < 0.0 || valor > 100.0) {
            System.out.println("Fora de Intervalo");
        }
        else if (valor <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (valor <= 50.0) {
            System.out.println("Intervalo [25,50]");
        }
        else if (valor <= 75.0) {
            System.out.println("Intervalo [50,75]");
        }
        else {
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }
}
