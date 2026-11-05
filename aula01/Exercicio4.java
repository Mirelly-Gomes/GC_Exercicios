// Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade
// de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário minimo é  R$ 1.621

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in);

         System.out.println("Insira seu salário");
         
         double salario = sc.nextDouble();
       
         double salarioMin = 1621;

         double qntSalario = salario / salarioMin;

         String mensagem = "Seu salário de " + salario + " representa " + String.format("%.1f", qntSalario) + " de salário minímo." ;

         System.out.println(mensagem);
          sc.close();  
    }
}
