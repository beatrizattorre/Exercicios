import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o nome do cambio desejado? ");String cambio = scan.next();
        System.out.println("Quanto vale o " + cambio + " hoje? ");double valorCambio = scan.nextDouble();
        double valorReal = 1 / valorCambio;
        System.out.println("Quantos reais voce deseja converter hoje? ");double reaisConvertidos = scan.nextDouble();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        double valorFinal = (valorReal * reaisConvertidos);

        System.out.println(reaisConvertidos + " reais sao " + df.format(valorFinal) + " " + cambio);
    }
}
