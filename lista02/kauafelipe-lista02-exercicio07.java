import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double renda;
    double prestacao;
    double porcento30;
    
    
    System.out.println("Digite valor da sua renda mensal:");
    renda = input.nextDouble();
    System.out.println("Digite valor da prestação mensal que deseja pagar:");
    prestacao = input.nextInt();

    porcento30 = renda * 0.3;

    if (prestacao > 3000){
        if (renda >= 10000){
            if (prestacao <= porcento30){
            System.out.println("");
            System.out.println("Financiamento aprovado");
            }
            else{
            System.out.println("");
            System.out.println("Financiamento negado por alta prestação");
            }
        }
        else {
        System.out.println("");
        System.out.println("Financiamento negado por baixa renda");
        }
    }
    else{
        if (prestacao <= porcento30){
            System.out.println("");
            System.out.println("Financiamento aprovado");
        }
        else {
            System.out.println("");
            System.out.println("Financiamento negado por alta prestação");
        }
    }

  }
  
}
