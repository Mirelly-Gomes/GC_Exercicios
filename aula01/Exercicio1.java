// Crie um programa que leia seu nome e imprima na tela.
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome ?");
        String nome = sc.nextLine();

        System.out.println("Olá" + nome );

        sc.close();
    }
}
