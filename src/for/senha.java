import java.util.Scanner;

public class senha {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua senha: ");
    String senha = sc.nextLine();
    while (senha.equalsIgnoreCase("1234") != true) {
      System.out.println("Senha Invalida"); 
      System.out.println("Digite sua senha: ");
      senha = sc.nextLine();  
    }
    System.out.println("Acesso Permitido");
    
    sc.close();
  }
    
}
  

