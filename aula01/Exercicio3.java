// Crie um programa que leia 3 numeros, imprima o maior, o menor e a media aritmetica.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

         System.out.println("Agora outro número: ");
        int n2 = sc.nextInt();

         System.out.println("Terceiro e ultimo: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;

        int media = soma / 3;

        int maior = 0;

        int menor = 0;

        if (n1 > n2 && n1 > n3) {
         maior = n1 ;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2 ;
        }else if (n3 > n1 && n3 > n2) {
            maior = n3 ;
        }

         if (n1 < n2 && n1 < n3) {
         menor = n1 ;
        } else if (n2 < n1 && n2 < n3) {
         menor = n2 ;
        }else if (n3 < n1 && n3 < n2) {
         menor = n3 ;
        }

        String resultado = "A média é " + media + ", o maior é  " + maior + ", o menor é  " + menor ;
        
        System.out.println(resultado);

          sc.close();
      }

        


    }
    

