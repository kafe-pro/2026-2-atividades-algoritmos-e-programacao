import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double codigo = 0;
    int quantidade = 0;
    double valorTotal = 0;
    double valorDesconto = 0;
    double valorFinal = 0;
    int valorUnitario = 0;
    int porcentagemDesconto = 0;

    
    System.out.println("Digite o código do produto:");
    codigo = input.nextDouble();
    System.out.println("Digite a quantidade de produtos:");
    quantidade = input.nextInt();

    if (codigo >= 1 && codigo <= 10){
    // calcular valor bruto dos produtos 
    valorTotal = quantidade * 10;
    valorUnitario = 10;
    }
    else if (codigo >= 11 && codigo <= 20){
    // calcular valor bruto dos produtos 
    valorTotal = quantidade * 15;
    valorUnitario = 15;
    }
    else if (codigo >= 21 && codigo <= 30){
    // calcular valor bruto dos produtos 
    valorTotal = quantidade * 20;
    valorUnitario = 20;
    }
    
    if (valorTotal <= 250){
    valorDesconto = valorTotal * 0.05;
    porcentagemDesconto = 5;
    }
    else if (valorTotal >= 251 && valorTotal <=500){
    valorDesconto = valorTotal * 0.10;
    porcentagemDesconto = 10;
    }
    else{
    valorDesconto = valorTotal * 0.15;
    porcentagemDesconto = 15;
    }

    valorFinal = valorTotal - valorDesconto;

    
    if (codigo > 0 && quantidade > 0){
    System.out.println();
    System.out.println("Código do produto: " + codigo);
    System.out.println("Preço do unitário produto: R$" + valorUnitario + ",00.");
    System.out.println("Quantidade de produtos: " + quantidade);
    System.out.println("Preço total da nota: " + valorTotal);
    System.out.println("Porcentagem do desconto: " + porcentagemDesconto + "%");
    System.out.println("Valor do desconto: " + valorDesconto);
    System.out.println("Preço final: " + valorFinal);
    }
    else{
        System.out.println("Código não encontrado ou Quantidade inválida");

    }

  }
  
}
