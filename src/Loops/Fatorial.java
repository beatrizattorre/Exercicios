package Loops;

//Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fatorial voce deseja? ");double n = scan.nextDouble();
        System.out.println("Fatorial de " + n);
        double count = n;
        double fat = 1;


        for(count = n; count > 0; count--){
            fat *= count;
        }
        System.out.println(n + "!" + " = " + fat);
    }
}
