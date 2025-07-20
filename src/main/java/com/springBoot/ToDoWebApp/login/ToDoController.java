package com.springBoot.ToDoWebApp.login;

import com.springBoot.ToDoWebApp.todo.ToDO;
import com.springBoot.ToDoWebApp.todo.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("param.name")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        super();
        this.toDoService = toDoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodo(ModelMap model) {
        List<ToDO> list = toDoService.findByUserName("RakshithaG");
        model.put("toDos", list);
        return "listToDos";
    }


}


