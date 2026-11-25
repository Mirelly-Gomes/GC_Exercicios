package com.fundamentos.exercicio02;

public class Utilitarios {

    public void duplica (Repositorio A, Repositorio B){
        Pessoa pessoa = A.primeiro();

        while (pessoa != null){
            B.guarda(pessoa);

            pessoa = A.proximo();
        }

    }

    public void diferenca(Repositorio A, Repositorio B, Repositorio C) {

        Pessoa pessoa = A.primeiro();

        while (pessoa != null) {

            Pessoa encontrada = B.recupera(pessoa.getCpf());

            if (encontrada == null) {
                C.guarda(pessoa);
            }

            pessoa = A.proximo();
        }
    }
}
