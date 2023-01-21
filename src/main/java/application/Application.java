package application;

import domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import service.PersonService;
import service.PersonServiceImpl;

@ComponentScan(basePackages = {".dao",".service"})
@Configuration
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        PersonService serviceOne = context.getBean(PersonService.class);
        Person ivan = serviceOne.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
