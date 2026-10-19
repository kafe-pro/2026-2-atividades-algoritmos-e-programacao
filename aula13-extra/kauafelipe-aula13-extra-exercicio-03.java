import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class HelloCodiva {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Random numeroAleatorio = new Random();
    int[] a = new int[30];
    int[] b = new int[30];
    ArrayList<Integer> posicao = new ArrayList<>();
    int numeroAleatorioPosicao = 0;
    int numero;

    // Aleatorizar e armazenar 30 números

    for(int i = 0 ; i < a.length ; i++){
        a[i] = numeroAleatorio.nextInt(10);
    }

    for(int i = 0 ; i < b.length ; i++){
        b[i] = numeroAleatorio.nextInt(10);
    }

    // Imprimir os 30 números da variável "a" separados em 5 por linha

    System.out.println("##################################################");
    System.out.println("Todos os números da variável \"A\", separados em cinco por linha.");

    for(int i = 0 ; i < a.length/5 ; i++){
        for(int j = 0 ; j < 5 ; j++){
            System.out.printf("%2d", a[numeroAleatorioPosicao]);
            if (j < 4){
                System.out.print(",");
            }
            numeroAleatorioPosicao++;
        }
        System.out.println();
    }

    // Imprimir os 30 números da variável "b" separados em 5 por linha

    System.out.println();
    System.out.println("##################################################");
    System.out.println("Todos os números da variável \"B\", separados em cinco por linha.");

    numeroAleatorioPosicao = 0;

    for(int i = 0 ; i < b.length/5 ; i++){
        for(int j = 0 ; j < 5 ; j++){
            System.out.printf("%2d", b[numeroAleatorioPosicao]);
            if (j < 4){
                System.out.print(",");
            }
            numeroAleatorioPosicao++;
        }
        System.out.println();
    }

    System.out.println();
    System.out.println("##################################################");
    System.out.println("Digite um número:");
    numero = input.nextInt();

    for(int i = 0 ; i < a.length ; i++){
        if(a[i] == numero){
            posicao.add(i);
        }
    }

    System.out.println();
    System.out.println("##################################################");

    if(posicao.isEmpty()){
        System.out.println("Número não encontrado.");
    }
    else{
        System.out.println("O número \"" + numero + "\" foi encontrado nas seguintes posições do conjuto \"A\": " + posicao);

        System.out.println();
        System.out.println("##################################################");

        for(int i : posicao){
            System.out.printf("O elemento de B de posição correspondente à \"%2d\" é %2d\n", i, b[i]);
        }

    }

    }  
}
