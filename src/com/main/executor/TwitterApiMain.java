package com.main.executor;

import com.bean.TwitterApi;
import com.bean.TwitterApiList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TwitterApiMain
{

    public static void main(String[] args) {

        TwitterApiList twitterApiList = new TwitterApiList(Arrays.asList(new TwitterApi(10),
                new TwitterApi(20),
                new TwitterApi(15),
                new TwitterApi(5)));
        TwitterApiList twitterApiLists = (TwitterApiList) twitterApiList.getTwitterApis();

        TwitterApi twitterApi = new TwitterApi(20);
        TwitterApi nextTwitterApi = new TwitterApi();
        nextTwitterApi.setNumberOfLikes(20);

        List<TwitterApi> twitterApisNumeberOfLikes = twitterApiList.getTwitterApis();

    }

    public static TwitterApiList getMaximum3OutOf4()
    {
        TwitterApiList twitterApiList = new TwitterApiList(Arrays.asList(new TwitterApi(10),
                new TwitterApi(20),
                new TwitterApi(15),
                new TwitterApi(5)));

        /*Collections.sort(twitterApiList.getTwitterApis(), new Comparator<TwitterApi>(){
            @Override
            public int compare(TwitterApi twitterApiFirst, TwitterApi twitterApiSecond)
            {
                return twitterApiFirst.getNumberOfLikes().compareTo(twitterApiSecond.getNumberOfLikes());
            }
        });*/
        return twitterApiList;
    }
}
