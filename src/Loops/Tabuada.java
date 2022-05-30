package Loops;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual tabuada voce deseja? ");double n = scan.nextDouble();
        int count;
        System.out.println("Tabuada do " + n);

        for(count = 0; count <= 10; count++){
            double mult = n * count;
            System.out.println(n + " x " + count + " = " + mult);
        }
    }
}
