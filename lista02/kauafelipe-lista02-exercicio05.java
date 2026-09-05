import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double celsius;
    Double conversao;
    int escolha;
    
    System.out.println("Digite o número de graus Celsius:");
    celsius = input.nextDouble();
    System.out.println("Se você quiser converter para Fahrenheit digite \"1\":");
    System.out.println("Se você quiser converter para Kelvin digite \"2\":");
    escolha = input.nextInt();

    if (escolha == 1){
    conversao = celsius * 1.8 + 32;
    System.out.print("A conversão de " + celsius + " graus Celsius para Fahrenheit fica: " + conversao + ".");
    }
    else if (escolha == 2){
    conversao = celsius + 273.15;
    System.out.print("A conversão de " + celsius + " graus Celsius para Kelvin fica: " + conversao + ".");
    }
    else{
    System.out.print("Opção invalida.");
    }

  }
  
}
