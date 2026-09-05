import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double numero1;
    Double numero2;
    Double numero3;
    
    System.out.println("Digite um número (1/3):");
    numero1 = input.nextDouble();
    System.out.println("Digite um número (2/3):");
    numero2 = input.nextDouble();
    System.out.println("Digite um número (3/3):");
    numero3 = input.nextDouble();

    if (numero1 > numero2 && numero1 > numero3){
    System.out.print("Entre os números digitados o maior foi o primeiro: " + numero1 + ".");
    }
    else if (numero2 > numero1 && numero2 > numero3){
    System.out.print("Entre os números digitados o maior foi o segundo: " + numero2 + ".");
    }
    else{
    System.out.print("Entre os números digitados o maior foi o terceiro: " + numero3 + ".");
    }

  }
  
}
