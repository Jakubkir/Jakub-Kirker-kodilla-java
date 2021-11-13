package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultStringOfForum = theForum.getList().stream()
                .filter(forum -> forum.getSex() == 'M')
                .filter(forum -> forum.getBrightDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forum -> forum.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getSignature,forum -> forum));

        System.out.println("# elements: " + theResultStringOfForum.size());
        theResultStringOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}