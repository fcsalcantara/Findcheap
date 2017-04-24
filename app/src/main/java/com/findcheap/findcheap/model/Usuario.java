package com.findcheap.findcheap.model;

public class Usuario {

    private String nome;
    private String email;
    private String cpf;
    private String senha;

    public Usuario(String nome, String email, String cpf, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    @Override
    public String toString() { return this.nome; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Usuario) {
            Usuario u = (Usuario) o;
            return this.email.equalsIgnoreCase(u.getEmail()) && this.senha.equalsIgnoreCase(u.getSenha());
        } else {
            return false;
        }
    }

}
