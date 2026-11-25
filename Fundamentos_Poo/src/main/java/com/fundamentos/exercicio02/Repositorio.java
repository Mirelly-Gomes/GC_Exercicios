package com.fundamentos.exercicio02;

public interface Repositorio {
    void guarda(Pessoa nova);

    Pessoa recupera(String cpf);

    Pessoa primeiro();

    Pessoa proximo();
}
