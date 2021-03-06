package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajustePorcentagem implements ReajusteSalarialValidador {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal percentualReajuste = aumento.divide(funcionario.getDadosPessoais().getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
