package QUESTÃO5;

//Élem Alves e Júlia de Lima  3-52
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args)
     {

        for (int a=1;a<=300;a++)
        {

     int qtd = 0;   
     if(a == 1)
        System.out.println(a);
     else
        {
     for(int cont=1;cont<=a;cont++)
        if( (a % cont) == 0) qtd++;
        if(qtd == 2)
    System.out.println(a); 


      
}
         
 }




    
}
}