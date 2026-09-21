import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double valor = 20;
    int menu;
    double recarga;

    System.out.println("TechPhone: Iniciando autoatendimento.\n");

    do{
        System.out.println("\n1 - Consultar Saldo / Status\n" + "2 - Recarregar / Adicionar Créditos\n" + "3 - Falar com Atendente\n" + "0 - Sair do Sistema");
        menu = input.nextInt();

        if(menu == 1){
            if(valor > 0){
                System.out.println("\nSaldo: R$" + valor);
            }
            else{
                System.out.println("\nSem saldo.");
            }
        }
        else if(menu == 2){
            System.out.println("\nQual o valor da recarga?");
            recarga = input.nextDouble();
            valor = valor + recarga;
            System.out.println("Saldo: R$" + valor);
        }
        else if(menu == 3){
            System.out.println("\nSendo direcionado para um atendente, aguarde na linha.");
        }
        else if(menu == 0){
            System.out.println("TechPhone: Agradecemos o uso do sistema. \nSessão encerrada.");
        }
        else{
            System.out.println("\nOpção invalida.");
        }
    }while(menu != 0);

  }
  
}
