import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Insira o valor do salário mínimo atual: R$");
    float salario1 = scanner.nextFloat();
    
    System.out.print("Insira o valor do seu salário: R$");
    float salario2 = scanner.nextFloat();

    if(salario2 < salario1){
        System.out.print("Atualmente, você recebe menos que um salário mínimo.");
    }else{
    float soma = salario2 / salario1;
    System.out.println("Seu salário atual é igual a, aproximadamente, " + soma + " salários mínimos.");
    }
  }
}