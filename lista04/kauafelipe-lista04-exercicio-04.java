import java.util.Scanner;

class HelloCodiva {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double[] faturamento = new double[5];
    double faturamentoTotal = 0;
    double media = 0;

    for(int i = 0 ; i < faturamento.length ; i++){
        System.out.println("Digite o faturamento do dia (" + i + "/5)");
        faturamento[i] = input.nextDouble();
    }

    System.out.println("");

    for(int i = 0 ; i < faturamento.length ; i++){
        faturamentoTotal += faturamento[i];

        System.out.println("Faturamento do dia " + (i+1) + ": " + faturamento[i]);
    }

    media = faturamentoTotal / faturamento.length;

    System.out.println("\nFaturamento total da semana: " + faturamentoTotal);
    System.out.println("Faturamento médio da semana: " + media + "\n");

    for(int i = 0 ; i < faturamento.length ; i++){
        if (faturamento[i] < media){
        System.out.println("Faturamento abaixo da média registrado no dia " + (i+1) + ": " + faturamento[i]);
        }
        
    }

    }  
}
