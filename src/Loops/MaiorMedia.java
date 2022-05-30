package Loops;
import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n;
        int count = 0;
        double soma = 0;
        double maior = 0;

        do {
            count++;
            System.out.println(count + "o numero: ");n = scan.nextDouble();
            soma += n;

            if(n > maior){
                maior = n;
            }
        }while (count<5);

        System.out.println("Media: " + soma / count);
        System.out.println("Maior: " + maior);

    }
}
