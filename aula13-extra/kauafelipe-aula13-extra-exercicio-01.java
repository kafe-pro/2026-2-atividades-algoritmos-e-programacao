import java.util.Random;

class HelloCodiva {

  public static void main(String[] args) {

    Random numeroAleatorio = new Random();
    int[] database = new int[100];
    int numeroAleatorioPosicao = 0;
    int quebraLinhaVinte = 0;
    int imprimirQuantidade = 0;

    // Aleatorizar e armazenar 1000 números

    for(int i = 0 ; i < database.length ; i++){
        database[i] = numeroAleatorio.nextInt(100);
    }

    // Imprimir os 1000 números separados em 20 por linha

    System.out.println("##################################################");
    System.out.println("Todos os números inseridos, separados em vinte por linha.");
    System.out.println("##################################################");
    System.out.println();

    for(int i = 0 ; i < database.length/20 ; i++){
        for(int j = 0 ; j < 20 ; j++){
            System.out.printf("%3d", database[numeroAleatorioPosicao]);
            if (j < 19){
                System.out.print(",");
            }
            numeroAleatorioPosicao++;
        }
        System.out.println();
    }

    // Imprimir os números pares separados em 20 por linha

    System.out.println();
    System.out.println("##################################################");
    System.out.println("Todos os números pares, seguidos da quantidade dos mesmos.");
    System.out.println("##################################################");
    System.out.println();

    numeroAleatorioPosicao = 0;

    while(numeroAleatorioPosicao < database.length){
        quebraLinhaVinte = 0;

        while(quebraLinhaVinte < 20 && numeroAleatorioPosicao < database.length){
            if(database[numeroAleatorioPosicao] % 2 == 0){
                System.out.printf("%3d", database[numeroAleatorioPosicao]);
                if (quebraLinhaVinte < 19){
                    System.out.print(",");
                }
                numeroAleatorioPosicao++;
                quebraLinhaVinte++;
                imprimirQuantidade++;
            }
            else{
                numeroAleatorioPosicao++;
            }
        }

        System.out.println();
    }

    System.out.println();
    System.out.println("Quantidade de números pares: " + imprimirQuantidade);
    System.out.println();

    // Imprimir os números impares separados em 20 por linha

    System.out.println();
    System.out.println("##################################################");
    System.out.println("Todos os números impares, seguidos da quantidade dos mesmos.");
    System.out.println("##################################################");
    System.out.println();

    numeroAleatorioPosicao = 0;
    imprimirQuantidade = 0;

    while(numeroAleatorioPosicao < database.length){
        quebraLinhaVinte = 0;

        while(quebraLinhaVinte < 20 && numeroAleatorioPosicao < database.length){
            if(database[numeroAleatorioPosicao] % 2 != 0){
                System.out.printf("%3d", database[numeroAleatorioPosicao]);
                if (quebraLinhaVinte < 19){
                    System.out.print(",");
                }
                numeroAleatorioPosicao++;
                quebraLinhaVinte++;
                imprimirQuantidade++;
            }
            else{
                numeroAleatorioPosicao++;
            }
        }

        System.out.println();
    }

    System.out.println();
    System.out.println("Quantidade de números impares: " + imprimirQuantidade);
    System.out.println();

    // Imprimir os números divisíveis por 5 separados em 20 por linha

    System.out.println();
    System.out.println("##################################################");
    System.out.println("Todos os números divisíveis por 5, seguidos da quantidade dos mesmos.");
    System.out.println("##################################################");
    System.out.println();

    numeroAleatorioPosicao = 0;
    imprimirQuantidade = 0;

    while(numeroAleatorioPosicao < database.length){
        quebraLinhaVinte = 0;

        while(quebraLinhaVinte < 20 && numeroAleatorioPosicao < database.length){
            if(database[numeroAleatorioPosicao] % 5 == 0){
                System.out.printf("%3d", database[numeroAleatorioPosicao]);
                if (quebraLinhaVinte < 19){
                    System.out.print(",");
                }
                numeroAleatorioPosicao++;
                quebraLinhaVinte++;
                imprimirQuantidade++;
            }
            else{
                numeroAleatorioPosicao++;
            }
        }

        System.out.println();
    }

    System.out.println();
    System.out.println("Quantidade de números divisíveis por 5: " + imprimirQuantidade);

    }  
}
