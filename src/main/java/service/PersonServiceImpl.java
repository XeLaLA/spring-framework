package service;

import dao.PersonDao;
import domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
@Data
@AllArgsConstructor
public class PersonServiceImpl implements PersonService{

    private PersonDao dao;


    public Person getByName(String name) {
        return dao.findByName(name);
    }

}
