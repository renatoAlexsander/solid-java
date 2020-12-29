package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReajustePeriodo implements ReajusteSalarialValidador {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        var dataUltimoReajuste = funcionario.getDataUltimoReajuste();

        var meses = ChronoUnit.MONTHS.between(dataUltimoReajuste, LocalDate.now());

        if (meses < 6) {
            throw new ValidacaoException("Reajuste Salarial permitido após 6 meses.");
        }
    }
}
