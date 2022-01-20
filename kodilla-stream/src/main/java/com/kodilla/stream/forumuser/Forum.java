package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Adam", 'M', 1992, 5, 19, 4));
        theForumUserList.add(new ForumUser(2, "Ola", 'F', 1999, 6, 5, 0));
        theForumUserList.add(new ForumUser(3, "Kasia", 'F', 1962, 12, 11, 1));
        theForumUserList.add(new ForumUser(4, "Zenon", 'M', 2005, 6, 5, 2));
        theForumUserList.add(new ForumUser(5, "Adrian", 'M', 2000, 1, 1, 0));
        theForumUserList.add(new ForumUser(6, "Józef", 'M', 2001, 2, 2, 1));
        theForumUserList.add(new ForumUser(7, "Mikołaj", 'M', 2008, 8, 19, 7));
        theForumUserList.add(new ForumUser(8, "Izabella", 'F', 1992, 10, 25, 0));
        theForumUserList.add(new ForumUser(9, "Patrycja", 'F', 2010, 9, 9, 0));
        theForumUserList.add(new ForumUser(10, "Tomasz", 'M', 1997, 12, 13, 2));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
