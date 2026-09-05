import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Double valorproduto;
    Double valordesconto;
    
    System.out.println("Digite o valor do produto:");
    valorproduto = input.nextDouble();

    valordesconto = valorproduto * 0.9;
    
	System.out.print("O valor do produto com desconto de 10% é igual a: " + valordesconto + " .");

  }
  
}
