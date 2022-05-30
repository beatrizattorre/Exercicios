package CalculadoraComum.Operações;

import java.util.Scanner;

public class Divisão {
    public void dividir() {
        Scanner scan = new Scanner(System.in);

        double n = 0;
        double div = 1;

        while (n != 1) {
            System.out.print("Valor: ");
            n = scan.nextDouble();
            div /= n;
        }
        System.out.println("Divisao: " + div);
    }
}
