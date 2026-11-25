package com.fundamentos.exercicio02;

import java.util.ArrayList;

public class FichaSayajin implements Repositorio {

    private ArrayList<Pessoa> sayajins = new ArrayList<>();
    private int indice = 0;

    @Override
    public void guarda(Pessoa nova) {
        sayajins.add(nova);
    }

    @Override
    public Pessoa recupera(String cpf) {
        for (Pessoa pessoa : sayajins) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public Pessoa primeiro() {
        indice = 0;

        if (sayajins.isEmpty()) {
            return null;
        }

        return sayajins.get(indice);
    }

    @Override
    public Pessoa proximo() {
        indice++;

        if (indice >= sayajins.size()) {
            return null;
        }

        return sayajins.get(indice);
    }
}