package br.com.mcoder.repositories;

import br.com.mcoder.entities.Pessoa;

import java.util.List;

public interface CadastroInterface {
    Pessoa cadastrarVisitante();
    Pessoa cadastrarVisitanteVip();
    Pessoa cadastrarOrganizador();
}
