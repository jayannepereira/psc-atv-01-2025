import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    System.out.println("Qual seu ano de nascimento?");
    Scanner scanner = new Scanner(System.in);
    int ano = scanner.nextInt();

    if(ano < 2025){
    ano = 2025 - ano;
    System.out.println("Sua idade é " + ano + " ano(s).");
    }else{
    System.out.println("Não existe uma idade válida para o ano de nascimento informado!");
    }
  }
}