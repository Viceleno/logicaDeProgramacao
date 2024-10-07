import java.util.Scanner;

public class operadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double plano = 0;
    int tempo;
    double excedente;

    System.out.println("Digite o tempo de uso do plano em minutos!");
    tempo = sc.nextInt();

    if(tempo <= 100){
      plano = 50;
    } else if (tempo > 100){
        excedente = tempo - 100;
        plano = 50 + (excedente * 2);
    }

    System.out.printf("Voce usou %d minutos e pagara RS %.2f!", tempo, plano);

    sc.close();
  }
}
