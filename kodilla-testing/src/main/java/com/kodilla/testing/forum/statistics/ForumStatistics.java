package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userNo;
    private int postNo;
    private int comentsNo;
    private double avgComentsUser;
    private double avgComenstPost;
    private double avgPostUser;

    public void calculateAdvStatistics(Statistics statistics) {
        userNo = statistics.usersNames().size();
        postNo = statistics.postsCount();
        comentsNo = statistics.commentsCount();
        if (userNo > 0) {
            avgPostUser = (double) postNo / userNo;
        } else {
            avgPostUser = -1;
        }
        if (userNo > 0) {
            avgComentsUser = (double) comentsNo / userNo;
        } else {
            avgComentsUser = -1;
        }
        if (postNo > 0) {
            avgComenstPost = (double) comentsNo / postNo;
        } else {
            avgComenstPost = -1;
        }
    }

    public int getUserNo() {
        return userNo;
    }

    public int getPostNo() {
        return postNo;
    }

    public int getComentsNo() {
        return comentsNo;
    }

    public double getAvgComentsUser() {
        return avgComentsUser;
    }

    public double getAvgComenstPost() {
        return avgComenstPost;
    }

    public double getAvgPostUser() {
        return avgPostUser;
    }
}
