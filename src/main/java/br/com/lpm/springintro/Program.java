package br.com.lpm.springintro;

import br.com.lpm.springintro.domain.Person;
import br.com.lpm.springintro.domain.User;
import br.com.lpm.springintro.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("Lupicinio Rodrigues",
                "lucianopminuzzi@gmail.com", "lminuzzi");

        System.out.println("Do you want to recover your password (Y/N)?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            ApplicationContext context = new
                    AnnotationConfigApplicationContext(Program.class);
            UserService userService =
                    context.getBean(UserService.class);

            userService.setUser(user);
            userService.rememberPasswordByEmail();
        }
    }
}
