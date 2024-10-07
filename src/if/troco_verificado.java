import java.util.Scanner;

public class troco_verificado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int troco = 0;
    do {
      System.out.println("Digite o preco do produto!");
      int preco = sc.nextInt();
      System.out.println("Digite a quantidade adquirida!");
      int quantidade = sc.nextInt();
      System.out.println("Digite o valor pago!");
      int valor_pago = sc.nextInt();
      
      troco = valor_pago - (quantidade * preco);
      int t = (-1) * (valor_pago - (quantidade * preco));
    
      if (troco < 0){
        System.out.printf("O valor pago e insuficiente! Falta %d reais!\n", t);
      } else {
        System.out.printf("O preco do produto e %d reais,\n foi solicitado %d unidades,\n foi pago %d reais\n e devera ter um troco de %d reais!", preco, quantidade, valor_pago, troco );
      }
    } while(troco < 0);  

    sc.close();
  }
  
}
