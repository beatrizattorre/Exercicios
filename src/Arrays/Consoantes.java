package Arrays;
import java.util.Scanner;
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letras = new String[6];
        int count = 0;
        int quantVogal = 0;
        int quantCons = 0;

        do {
            System.out.print("Letra: ");
            String letra = scan.next();
            count++;
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                quantVogal++;
            }
        }while (count < 6) ;
        quantCons = letras.length - quantVogal;
        System.out.println("Quantidade de letras: " + letras.length);
        System.out.println("Quantidade de vogais: " + quantVogal);
        System.out.println("Quantidade de consoantes: " + quantCons);
    }
}
