package com.fundamentos.exercicio01;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double notaTrabalho;

    static final double pesoProva = 2.5;
    static final double pesoTrabalho = 2.0;
    static final double somaPesos = 7.0;
    static final double notaMedia = 6.5;
    static final double notaMaxima = 10.0;

    private boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho) {

        if (!validarNota(nota1) || !validarNota(nota2) || !validarNota(notaTrabalho)) {
            throw new IllegalArgumentException("As notas devem estar entre 0 e 10.");
        }

        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }
    public double calcularMedia(){
         double media = (nota1 * pesoProva + nota2 * pesoProva + notaTrabalho * pesoTrabalho) / somaPesos;
        return media;

    }

    public void provaFinal (){
        double media = calcularMedia();

        if (media == notaMaxima ){
            System.out.println(this.nome + " Nota máxima");
        } else if (media >= notaMedia) {
            System.out.println(this.nome +" Você tirou " + String.format("%.1f", media) + " e está aprovado.");
        } else {
            double atingirMedia = notaMedia - media;

            System.out.println(this.nome +" Você tirou " + String.format("%.1f", media) +
                    " e precisa fazer " + String.format("%.1f", atingirMedia) + "  na prova final para atingir a média.");
        }
    }
}
