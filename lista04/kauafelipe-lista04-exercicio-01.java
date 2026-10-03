import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    /* Resposta JARDEL
    int numero = 0;
    long fatorial = 1;

    System.out.println("Digite um número:");
    numero = input.nextInt();

    for(int i = numero ; i >= 1 ; i--){
        fatorial = fatorial*i;
    }

    System.out.println("Fatoral: " + fatorial);
    */

    long numero = 0;

    System.out.println("Digite um número:");
    numero = input.nextInt();
    
    long fatorial = numero-1;

    while(fatorial > 0){
        numero = numero*fatorial;
        fatorial--;
    }

    System.out.println("Fatorial: " + numero);

  }
  
}
