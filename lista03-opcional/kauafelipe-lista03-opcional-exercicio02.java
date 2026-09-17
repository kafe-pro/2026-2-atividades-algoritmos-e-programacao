import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    int delta;
    
    System.out.println("Fórmula da equação de segundo grau: ax² + bx + c");
    System.out.println("Digite o valor de \"a\":");
    a = input.nextInt();
    System.out.println("Digite o valor de \"b\":");
    b = input.nextInt();
    System.out.println("Digite o valor de \"c\":");
    c = input.nextInt();

    if (a == 0){
    System.out.println("Não é equação de segundo grau!");
    }
    else{
    delta = b*b-4*a*c;

        if (delta < 0){
        System.out.println("Delta: " + delta);
        System.out.println("Não existem raízes reais!");
        } 
        else if (delta > 0){
        System.out.println("Delta: " + delta);
        System.out.println("Existem duas raízes reais diferentes!");    
        } 
        else{
        System.out.println("Delta: " + delta);
        System.out.println("Existem duas raízes reais iguais!");    
        } 
         
    }

  }
  
}
