package br.com.lpm.springintro.service;

import br.com.lpm.springintro.domain.Mailer;
import br.com.lpm.springintro.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private User user;

    @Autowired
    Mailer mailer;

    public void setUser(User user) {
        this.user = user;
    }

    public void rememberPasswordByEmail() {
        mailer.setRecipient(user.getEmail());
        mailer.setMessage("The password for user " +user.getLogin()+ " is xxx.");
        mailer.sendEmail();
    }
}
