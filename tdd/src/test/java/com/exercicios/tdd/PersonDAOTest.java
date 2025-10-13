package com.exercicios.tdd;
import org.junit.jupiter.api.Test;

import com.exercicios.tdd.Exerc2.Email;
import com.exercicios.tdd.Exerc2.Person;
import com.exercicios.tdd.Exerc2.PersonDAO;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    private final PersonDAO dao = new PersonDAO();

    @Test
    void testNomeInvalido() {
        Person p = new Person();
        p.setName("Joao");
        p.setAge(30);
        p.setEmails(List.of(new Email(1, "joao@email.com")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Nome inválido: deve conter ao menos duas partes e apenas letras."));
    }

    @Test
    void testIdadeInvalida() {
        Person p = new Person();
        p.setName("Joao Silva");
        p.setAge(250);
        p.setEmails(List.of(new Email(1, "joao@email.com")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Idade inválida: deve estar entre 1 e 200."));
    }

    @Test
    void testEmailInvalido() {
        Email e = new Email();
        e.setName("invalidoemail");
        Person p = new Person();
        p.setName("Joao Silva");
        p.setAge(30);
        p.setEmails(List.of(e));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("E-mail inválido: invalidoemail"));
    }

    @Test
    void testPessoaValida() {
        Email e = new Email();
        e.setName("joao@exemplo.com");
        Person p = new Person();
        p.setName("Joao Silva");
        p.setAge(30);
        p.setEmails(List.of(e));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.isEmpty());
    }
}
