package br.com.mcoder;

import br.com.mcoder.service.PessoaService;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PessoaService pessoaService = new PessoaService();
        pessoaService.criarVisitante();
        System.out.println(pessoaService);
    }
}
