import java.util.Scanner;

public class glicose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da sua glicose: ");
    double glicose = sc.nextDouble();
    String result = " ";

    if (glicose <= 100) {
      result = "Sua Glicose esta Normal!";
      System.out.printf("Sua glicose e: %.2f\n %s", glicose , result);
    } else if (glicose > 100 && glicose <= 140) {
      result = "Sua Glicose esta Elevada!";
      System.out.printf("Sua glicose e: %.2f\n %s", glicose , result);
    } else {
      result = "Voce esta Diabetico!";
      System.out.printf("Sua glicose e: %.2f\n %s", glicose , result);
    }
    sc.close();
  }
  
}
