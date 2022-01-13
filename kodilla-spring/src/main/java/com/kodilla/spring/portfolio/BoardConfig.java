package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {

    @Autowired
    @Qualifier ("toDoList") private TaskList toDolist;

    @Autowired
    @Qualifier ("inProgressList") private TaskList inProgressList;

    @Autowired
    @Qualifier ("doneList") private TaskList doneList;


    @Bean
    public Board board() {
        return  new Board(toDolist, inProgressList, doneList);
    }

    @Bean (name="toDoList")
    @Scope("prototype")
    public TaskList getToDolist() {
        return new TaskList();
    }
    @Bean (name="inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean (name="doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
