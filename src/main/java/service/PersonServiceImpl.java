package service;

import dao.PersonDao;
import domain.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService{

    private PersonDao dao;

    @Autowired
    public PersonServiceImpl(@Qualifier("PersoneOne") PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }

}
