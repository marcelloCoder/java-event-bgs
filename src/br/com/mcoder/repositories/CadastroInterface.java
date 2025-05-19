package br.com.mcoder.repositories;

import br.com.mcoder.entities.Pessoa;


public interface CadastroInterface {
    Pessoa cadastrarVisitante();
    Pessoa cadastrarVisitanteVip();
    Pessoa cadastrarOrganizador();
}
