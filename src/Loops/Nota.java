package Loops;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        while (true) {
            System.out.print("Nota: ");nota = scan.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("Insira um valor entre 0 e 10.");
            }
            else {
                System.out.println("Sua nota: " + nota);
                break;
            }
        }
    }
}
