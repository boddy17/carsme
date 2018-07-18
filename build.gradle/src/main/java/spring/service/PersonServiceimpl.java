package spring.service;

import com.journaldev.spring.model.Person;
import dao.spring.PersonDAO;

import java.util.List;

@Service
class PersonServiceImpl implements com.journaldev.spring.service.PersonService {

    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }

    @Override
    @Transactional
    public void updatePerson(Person p) {
        this.personDAO.updatePerson(p);
    }

    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        this.personDAO.removePerson(id);
    }

}