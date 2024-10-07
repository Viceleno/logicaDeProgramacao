import java.util.Scanner;

public class coordenadas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as coordenadas de x e de y!");
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    sc.nextLine();
    String coordenada;

    if (x > 0 && y > 0){
      coordenada = "Q1";
    } else if (x < 0 && y > 0) {
      coordenada = "Q2";
    } else if (x < 0 && y < 0){
      coordenada = "Q3";
    } else if (x == 0 && y == 0) {
      coordenada = "Origem";
    } else{
      coordenada = "Q4";
    }
    System.out.printf("\nAs coordenadas dadas estao no quadrante %s", coordenada);

    sc.close();
  }
  
}
