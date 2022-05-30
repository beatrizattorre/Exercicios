package Collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

//Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista:
        List<Double> notas2 = new ArrayList<Double>();
        notas2.addAll(notas);
        System.out.println(notas + " "+ notas2);

// Mostre a primeira nota da nova lista sem removê-lo:
        System.out.println(notas2.get(0));

//Mostre a primeira nota da nova lista removendo-o:
        System.out.println(notas2.remove(0) + "\n" + notas2);
    }
}
