import java.util.Scanner;

public class imc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double alt = sc.nextDouble();

        double imc = peso / (alt * alt);

        System.out.printf("Seu indice de massa corporea e: %.2f", imc);

        sc.close();
    }

}
