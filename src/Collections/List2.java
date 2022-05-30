package Collections;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).*/

        List<Double> temp = new ArrayList<>();
        temp.add(27.2);
        temp.add(20.0);
        temp.add(17.8);
        temp.add(18.6);
        temp.add(10.4);
        temp.add(1.1);

        List<String> mes = new ArrayList<>();
        mes.add("Janeiro");
        mes.add("Fevereiro");
        mes.add("Marco");
        mes.add("Abril");
        mes.add("Maio");
        mes.add("Junho");

        int count = 0;

        while(count < 6){
            System.out.println((count + 1) + " - " + mes.get(count) + " - " + temp.get(count));
            count++;
        }

    }
}
