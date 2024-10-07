import java.util.Scanner;

public class maior_menor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int n3 = sc.nextInt();

        int maior;

        int mediano;

        int menor;

        if (n2 > n1 && n2 > n3 && n1 > n3) {
            maior = n2;
            menor = n3;
            mediano = n1;
        } else if (n2 > n1 && n2 > n3 && n3 > n1) {
            maior = n2;
            menor = n1;
            mediano = n3;
        } else if (n1 > n2 && n1 > n3 && n2 > n3) {
            maior = n1;
            menor = n3;
            mediano = n2;
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            maior = n1;
            menor = n2;
            mediano = n3;
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            maior = n3;
            menor = n2;
            mediano = n1;
        } else {
            maior = n3;
            menor = n1;
            mediano = n2;
        }

        System.out.printf("A ordem crescente do numeros e: %d, %d, %d \n", menor, mediano, maior);

        System.out.printf("A ordem decrescente do numeros e: %d, %d, %d", maior, mediano, menor);

        sc.close();
    }
}
