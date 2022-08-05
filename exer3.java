package QUESTÃO3;

//Élem Alves e Júlia de Lima  3-52
import java.util.Scanner;

public class exer3 {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        int nota1,nota2;
        int media,i;
        String cAluno;
        
        System.out.println("Digite o seu nome: "); 
        cAluno = entrada.nextLine();
          
            System.out.println("Aluno " + cAluno + ", Digite sua primeira nota"); 
            nota1= entrada.nextInt();
            System.out.println("Aluno " + cAluno + ", Digite sua segunda nota"); 
            nota2= entrada.nextInt();
            media = (nota1 + nota2 )/2;
            System.out.println(" A média do aluno " + cAluno + " é " + media);

            if ( (media >= 6) ){
            System.out.println("Aprovado!!!");
                        
           



    }
        }

        }
    

