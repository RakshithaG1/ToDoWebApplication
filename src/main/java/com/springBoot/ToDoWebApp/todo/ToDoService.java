package com.springBoot.ToDoWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private static List<ToDO> toDos = new ArrayList<>();
    static  {
        toDos.add(new ToDO(1, "Keshava", "Learn React JS", false, LocalDate.now().plusYears(1)));
        toDos.add(new ToDO(1, "Govinda", "Docker", false, LocalDate.now().plusMonths(6)));
        toDos.add(new ToDO(1, "Madhava", "Learn Spring Boot", false, LocalDate.now().plusWeeks(3)));
    }

    public List<ToDO> findByUserName(String userName){
        return  toDos;
    }
}
