package QUESTÃO10;

//Élem Alves e Júlia de Lima  3-52 
import java.util.Scanner;

public class exer10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double B, b, h, A;

        System.out.println("Calcule sua área!");
        System.out.println("Digite o valor de B = base maior: ");
        B = input.nextDouble();
        System.out.println("Digite o valor de b = base menor: ");
        b = input.nextDouble();
        System.out.println("Digite o valor de h = altura");
        h = input.nextDouble();
        A = ((B + b) / 2) * h;
        System.out.println("O valor de B é: " + B + " b: " + b + " h: " + h);
        System.out.println("A área do trapézio é: " + A);
        input.close();
    }

}
