package br.com.mcoder.service;

import br.com.mcoder.controllers.Validator;
import br.com.mcoder.entities.*;
import br.com.mcoder.repositories.CadastroInterface;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PessoaService implements CadastroInterface {

    LocalDate diaInicio = LocalDate.of(2025, Month.OCTOBER, 9);
    LocalDate diaFim = LocalDate.of(2025, Month.OCTOBER, 12);
    private Scanner scanner = new Scanner(System.in);
    private List<Pessoa> pessoas = new ArrayList<>();
    private final Evento eventoPadrao = new Evento(1L, "BGS 2025", "Expo Center SP",diaInicio,diaFim);
    private final Ingresso ingressoPadrao = new Ingresso(1L, "Padrao", 99.99, eventoPadrao);
    private final Ingresso ingressoVip = new Ingresso(2L, "VIP", 199.99, eventoPadrao);



    @Override
    public Pessoa cadastrarVisitante() {
        Visitante visitante = new Visitante();
        System.out.println("GOSTARIA DE ADQUIRIR PASSE VIP?");
        boolean vipAsk = scanner.nextBoolean();
        if (vipAsk = true){
            List<String> beneficios = List.of("Brinde exclusivo", "Fila especial");
            VisitanteVip vipVis = new VisitanteVip(true, beneficios);
            vipVis.setIngresso(ingressoPadrao);
            pessoas.add(vipVis);
            System.out.println("Visitante VIP cadastrado com sucesso!");
            return vipVis;
        }
        visitante.setId((long)pessoas.size()+1);
        System.out.println("ID : " + visitante.getId());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        visitante.setNome(nome);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        visitante.setEmail(email);
        if (!Validator.validarEmail(email)) {
            throw new RuntimeException("EMAIL INVALIDO");
        }
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        visitante.setCpf(cpf);
        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();
        visitante.setIdade(idade);
        System.out.print("Profissao: ");
        String profissao = scanner.nextLine();
        visitante.setProfissao(profissao);

        pessoas.add(visitante);
        System.out.println(pessoas.toString());
        return visitante;
    }

    @Override
    public Pessoa cadastrarVisitanteVip() {
        cadastrarVisitante();
        List<String> beneficios = List.of("Brinde exclusivo", "Fila especial");
        VisitanteVip vip = new VisitanteVip(true, beneficios);
        vip.setIngresso(ingressoPadrao);
        pessoas.add(vip);
        System.out.println("Visitante VIP cadastrado com sucesso!");
        return vip;
    }

    @Override
    public Pessoa cadastrarOrganizador() {
        return null;
    }
}
