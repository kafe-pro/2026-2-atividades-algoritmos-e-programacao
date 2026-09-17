import java.util.Scanner;
import java.util.ArrayList;

class HelloCodiva {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    ArrayList<Double> doacoes = new ArrayList<>();
    double valor;
    double total = 0;
    double quantidade = 0;
    double maior = 0;
    double menor = 0;
    int i = 1;
    
    do{
        System.out.println("Digite o valor da doação (Para finalizar digite um número negativo. Ex: -1.):");
        valor = input.nextDouble();
        if(valor > 0){
            doacoes.add(valor);
            total = total+valor;
            quantidade++;
        }
    }while(valor > 0);

    if (total > 0){
        menor = doacoes.get(0);
    }
        
    for (double doacoesTemp : doacoes) {
        if (doacoesTemp > maior){
            maior = doacoesTemp;
        }

        if (doacoesTemp < menor){
            menor = doacoesTemp;
        }
    }

    if (total > 0){
        System.out.println("\nValor total arrecadado: " + total);
        System.out.println("Maior valor arrecadado: " + maior);
        System.out.println("Menor valor arrecadado: " + menor + "\n");
        for (double doacoesTemp : doacoes){
            System.out.println("Doação " + i + ": R$" + doacoesTemp);
            i++;
        }
    }
    
    }  
}
