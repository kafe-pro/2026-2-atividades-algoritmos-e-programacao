import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int senhaImutavel;
    int senhaTemp;

    do{
        System.out.println("Digite uma senha (Máximo 4 caracteres):");
        senhaImutavel = input.nextInt();
        if (senhaImutavel <= 9999 && senhaImutavel >= 0){
            do{
                System.out.println("Qual sua senha?");
                senhaTemp = input.nextInt();
                if (senhaTemp == senhaImutavel){
                    System.out.println("Acesso Autorizado!");
                }
                else {
                    System.out.println("Senha Incorreta! Tente novamente!");
                }
            }while(senhaTemp != senhaImutavel);
        }
        else {
            System.out.println("Sua senha deve conter de 1 a 4 caracteres!");
        }
    }while(senhaImutavel > 9999 || senhaImutavel < 0);
    
    }
  
}
