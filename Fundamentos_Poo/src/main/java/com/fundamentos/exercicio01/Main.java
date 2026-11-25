//Escreva uma classe cujos objetos representam alunos matriculados
//em uma disciplina. Cada objeto dessa classe deve guardar os seguintes dados
//do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
//seguintes métodos para esta classe: media calcula a média final do aluno
//        (cada prova tem peso 2,5 e o trabalho tem peso 2) final calcula quanto o
//aluno precisa para a prova final.

package com.fundamentos.exercicio01;

public class Main {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Kakarotto","a01", 7.0,10.0,9.0);
    aluno1.provaFinal();

    Aluno aluno2 = new Aluno("Vegetto", "a02", 2.0,0.5, 10);
    aluno2.provaFinal();

    Aluno aluno3 = new Aluno("Kuririn", "a03",10.0,10.0,10.0);
    aluno3.provaFinal();
    }


}