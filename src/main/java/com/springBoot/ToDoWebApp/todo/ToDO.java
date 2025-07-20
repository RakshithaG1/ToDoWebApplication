package com.springBoot.ToDoWebApp.todo;

import java.time.LocalDate;

//DataBase Mysql/Oracle
//static List ofToDo
public class ToDO {

    private int id;
    private String userName;
    private String description;
    private LocalDate targetDate;
    private  boolean done;

    public ToDO(int id, String userName, String description, boolean done, LocalDate targetDate) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.done = done;
        this.targetDate = targetDate;
    }

    public int getId() {
        return id;
    }

    public boolean isDone() {
        return done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public String getDescription() {
        return description;
    }

    public String getUserName() {
        return userName;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ToDO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
