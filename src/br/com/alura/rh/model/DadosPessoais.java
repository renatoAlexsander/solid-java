package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;

    public void atualizarSalario(BigDecimal aumento) {
        this.salario = salario.add(aumento);
    }

    public boolean isGerente() {
        return this.cargo.equals(Cargo.GERENTE);
    }

    public void atualizarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
