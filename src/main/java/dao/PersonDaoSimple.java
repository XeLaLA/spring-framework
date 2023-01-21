package dao;

import domain.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonDaoSimple implements PersonDao{
    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
