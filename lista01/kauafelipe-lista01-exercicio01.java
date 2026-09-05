import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double numero;
    Double numero2x;
    
    System.out.println("Digite um número:");
    numero = input.nextDouble();

    numero2x = numero * 2;
    
	System.out.print("Seu número é: " + numero + ". O dobro do seu número é:" + numero2x);

  }
  
}
