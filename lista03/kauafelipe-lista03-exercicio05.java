import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num;
    int mult = 1;

    System.out.println("Digite um número:");
    num = input.nextInt();

    for(int i = 10 ; i > 0 ; i--){
        System.out.println("Número " + num + " * " + mult + " = " + num*mult);
        mult++;
    }
    
    }
  
}
