import java.util.Scanner;

public class lanchonete {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cod, qtd;
    double valor = 0;
    String resp = " ";
    do {
      System.out.println("\nEscreva o codigo: ");
      cod = sc.nextInt();
      System.out.println("Escreva a quantidade: ");
      qtd = sc.nextInt();
      sc.nextLine();
      switch (cod) {
        case 1:
          valor = qtd * 5.00;
          break;
        case 2:
          valor = qtd * 3.50;
          break;
        case 3:
          valor = qtd * 4.80;
          break;
        case 4:
          valor = qtd * 8.90;
          break;
        case 5:
          valor = qtd * 7.32;
          break;
        default:
          System.out.println("Nao existe esse codigo, digite um valor de 1 a 5!");
          
          break;
      }
      System.out.println("Quer continuar(S/N)?");
      resp = sc.nextLine();
      System.out.printf("\nO valor a pagar e : %.2f", valor);
    } while (cod <= 0 || cod > 5 || resp.equalsIgnoreCase("S"));
    
    
    sc.close();
  }
}
