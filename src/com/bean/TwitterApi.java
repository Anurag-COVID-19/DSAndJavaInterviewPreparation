package com.bean;

public class TwitterApi
{
    int numberOfLikes;

    public TwitterApi() {}
    public TwitterApi(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
}
