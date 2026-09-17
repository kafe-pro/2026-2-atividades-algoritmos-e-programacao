import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double kg;
    int idade;
    int dosagem = 0;

// 1 gota = 25 mg
    
    System.out.println("Insira seu peso em \"KG\":");
    kg = input.nextInt();
    System.out.println("Insira sua idade em \"ANOS\":");
    idade = input.nextInt();

    if (idade < 0){
        System.out.println("Idade inválida!");
    }
    else if (idade >= 0 && idade < 12){
        if (kg < 5){
            System.out.println("Esse medicamente não é indicado para pessoas com menos de 5kg!");
        }
        else {
            if (kg >= 5 && kg <= 9){
                dosagem = 125 / 25;
            }
            else if (kg > 9 && kg <= 16){
                dosagem = 250 / 25;
            }
            else if (kg > 16 && kg <= 24){
                dosagem = 375 / 25;
            }
            else if (kg > 24 && kg <= 30){
                dosagem = 500 / 25;
            }
            else{
                dosagem = 750 / 25;           
            }
        }
    }
    else{
        if (kg <= 0){
            System.out.println("Peso inválido!");
        }
        else{
            if (kg > 0 && kg < 60){
                dosagem = 875 / 25;
            }
            else {
                dosagem = 1000 / 25;
            }
        }
    }

    if (dosagem != 0){
        System.out.println("Seu peso: " + kg);
        System.out.println("Sua idade: " + idade);
        System.out.println("Você deve tomar " + dosagem + " gotas.");        
    }
    else{
        
    }
    
    }
  
}
