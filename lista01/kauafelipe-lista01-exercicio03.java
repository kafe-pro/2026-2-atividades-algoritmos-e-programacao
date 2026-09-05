import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int idadeanos;
    int idademeses;
    
    System.out.println("Digite quantos anos você tem:");
    idadeanos = input.nextInt();

    idademeses = idadeanos * 12;
    
	System.out.print("Sua idade em meses é igual a: " + idademeses + " meses.");

  }
  
}
