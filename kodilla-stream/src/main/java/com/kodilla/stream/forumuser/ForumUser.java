package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int signature;
    private final String username;
    private final char sex;
    private final LocalDate brightDate;
    private final int numberOfPosts;

    public ForumUser(int signature, String username, char sex, int yearOfBirth, int monthOfBright, int dayOfBright, int numberOfPosts) {
        this.signature = signature;
        this.username = username;
        this.sex = sex;
        this.brightDate = LocalDate.of(yearOfBirth,monthOfBright,dayOfBright);
        this.numberOfPosts = numberOfPosts;
    }

    public int getSignature() {
        return signature;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBrightDate() {
        return brightDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "signature=" + signature +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", brightDate=" + brightDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
