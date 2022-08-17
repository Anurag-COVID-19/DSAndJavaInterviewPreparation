package com.bean;

import java.util.List;

public class TwitterApiList {

    private List<TwitterApi> twitterApis;

    public List<TwitterApi> getTwitterApis() {
        return twitterApis;
    }

    public void setTwitterApis(List<TwitterApi> twitterApis) {
        this.twitterApis = twitterApis;
    }

    public TwitterApiList(List<TwitterApi> twitterApis) {
        this.twitterApis = twitterApis;
    }
}
