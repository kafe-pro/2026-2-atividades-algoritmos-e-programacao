import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double numero1;
    Double numero2;
    Double numero3;
    Double numerosoma;
    Double numeromedia;
    
    System.out.println("Digite um número (1/3):");
    numero1 = input.nextDouble();
    System.out.println("Digite um número (2/3):");
    numero2 = input.nextDouble();
    System.out.println("Digite um número (3/3):");
    numero3 = input.nextDouble();

    numerosoma = numero1 + numero2 + numero3;
    numeromedia = numerosoma / 3;
    
	System.out.print("A soma dos 3 números é: " + numerosoma + ". A média aritmética dos três números é:" + numeromedia);

  }
  
}
