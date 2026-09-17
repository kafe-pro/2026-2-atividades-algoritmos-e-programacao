import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int x;
    
    System.out.println("Digite o valor de \"x\":");
    x = input.nextInt();

    if (x <= 1){
    System.out.print("y = 1");
    }
    else if (x > 1 && x <= 2){
    System.out.print("y = 2");
    }
    else if (x > 2 && x <= 3){
    System.out.print("y = " + x*x);
    }
    else{
    System.out.print("y = " + x*x*x);
    }

  }
  
}
