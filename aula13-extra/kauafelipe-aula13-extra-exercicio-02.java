import java.util.Random;

class HelloCodiva {

  public static void main(String[] args) {

    Random numeroAleatorio = new Random();
    int[] database = new int[100];
    int[] databaseQuadrado = new int[100];
    int numeroAleatorioPosicao = 0;

    // Aleatorizar e armazenar 100 números

    for(int i = 0 ; i < database.length ; i++){
        database[i] = numeroAleatorio.nextInt(100);
    }

    // Calcular o quadrado de cada um dos 100 números e armazenar

    for(int i = 0 ; i < databaseQuadrado.length ; i++){
        databaseQuadrado[i] = database[i] * database[i];
    }

    // Imprimir os 100 números separados em 20 por linha

    System.out.println("##################################################");
    System.out.println("Todos os números inseridos, separados em vinte por linha.");
    System.out.println("##################################################");
    System.out.println();

    for(int i = 0 ; i < database.length/20 ; i++){
        for(int j = 0 ; j < 20 ; j++){
            System.out.printf("%5d", database[numeroAleatorioPosicao]);
            if (j < 19){
                System.out.print(",");
            }
            numeroAleatorioPosicao++;
        }
        System.out.println();
    }

    // Imprimir o quadrado dos 100 números separados em 20 por linha

    System.out.println();
    System.out.println("##################################################");
    System.out.println("O quadrado de todos os números inseridos, separados em vinte por linha.");
    System.out.println("##################################################");
    System.out.println();

    numeroAleatorioPosicao = 0;

    for(int i = 0 ; i < databaseQuadrado.length/20 ; i++){
        for(int j = 0 ; j < 20 ; j++){
            System.out.printf("%5d", databaseQuadrado[numeroAleatorioPosicao]);
            if (j < 19){
                System.out.print(",");
            }
            numeroAleatorioPosicao++;
        }
        System.out.println();
    }

    }  
}
