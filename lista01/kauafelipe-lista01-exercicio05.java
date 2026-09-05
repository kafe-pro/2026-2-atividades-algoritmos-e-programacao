import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double altura;
    Double peso;
    Double imc;
    
    System.out.println("Digite sua altura em metros:");
    altura = input.nextDouble();
    System.out.println("Digite seu peso em kg:");
    peso = input.nextDouble();

    altura = altura * altura;
    imc = peso / altura;
    
	System.out.print("O valor do seu imc é igual a: " + imc + " .");

  }
  
}
