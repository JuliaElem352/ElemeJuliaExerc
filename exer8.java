package QUESTÃO8;

//Élem Alves e Júlia de Lima  3-52 
public class exer8 {
    
        public static void main(String[] args){
        int totalImpar = 0;
        long totalPar = 1; 
        int num;
            
        for(num = 0; num <= 30; num++) { 
          if((num % 2 == 1)) { 
        totalImpar += num; 
         }else{
        totalPar *= num;
       }
        }        
      System.out.println("Multiplicação dos pares: " + totalPar);       System.out.println("Soma dos ímpares: " + totalImpar);       
          }
      }  

