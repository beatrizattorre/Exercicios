package Loops;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos numeros deseja inserir? ");
        int quant = scan.nextInt();
        int count = 0;
        int pares = 0;
        int impares = 0;

        do {
            count++;
            System.out.print(count + "o valor: ");int n = scan.nextInt();
            if(n % 2 == 0){
                pares++;
            }
            else{
                impares++;
            }
        } while(count<quant);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
    }
}