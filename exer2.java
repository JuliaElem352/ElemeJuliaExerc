package QUESTÃO2;

 //Élem Alves e Júlia de Lima  3-52  
    import java.util.Scanner;

    public class exer2{

    public static void main(String[] args)
     {
       Scanner entrada = new Scanner (System.in);
       int a,b,soma, multiplicação, subtração, divisão;
       System.out.println("Digite um número para que seja calculado: ");
       a = entrada.nextInt(); 
       System.out.println("Digite um número inteiro para que seja calculado: " );
       b = entrada.nextInt();
       soma = a+b;
       subtração =a- b;
       multiplicação = a * b;
       divisão = a /b;
       System.out.println("A soma dos valores é: " + soma);
       System.out.println("A subtração dos valores é: " + subtração);
       System.out.println("A multiplicação dos valores é: " + multiplicação);
       System.out.println("A divisão dos valores é: " + divisão);





    }
}

