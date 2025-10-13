package com.exercicios.tdd.Exerc2;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	
	//simula o evento
    public void save(Person p) {
    }

    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        if (p.getName() == null || !p.getName().matches("^[A-Za-z]+( [A-Za-z]+)+$")) {
            errors.add("Nome inválido: deve conter ao menos duas partes e apenas letras.");
        }

        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("Idade inválida: deve estar entre 1 e 200.");
        }

        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            errors.add("Pessoa deve ter pelo menos um e-mail.");
        } else {
            for (Email e : p.getEmails()) {
                if (!e.getName().matches("^.+@.+\\..+$")) {
                    errors.add("E-mail inválido: " + e.getName());
                }
            }
        }

        return errors;
    }
}
