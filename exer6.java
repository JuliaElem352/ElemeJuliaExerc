package QUESTÃO6;

//Élem Alves e Júlia de Lima  3-52
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args){
        float peso; 
         String tipo;
        Scanner Ler = new Scanner(System.in);
       
            System.out.println("Digite um peso(Libras ou Quilos): "); 
            peso = Ler.nextFloat();
            System.out.println("Digite o tipo de peso('l' = Libras / 'q' = quilos): ");
            tipo = Ler.next();
       
         if (tipo == "l"){
           System.out.println("Quilos: " + (peso - (peso * 2.2046)));
           System.out.println("Libras: " + peso * 2.2046); 
           }else{
           System.out.println("Libras: " + peso * 2.2046);
           System.out.println("Quilos: " + (peso - (peso * 2.2046)));
           }
          
           }
       }
    
