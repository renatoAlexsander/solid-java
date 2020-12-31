package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal aumento) {
		dadosPessoais.atualizarSalario(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promover(Cargo cargo) {
		dadosPessoais.atualizarCargo(cargo);
	}
}
