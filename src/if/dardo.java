import java.util.Scanner;

public class dardo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double maior = 0;
    System.out.println("Digite a distancia dos 3 Dardos!");
    double d1 = sc.nextDouble();
    double d2 = sc.nextDouble();
    double d3 = sc.nextDouble();
    if (d1 > d2 && d1 > d3){
      maior = d1;
    } else if (d2 > d1 && d2 > d3){
      maior = d2;
    } else {
      maior = d3;
    }
    
    System.out.printf("A maior distancia e: %.2f", maior);

    sc.close();
  }
  
}
