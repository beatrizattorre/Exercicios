package Arrays;


import java.util.Random;

//Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios
//(entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int [] n = new int[20];
        int count;

        for(count = 0; count < n.length; count++){
            int num = random.nextInt(100);
            n[count] = num;
        }
            for(int num: n){
                System.out.print(num + " ");
                System.out.print(num+1 + ", ");
            }

    }
}
