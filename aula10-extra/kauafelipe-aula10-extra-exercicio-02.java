import java.util.Scanner;

class HelloCodiva {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int igualarColuna = 0;
    int asterisco = 0;
    int espaco = 4;
    int coluna = 1;
    int imagens = 1;

    do{
        System.out.println("Qual imagem você deseja imprimir?");
        System.out.println("\n\"1 - TODAS.\"" + "\n\"2 - Imagem 1.\"" + "\n\"3 - Imagem 2.\"" + "\n\"4 - Imagem 3.\"" + "\n\"5 - Imagem 4.\"" + "\n\"6 - Imagem 5.\"" + "\n\"0 - Sair.\"");
        imagens = input.nextInt();
        
        if(imagens > 0 && imagens < 7){
            System.out.println("Quantas colunas você deseja?");
            coluna = input.nextInt();
            if(coluna > 0){
                if(imagens == 2 || imagens == 1){
                    // Imagem 1
                    for(int i = 1 ; i <= 4 ; i++){
                        igualarColuna = 0;

                        do{
                            System.out.print("*");
                            igualarColuna++;
                        }while(igualarColuna < coluna);
                
                        System.out.println("");
                    }
                    // Linebreak
                    System.out.println("");
                }

                if(imagens == 3 || imagens == 1){
                    // Imagem 2
                    asterisco = 0;
                    espaco = 4;
                    for(int i = 1 ; i <= 4 ; i++){
                        igualarColuna = 0;
                        asterisco = 0;

                        do{
                            if(asterisco < espaco){
                                System.out.print("*");
                                igualarColuna++;
                            }
                            else{
                                System.out.print(" ");
                                igualarColuna++;
                            }

                            asterisco++;

                            if(asterisco >= 4){
                                asterisco = 0;
                            }
                        }while(igualarColuna < coluna);

                        espaco--;
                        System.out.println("");
                    }
                    // Linebreak
                    System.out.println("");
                }

                if(imagens == 4 || imagens == 1){
                    // Imagem 3
                    asterisco = 0;
                    espaco = 3;
                    for(int i = 1 ; i <= 4 ; i++){
                        igualarColuna = 0;
                        asterisco = 0;

                        do{
                            if(asterisco < espaco){
                                System.out.print(" ");
                                igualarColuna++;
                            }
                            else{
                                System.out.print("*");
                                igualarColuna++;
                            }

                            asterisco++;

                            if(asterisco >= 4){
                                asterisco = 0;
                            }
                        }while(igualarColuna < coluna);

                        espaco--;
                        System.out.println("");
                    }
                    // Linebreak
                    System.out.println("");
                }

                if(imagens == 5 || imagens == 1){
                    // Imagem 4
                    asterisco = 0;
                    espaco = 0;
                    for(int i = 1 ; i <= 4 ; i++){
                        igualarColuna = 0;
                        asterisco = 0;

                        do{
                            if(asterisco < espaco){
                                System.out.print(" ");
                                igualarColuna++;
                            }
                            else{
                                System.out.print("*");
                                igualarColuna++;
                            }

                            asterisco++;

                            if(asterisco >= 4){
                                asterisco = 0;
                            }
                        }while(igualarColuna < coluna);

                        espaco++;
                        System.out.println("");
                    }
                    // Linebreak
                    System.out.println("");
                }

                if(imagens == 6 || imagens == 1){
                    // Imagem 5
                    asterisco = 0;
                    espaco = 1;
                    for(int i = 1 ; i <= 4 ; i++){
                        igualarColuna = 0;
                        asterisco = 0;

                        do{
                            if(asterisco < espaco){
                                System.out.print("*");
                                igualarColuna++;
                            }
                            else{
                                System.out.print(" ");
                                igualarColuna++;
                            }

                            asterisco++;

                            if(asterisco >= 4){
                                asterisco = 0;
                            }
                        }while(igualarColuna < coluna);

                        espaco++;
                        System.out.println("");
                    }
                    // Linebreak
                        System.out.println("");
                }
            }
            else if(coluna != 0){
                System.out.println("\nValor inválido!\n");
            }
        }
        else{
            System.out.println("\nOpção inválida!\n");
        }
    }while(imagens != 0);

  }
  
}
