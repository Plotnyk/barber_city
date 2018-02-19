package app.controller;

import app.model.entity.person.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Контроллер для jsp сайта
 * */
public class Model {
    private static Model instance = new Model();
    private List<Account> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        this.model = new ArrayList<>();
    }

    public void add(Account account) {
        model.add(account);
    }

    public List<String> list() {
        return model.stream().map(Account::getName).collect(Collectors.toList());
    }
}
