package br.com.lpm.springintro;

import br.com.lpm.springintro.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Program {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Program.class);
        Person person = applicationContext.getBean(Person.class);

        person.setName("Luiz Afonso Ortega");
        person.setAge(34);

        System.out.println(person);
    }
}
