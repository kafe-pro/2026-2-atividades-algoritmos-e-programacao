import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int continuar = 1;
    double salario = 0;
    int filhos = 0;
    double salarioTotal = 0;
    int filhosTotal = 0;
    int quantidadeCadastros = 0;
    double mediaSalario = 0;
    double mediaFilhos = 0;
    double maiorSalario = 0;
    int quantidadeSalarioMinimo = 0;
    double percentualSalarioMinimo = 0;

    do{
        if(continuar == 1){
            System.out.println("\nQual o seu salário?");
            salario = input.nextInt();
            
            System.out.println("Quantos filhos você tem?");
            filhos = input.nextInt();

            // Calculos
            quantidadeCadastros++;
            salarioTotal = salarioTotal + salario;
            filhosTotal = filhosTotal + filhos;

            mediaSalario = salarioTotal / quantidadeCadastros;

            mediaFilhos = filhosTotal / quantidadeCadastros;

            if(maiorSalario < salario){
                maiorSalario = salario;
            }

            if(salario > 1621){
                quantidadeSalarioMinimo++;
            }        
            percentualSalarioMinimo = quantidadeSalarioMinimo*100/quantidadeCadastros;

            // Print
            System.out.println("\nA média dos salários é igual a: " + mediaSalario);
            System.out.println("A média do número de filhos é igual a: " + mediaFilhos);
            System.out.println("O mairo salário é igual a: " + maiorSalario);
            System.out.println("O percentual de pessoas com salário de até 1 salário mínimo (R$1621,00) é igual a: " + percentualSalarioMinimo + "%");

        }
        else{
            System.out.println("\nOpção inválida!");
        }

        System.out.println("\nVocê deseja continuar? (1 - sim. 0 - não.)");
        continuar = input.nextInt();

    }while(continuar != 0);

  }
  
}
