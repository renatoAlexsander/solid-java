package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean antigiuMeta) {
        if (funcionario.isGerente()) {
            throw new ValidacaoException("Gerente não pode ser promovido.");
        } else if (antigiuMeta) {
            funcionario.promover(funcionario.getCargo().getProximo());
        }
    }
}
