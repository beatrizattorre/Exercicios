package CalculadoraComum.Operações;

import java.util.Scanner;
public class Soma {
    public void somar() {
        Scanner scan = new Scanner(System.in);

        double n = 1;
        double soma = 0;

        while (n != 0) {
            System.out.print("Valor: ");
            n = scan.nextDouble();
            soma += n;
        }
        System.out.println("CalculadoraComum.Operações.Soma: " + soma);
    }
}
