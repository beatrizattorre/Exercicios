package CalculadoraComum.Operações;

import java.util.Scanner;

public class Subtração {
    public void subtrair() {
        Scanner scan = new Scanner(System.in);
        double n = 1;
        double sub = 0;

        while (n != 0) {
            System.out.print("Valor: ");
            n = scan.nextDouble();
            sub -= n;
        }
        System.out.println("Subtracao: " + sub);
    }
}