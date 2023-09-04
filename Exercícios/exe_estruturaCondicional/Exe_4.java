package exe_estruturaCondicional;

import java.util.Scanner;

public class Exe_4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horainicial = sc.nextInt();
        int horafinal = sc.nextInt();

        int duracao;
        if (horainicial < horafinal) {
                duracao = horafinal - horainicial;
        }
        else {
                duracao = 24 - horainicial + horafinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}