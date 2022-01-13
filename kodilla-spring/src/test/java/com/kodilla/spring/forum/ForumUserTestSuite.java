package com.kodilla.spring.forum;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String name = forumUser.getUsername();
        //Then
        assertEquals("John Smith", name);
    }
    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }


}