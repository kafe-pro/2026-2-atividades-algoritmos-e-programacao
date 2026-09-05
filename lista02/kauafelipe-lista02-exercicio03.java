import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double numero;
    Double numero2;
    
    System.out.println("Digite um número:");
    numero = input.nextDouble();

    if (numero % 2 == 0){
    numero2 = Math.pow(numero, 2);
    System.out.print("O número " + numero + " é par, e seu quadrado é " + numero2 + ".");
    }
    else{
    numero2 = Math.pow(numero, 3);
    System.out.print("O número " + numero + " é impar, e seu cubo é " + numero2 + ".");
    }

  }
  
}
