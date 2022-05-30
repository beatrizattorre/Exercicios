package CalculadoraComum;

import CalculadoraComum.Operações.Divisão;
import CalculadoraComum.Operações.Multiplicação;
import CalculadoraComum.Operações.Soma;
import CalculadoraComum.Operações.Subtração;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o comando cujo numero seja a operacao desejada:\n0 - Sair\n1 - CalculadoraComum.Operações.Soma\n" +
                "2 - Subtracao\n3 - Multiplicacao\n4 - Divisao");
        int operacao = 1;

        while(operacao != 0){
            System.out.println("Comando: ");operacao = scan.nextInt();

            if(0>operacao || operacao>4) {
                System.out.println("Insira um valor valido!");
            }

            if(operacao == 0){
                System.out.print("Tchau!");;
            }

            if(operacao == 1){
                System.out.println("Insira 0 para obter o resultado e encerrar a soma");
                Soma soma = new Soma();
                soma.somar();
            }

            if(operacao == 2){
                System.out.println("Insira 0 para obter o resultado e encerrar a subtracao.");
                Subtração subtração = new Subtração();
                subtração.subtrair();
            }

            if(operacao == 3){
                System.out.println("Insira 1 para obter o resultado e encerrar a multiplicacao.");
                Multiplicação multiplicação= new Multiplicação();
                multiplicação.multiplicar();
            }

            if(operacao == 4){
                System.out.println("Insira 1 para obter o resultado e encerrar a divisao.");
                Divisão divisão = new Divisão();
                divisão.dividir();
            }
        }
    }
}