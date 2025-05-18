package br.com.mcoder.controllers;

public class Validator {
    public static boolean validarEmail(String email) {
        if (email != null && email.contains("@") && email.endsWith(".com")){
            return true;
        }
        return false;
    }
}
