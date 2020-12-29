package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ReajusteSalarialValidador> validacoes;

    public ReajusteService(List<ReajusteSalarialValidador> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        validacoes.forEach(v -> v.validar(funcionario, aumento));

        var novoSalario = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(novoSalario);
    }
}
