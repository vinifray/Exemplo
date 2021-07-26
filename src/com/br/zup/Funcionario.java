package com.br.zup;

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private String email;

    public Funcionario(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void apresentarFuncionario() throws Exception {
        throw new Exception("Xablau");
    }
}
