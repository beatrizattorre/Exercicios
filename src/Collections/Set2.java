package Collections;
import java.util.*;
public class Set2 {
    public static void main(String[] args) {

//Crie um conjunto contendo as cores do arco-íris e:
        Set<String> cores = new HashSet<>();
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");
        cores.add("verde");
        cores.add("amarelo");
        cores.add("laranja");
        cores.add("vermelho");
        System.out.println(cores);

//a) Exiba todas as cores o arco-íris uma abaixo da outra;
        for (String cor : cores) {
            System.out.println(cor);
        }

//b) A quantidade de cores que o arco-íris tem;
        System.out.println(cores.size());

//c) Exiba as cores em ordem alfabética;


//d) Exiba as cores na ordem inversa da que foi informada;


//e) Exiba todas as cores que começam com a letra ”v”;
        for (String cor : cores) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

//f) Remova todas as cores que não começam com a letra “v”;


//g) Limpe o conjunto;
        cores.clear();
        System.out.println(cores);

//h) Confira se o conjunto está vazio;
        System.out.println(cores.isEmpty());

    }
}
