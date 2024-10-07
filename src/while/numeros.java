import java.util.Scanner;

public class numeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Insira o primeiro numero");
    num = sc.nextInt();
    int soma = num;
    while (num != 0) {
      System.out.println("Insira outro numero");
      num = sc.nextInt();
      soma = soma + num;
    }
    System.out.printf("A soma e: %d", soma);
    sc.close();
  }
  
}
