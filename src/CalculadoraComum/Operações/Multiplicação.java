package CalculadoraComum.Operações;

import java.util.Scanner;

public class Multiplicação {
    public void multiplicar() {
        Scanner scan = new Scanner(System.in);
        double n = 0;
        double mult = 1;

        while (n != 1) {
            System.out.print("Valor: ");
            n = scan.nextDouble();
            mult *= n;
        }
        System.out.println("Multiplicacao: " + mult);
    }
}
