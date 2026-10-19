import java.util.Random;

class HelloCodiva {

  public static void main(String[] args) {

    Random numeroAleatorio = new Random();
    int[] corredoresTempoMin = new int[10];
    int[] corredoresPosicoes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int corredoresTempoHor = 0;

    for(int i = 0 ; i < corredoresTempoMin.length ; i++){
        corredoresTempoMin[i] = numeroAleatorio.nextInt(999);
    }

    System.out.println("##################################################");
    System.out.println("Tempo de todos os 10 corredores:");
    System.out.println("");

    for(int i = 0 ; i < corredoresTempoMin.length ; i++){
        if(corredoresTempoMin[i] > 60){
            corredoresTempoHor = corredoresTempoMin[i]/60;
            System.out.printf("Corredor %2d: %2d hora(s) e %2d minuto(s)\n", (i+1), corredoresTempoHor, (corredoresTempoMin[i]-corredoresTempoHor*60));
        }
        else{
            System.out.printf("Corredor %2d: %15d minuto(s)\n", (i+1), corredoresTempoMin[i]);
        }
    }

    System.out.println("");
    System.out.println("##################################################");
    System.out.println("Posição dos corredores:");
    System.out.println("");

    for(int i = 0 ; i < corredoresTempoMin.length ; i++){
        int valorAtual = 0;
        int posicaoAtual = 0;
        int j = i+1;

        while(j < corredoresTempoMin.length){
            if(corredoresTempoMin[i] > corredoresTempoMin[j]){
                valorAtual = corredoresTempoMin[i];
                posicaoAtual = corredoresPosicoes[i];

                corredoresTempoMin[i] = corredoresTempoMin[j];
                corredoresPosicoes[i] = corredoresPosicoes[j];
                
                corredoresTempoMin[j] = valorAtual;
                corredoresPosicoes[j] = posicaoAtual;

                j++;
            }
            else{
                j++;
            }
        }
    }

    for(int i = 0 ; i < corredoresTempoMin.length ; i++){
        if(corredoresTempoMin[i] > 60){
            corredoresTempoHor = corredoresTempoMin[i]/60;
            System.out.printf("%2d lugar: Corredor %2d: %2d hora(s) e %2d minuto(s)\n", i+1, corredoresPosicoes[i], corredoresTempoHor, (corredoresTempoMin[i]-corredoresTempoHor*60));
        }
        else{
            System.out.printf("%2d lugar: Corredor %2d: %15d minuto(s)\n", i+1, corredoresPosicoes[i], corredoresTempoMin[i]);
        }
    }

    }  
}
