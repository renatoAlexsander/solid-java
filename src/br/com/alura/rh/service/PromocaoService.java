package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean antigiuMeta) {
        if (funcionario.getDadosPessoais().isGerente()) {
            throw new ValidacaoException("Gerente não pode ser promovido.");
        } else if (antigiuMeta) {
            final Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
            funcionario.promover(cargoAtual.getProximo());
        }
    }
}
