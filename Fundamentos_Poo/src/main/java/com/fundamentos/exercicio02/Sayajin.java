package com.fundamentos.exercicio02;

public class Sayajin implements Pessoa {

    private String cpf;
    private String nome;
    private boolean vivo;

    public Sayajin(String cpf, String nome, boolean vivo) {
        this.cpf = cpf;
        this.nome = nome;
        this.vivo = vivo;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public boolean isVivo() {
        return vivo;
    }
}