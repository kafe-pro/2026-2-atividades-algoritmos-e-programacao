import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double kwh;
    Double valor;
    
    System.out.println("Digite a quantidade de kWh consumidos em sua residência:");
    kwh = input.nextDouble();

    if (kwh <= 100){
    valor = kwh * 0.5;
    System.out.print("O valor da sua conta de energia é igual a: R$" + valor);
    }
    else if (kwh >= 101 && kwh <= 200){
    valor = kwh * 0.7;
    System.out.print("O valor da sua conta de energia é igual a: R$" + valor);
    }
    else{
    valor = kwh * 0.9;
    System.out.print("O valor da sua conta de energia é igual a: R$" + valor);
    }

  }
  
}
