import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira um número aleatório:");
    int num1 = scanner.nextInt();
    
    int antecessor = num1 - 1;
    System.out.println("O número antecessor a " + num1 + " é " + antecessor);
    
    int sucessor = num1 + 1;
    System.out.println("O número sucessor a " + num1 + " é " + sucessor);

    if(num1 % 2 == 0){
        System.out.println(num1 + " é um número PAR");
    }else{
        System.out.println(num1 + " é um número ÍMPAR");
    }
  }
}