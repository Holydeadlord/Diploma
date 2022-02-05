package com.demo.demo.dao;
import com.demo.demo.model.Person;
import java.util.UUID;
public interface PersonDao {
    int insertPerson(UUID id, Person person); //вставляем чела с имеющимся идентификатором

    default  int insertPerson(Person person) { //нет идентиф. и генерим его
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
}
