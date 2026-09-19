import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int nota;
    int media = 0;
    int quantidade = 0;

    do{
        System.out.println("Digite uma nota (Para finalizar digite um número negativo. Ex: -1.):");
        nota = input.nextInt();
        if(nota >= 0){
            media = media+nota;
            quantidade++;
        }
    }while(nota >= 0);
    
    media = media/quantidade;
    System.out.println("Quantidade de notas inseridas: " + quantidade);
    System.out.println("Media das notas inseridas: " + media);
    }
  
}
