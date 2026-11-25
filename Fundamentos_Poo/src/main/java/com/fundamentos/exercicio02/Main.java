package com.fundamentos.exercicio02;

public class Main {
    public static void main(String[] args) {

        Repositorio A = new FichaSayajin();
        Repositorio B = new FichaSayajin();
        Repositorio C = new FichaSayajin();
        Repositorio D = new FichaSayajin();

        // Cadastro dos Sayajins
        A.guarda(new Sayajin("001", "Goku", true));
        A.guarda(new Sayajin("002", "Vegeta", true));
        A.guarda(new Sayajin("003", "Bardock", false));
        A.guarda(new Sayajin("004", "Gohan", true));
        A.guarda(new Sayajin("005", "Raditz", false));

        B.guarda(new Sayajin("001", "Goku", true));
        B.guarda(new Sayajin("004", "Gohan", true));

        // Teste de recupera()
        System.out.println("=== BUSCAR SAYAJIN ===");

        Pessoa encontrado = A.recupera("002");

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Sayajin não encontrado.");
        }

        // Teste de primeiro() e proximo()
        System.out.println("\n=== TODOS OS SAYAJINS ===");

        Pessoa pessoa = A.primeiro();

        while (pessoa != null) {
            System.out.println(pessoa.getNome());
            pessoa = A.proximo();
        }

        // Teste de duplica()
        Utilitarios util = new Utilitarios();
        util.duplica(A, D);

        System.out.println("\n=== REPOSITORIO DUPLICADO ===");

        pessoa = D.primeiro();

        while (pessoa != null) {
            System.out.println(pessoa.getNome());
            pessoa = D.proximo();
        }

        // Teste de diferenca()
        util.diferenca(A, B, C);

        System.out.println("\n=== DIFERENÇA ENTRE A E B ===");

        pessoa = C.primeiro();

        while (pessoa != null) {
            System.out.println(pessoa.getNome());
            pessoa = C.proximo();
        }

        // Consulta de vivos e mortos
        System.out.println("\n=== SAYAJINS VIVOS E MORTOS ===");

        pessoa = A.primeiro();

        while (pessoa != null) {

            Sayajin sayajin = (Sayajin) pessoa;

            if (sayajin.isVivo()) {
                System.out.println(sayajin.getNome() + " - Vivo");
            } else {
                System.out.println(sayajin.getNome() + " - Morto");
            }

            pessoa = A.proximo();
        }
    }
}