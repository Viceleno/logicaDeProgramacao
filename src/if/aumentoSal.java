import java.util.Scanner;

public class aumentoSal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sal;
    double por;
    double aum;
    double nsal = 0;
    System.out.println("Digite o atual salario do funcionario!");
    sal = sc.nextDouble();
    if (sal <= 1000){
      por = 20;
    } else if (sal <= 3000) {
      por = 15;
    }else if (sal <= 8000) {
      por = 10;
    } else {
      por = 5;
    }
    aum = sal * (por/100);
    nsal = sal + aum;
    System.out.printf("Novo salario e: R$ %.2f\nO Aumento e: R$ %.2f\nA porcentagem adotada e: %.0f ", nsal, aum, por);
    sc.close();
  }
}

