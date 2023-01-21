package application;

import config.DaoConfig;
import config.ServicesConfig;
import domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import service.PersonService;
import service.PersonServiceImpl;

@ComponentScan()
@Configuration
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        PersonService serviceOne = (PersonService) context.getBean("personeOne");
        PersonService serviceTwo = (PersonService) context.getBean("personeTwo");

        Person ivan = serviceOne.getByName("Ivan");
        Person petr = serviceTwo.getByName("Petr");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
        System.out.println("name: " + petr.getName() + " age: " + ivan.getAge());
        System.out.println(serviceOne);
        System.out.println(serviceTwo);
    }
}
