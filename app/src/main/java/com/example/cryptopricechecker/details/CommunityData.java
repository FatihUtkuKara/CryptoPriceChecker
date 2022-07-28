 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class CommunityData {

   @SerializedName("facebook_likes")
   String facebookLikes;

   @SerializedName("twitter_followers")
   int twitterFollowers;

   @SerializedName("reddit_average_posts_48h")
   double redditAveragePosts48h;

   @SerializedName("reddit_average_comments_48h")
   double redditAverageComments48h;

   @SerializedName("reddit_subscribers")
   int redditSubscribers;

   @SerializedName("reddit_accounts_active_48h")
   int redditAccountsActive48h;

   @SerializedName("telegram_channel_user_count")
   String telegramChannelUserCount;


    public void setFacebookLikes(String facebookLikes) {
        this.facebookLikes = facebookLikes;
    }
    public String getFacebookLikes() {
        return facebookLikes;
    }
    
    public void setTwitterFollowers(int twitterFollowers) {
        this.twitterFollowers = twitterFollowers;
    }
    public int getTwitterFollowers() {
        return twitterFollowers;
    }
    
    public void setRedditAveragePosts48h(double redditAveragePosts48h) {
        this.redditAveragePosts48h = redditAveragePosts48h;
    }
    public double getRedditAveragePosts48h() {
        return redditAveragePosts48h;
    }
    
    public void setRedditAverageComments48h(double redditAverageComments48h) {
        this.redditAverageComments48h = redditAverageComments48h;
    }
    public double getRedditAverageComments48h() {
        return redditAverageComments48h;
    }
    
    public void setRedditSubscribers(int redditSubscribers) {
        this.redditSubscribers = redditSubscribers;
    }
    public int getRedditSubscribers() {
        return redditSubscribers;
    }
    
    public void setRedditAccountsActive48h(int redditAccountsActive48h) {
        this.redditAccountsActive48h = redditAccountsActive48h;
    }
    public int getRedditAccountsActive48h() {
        return redditAccountsActive48h;
    }
    
    public void setTelegramChannelUserCount(String telegramChannelUserCount) {
        this.telegramChannelUserCount = telegramChannelUserCount;
    }
    public String getTelegramChannelUserCount() {
        return telegramChannelUserCount;
    }
    
}