package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Funcionario {

	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal salario) {
		this.salario = salario;
		this.dataUltimoReajuste = LocalDate.now();
	}
}
