import java.util.Scanner;

class HelloCodiva {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double[] pesoCaixa = new double[6];
    double pesoRef = 0;
    int quantidadePeso = 0;

    for(int i = 0 ; i < pesoCaixa.length ; i++){
        System.out.println("Digite o peso da caixa (" + i + "/6)");
        pesoCaixa[i] = input.nextDouble();
    }

    System.out.println("-------------------------");
    System.out.println("Digite um peso de referência:");
    pesoRef = input.nextDouble();

    for(int i = 0 ; i < pesoCaixa.length ; i++){
        if (pesoRef == pesoCaixa[i]){
            quantidadePeso++;
        }
    }

    System.out.println("-------------------------");
    if (quantidadePeso > 0){
        System.out.println("O peso de referência foi encontrado " + quantidadePeso + " vezes.");
    }
    else{
        System.out.println("Valor não localizado na amostragem.");
    }

    }  
}
