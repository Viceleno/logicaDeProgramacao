import java.util.Scanner;

public class dia_da_semana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    String dia = " ";
    do {
      System.out.println("Escolha um numero de 1 a 7 que representa o dia da semana!");
      x = sc.nextInt();

      switch (x) {
        case 1:
          dia = "Domingo";
          break;
        case 2:
          dia = "Segunda Feira";
          break;
        case 3:
          dia = "Terca Feira";
          break;
        case 4:
          dia = "Quarta Feira";
          break;
        case 5:
          dia = "Quinta Feira";
          break;
        case 6:
          dia = "Sexta Feira";
          break;
        case 7:
          dia = "Sabado";
          break;

        default:
          System.out.println("Nao existe esse dia, escolha outro numero!");
      }
    } while (x < 1 || x > 7);
    System.out.printf("O dia que voce escolheu e: %s", dia);
    sc.close();
  }

}
