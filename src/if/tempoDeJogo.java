import java.util.Scanner;

public class tempoDeJogo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inicio, fim, duracao;
    

    System.out.println("Digite a hora de inicio de jogo e depois a hora de fim!");
    inicio = sc.nextInt();
    fim = sc.nextInt();
    if (inicio >= fim) {
      duracao = (24 - inicio) + fim;
    }
    else {
      duracao = fim - inicio;
    }
    System.out.printf("\nO jogo durou %d Horas", duracao);
    sc.close();
  }
}
