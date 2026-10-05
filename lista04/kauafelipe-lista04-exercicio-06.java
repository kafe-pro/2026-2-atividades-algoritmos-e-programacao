import java.util.Scanner;
import java.util.ArrayList;

class HelloCodiva {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    ArrayList<Int> numerosErrados = new ArrayList<>();
    int numeroSecreto = 42;
    int numero = 0;
    int tentativas;
    int contador;

    do{
        System.out.println("Digite um número:");
        numero = input.nextInt();
        if (numero != 42){
            numerosErrados.add(numero);
            tentativas++;
        }
    }while(numero != 42);

    System.out.println("-------------------------");
    System.out.println("Parabéns, você adivinhou! O número secreto é 42!");
    System.out.println("Tentativas: " + tentativas);

    System.out.println("-------------------------");
    System.out.println("Palpites:");

    for(int print : numerosErrados){
        System.out.println(contador + ") " + print);
    }

    }  
}
