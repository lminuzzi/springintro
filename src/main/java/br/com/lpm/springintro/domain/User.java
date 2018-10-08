package br.com.lpm.springintro.domain;

public class User {
    private int id;
    private String name;
    private String email;
    private String login;
    private String password;

    public User(String name, String email, String login) {
        this.name = name;
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }
}
