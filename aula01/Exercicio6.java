//Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//1. Se for menor de 16 anos, avisar que não pode votar.
//2. Se tiver 16 ou 17 anos, avisar que o voto é facultativo.
//3. Se tiver mais de 65 anos, avisar que o voto também é facultativo.
//4. De 18 até 65 anos, o voto é obrigatório.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("não pode votar"); 
        }else if (idade >= 16 || idade <= 17 || idade > 65) {
            System.out.println("voto facultativo"); 
        }else if (idade >= 18 || idade <= 65 ) {
            System.out.println("voto obrigatorio"); 
        }else{ 
            System.out.println("Idade invalida");
        }
    }
}
