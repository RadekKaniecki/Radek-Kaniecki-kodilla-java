package com.kodilla.testing.forum.statistics;

public class Calculate {
    Statistics statistics;
    private int usersAmount;
    private int postsAmount;
    private int commentsAmount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public Calculate(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersAmount = statistics.usersNames().size();
        this.postsAmount = statistics.postsCount();
        this.commentsAmount = statistics.commentsCount();

        this.averagePostsPerUser = (double) postsAmount / usersAmount;
        this.averageCommentsPerUser = (double) commentsAmount / usersAmount;
        this.averageCommentsPerPost = (double) commentsAmount / postsAmount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public String showStatistics() {
        return "Amount of users: " + this.usersAmount +
                "\nAmount of posts: " + this.postsAmount +
                "\nAmount of comments: " + this.commentsAmount +
                "\nAverage posts per user: " + this.averagePostsPerUser +
                "\nAverage comments per user: " + this.averageCommentsPerUser +
                "\nAverage comments per post: " + this.averageCommentsPerPost;
    }
}
