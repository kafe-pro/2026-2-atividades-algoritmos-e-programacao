import java.util.Scanner;

class HelloCodiva {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double[] temperatura = new double[5];
    double media = 0;

    for(int i = 0 ; i < temperatura.length ; i++){
        System.out.println("Digite a temperatura do dia (" + i + "/5)");
        temperatura[i] = input.nextDouble();
    }

    System.out.println("");

    for(int i = 0 ; i < temperatura.length ; i++){
        media += temperatura[i];

        System.out.println("Temperatura do dia " + (i+1) + ": " + temperatura[i]);
    }

    media = media / temperatura.length;

    System.out.println("\nTemperatura média da semana: " + media + "\n");

    for(int i = 0 ; i < temperatura.length ; i++){
        if (temperatura[i] > media){
        System.out.println("Temperatura acima da média registrada no dia " + (i+1) + ": " + temperatura[i]);
        }
        
    }

    }  
}
