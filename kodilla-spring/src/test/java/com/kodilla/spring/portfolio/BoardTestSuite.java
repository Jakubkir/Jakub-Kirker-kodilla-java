package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToDoList("Smieci");
        board.addInProgressList("Nauka");
        board.addDoneList("Obiad");
        //Then
        assertEquals("Smieci", board.getToDoList().getTasks().get(0));
        assertEquals("Nauka", board.getInProgressList().getTasks().get(0));
        assertEquals("Obiad", board.getDoneList().getTasks().get(0));
    }
}
