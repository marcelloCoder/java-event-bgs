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
    private final Ingresso ingressoPadrao = new Ingresso(1L, "Padrao", 99.99);
    private final Ingresso ingressoVip = new Ingresso(2L, "VIP", 199.99);



    @Override
    public Pessoa cadastrarVisitante() {
        Visitante visitante = new Visitante();
        System.out.println("GOSTARIA DE ADQUIRIR PASSE VIP?");
        boolean vipAsk = scanner.nextBoolean();
        if (vipAsk){
           cadastrarVisitanteVip();
           return visitante;
        }else {
            visitante.setIngresso(ingressoPadrao);
            visitante.setId((long)pessoas.size()+1);
            System.out.println("ID : " + visitante.getId());
            scanner.nextLine();
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
            scanner.nextLine();
            visitante.setIdade(idade);
            System.out.print("Profissao: ");
            String profissao = scanner.nextLine();
            visitante.setProfissao(profissao);
            pessoas.add(visitante);
            list();
            return visitante;
        }
    }

    @Override
    public Pessoa cadastrarVisitanteVip() {
        List<String> beneficios = List.of("Brinde exclusivo", "Fila especial");
        VisitanteVip visitante = new VisitanteVip();
        visitante.setBeneficios(beneficios);
        visitante.setIngresso(ingressoVip);
        visitante.setId((long)pessoas.size()+1);
        System.out.println("ID : " + visitante.getId());
        scanner.nextLine();
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
        scanner.nextLine();
        visitante.setIdade(idade);
        System.out.print("Profissao: ");
        String profissao = scanner.nextLine();
        visitante.setProfissao(profissao);
        pessoas.add(visitante);
        list();
        return visitante;
    }

    @Override
    public Pessoa cadastrarOrganizador() {
        return null;
    }

    public void list() {
        for (Pessoa p : pessoas){
            System.out.println(p);
        }
    }
}
