import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    
    System.out.println("Digite um número (1/2):");
    a = input.nextInt();
    System.out.println("Digite um número (2/2):");
    b = input.nextInt();

	System.out.print("Variavel a = " + a + ". Variavel b = " + b + ".");

    c = a;
    a = b;
    b = c;
    
	System.out.print("Variavel a = " + a + ". Variavel b = " + b + ".");

  }
  
}
