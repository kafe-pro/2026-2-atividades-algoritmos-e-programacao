
class HelloCodiva {

  public static void main(String[] args) {

    long[] fibonacci = new long[50];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    long numeroTemp = 0;

    for(int i = 2 ; i < fibonacci.length ; i++){
        numeroTemp = fibonacci[i-1] + fibonacci[i-2];
        fibonacci[i] = numeroTemp;
    }

    for(int i = 0 ; i < fibonacci.length ; i++){
        if(i < fibonacci.length-1){
            System.out.printf("%11d, \n", fibonacci[i]);
        }
        else{
            System.out.printf("%11d.", fibonacci[i]);
        }
    }

    }  
}
