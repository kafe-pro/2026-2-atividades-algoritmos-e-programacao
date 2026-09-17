import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String senhaImutavel;
    String senhaTemp;

    do{
        System.out.println("Digite uma senha (Máximo 4 caracteres):");
        senhaImutavel = input.nextLine();
        if (senhaImutavel.length() <= 4 && senhaImutavel.length() != 0){
            do{
                System.out.println("Qual sua senha?");
                senhaTemp = input.nextLine();
                if (senhaTemp.equals(senhaImutavel)){
                    System.out.println("Acesso Autorizado!");
                }
                else {
                    System.out.println("Senha Incorreta! Tente novamente!");
                }
            }while(!senhaTemp.equals(senhaImutavel));
        }
        else {
            System.out.println("Sua senha deve conter de 1 a 4 caracteres!");
        }
    }while(senhaImutavel.length() > 4 || senhaImutavel.length() == 0);
    
    }
  
}
