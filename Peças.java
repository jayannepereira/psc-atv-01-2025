import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    System.out.println("Insira a porgentagem do Imposto sobre Produtos Industrializados (IPI):");
    Scanner scanner = new Scanner(System.in);
    int porcentagem = scanner.nextInt();
    
    System.out.println("Insira o código:");
    int codigo1 = scanner.nextInt();
    System.out.println("Insira o valor unitário:");
    int valor1 = scanner.nextInt();
    System.out.println("Insira a quantidade de peças:");
    int peças1 = scanner.nextInt();
    
    System.out.println("Insira o código:");
    int codigo2 = scanner.nextInt();
    System.out.println("Insira o valor unitário:");
    int valor2 = scanner.nextInt();
    System.out.println("Insira a quantidade de peças:");
    int peças2 = scanner.nextInt();

    float soma = (((valor1 * peças1) + (valor2 * peças2)) * porcentagem)/100;
   
    System.out.println("O valor total a ser pago é de R$" + soma);
    }
}
