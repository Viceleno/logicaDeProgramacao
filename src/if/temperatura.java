import java.util.Scanner;

public class temperatura {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double c = 0;
    double f = 0;
    String temp;
    System.out.println(" Voce vai digitar a temperatura em qual escala (C/F)?");
    temp = sc.nextLine();
    if (temp.equalsIgnoreCase("c")) {
      System.out.println("Digite a temperatura em Celsius: ");
      c = sc.nextDouble();
      f = 32 + (9.0/5.0 * c);
      System.out.printf("A temperatura equivalente em Fahrenheit e: %.2f", f);
    }else{
      System.out.println("Digite a temperatura em Fahrenheit: ");
      f = sc.nextDouble();
      c = 5.0/9.0 * (f - 32);
      System.out.printf("A temperatura equivalente em Celsius e: %.2f", c);
    }
    sc.close();
  }
}
