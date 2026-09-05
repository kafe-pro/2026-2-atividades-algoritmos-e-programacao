import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double salario;
    Double porcentagemAumento;
    Double aumento;
    
    System.out.println("Digite seu salário atual:");
    salario = input.nextDouble();
    System.out.println("Digite a porcentagem de aumento que irá receber:");
    porcentagemAumento = input.nextDouble();

    porcentagemAumento = porcentagemAumento / 100;
    aumento = salario * porcentagemAumento;
    salario = salario + aumento;
    
	System.out.print("O valor do seu aumento é: R$" + aumento + ". O seu novo salário será igual a: R$" + salario + ".");

  }
  
}
