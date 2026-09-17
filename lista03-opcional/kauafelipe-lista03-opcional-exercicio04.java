import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int mes;

    System.out.println("Digite o número do mês:");
    mes = input.nextInt();

    if (mes == 1){
        System.out.println("01 - Jan.");
    }
    else if (mes == 2){
        System.out.println("02 - Fev.");
    }
    else if (mes == 3){
        System.out.println("03 - Mar.");
    }
    else if (mes == 4){
        System.out.println("04 - Abr.");
    }
    else if (mes == 5){
        System.out.println("05 - Mai.");
    }
    else if (mes == 6){
        System.out.println("06 - Jun.");
    }
    else if (mes == 7){
        System.out.println("07 - Jul.");
    }
    else if (mes == 8){
        System.out.println("08 - Ago.");
    }
    else if (mes == 9){
        System.out.println("09 - Set.");
    }
    else if (mes == 10){
        System.out.println("10 - Out.");
    }
    else if (mes == 11){
        System.out.println("11 - Nov.");
    }
    else if (mes == 12){
        System.out.println("12 - Dez.");
    }
    else {
        System.out.println("Erro.");
    }

    }
  
}
