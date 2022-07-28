 package com.example.cryptopricechecker.details;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Links {

   @SerializedName("homepage")
   List<String> homepage;

   @SerializedName("blockchain_site")
   List<String> blockchainSite;

   @SerializedName("official_forum_url")
   List<String> officialForumUrl;

   @SerializedName("chat_url")
   List<String> chatUrl;

   @SerializedName("announcement_url")
   List<String> announcementUrl;

   @SerializedName("twitter_screen_name")
   String twitterScreenName;

   @SerializedName("facebook_username")
   String facebookUsername;

   @SerializedName("bitcointalk_thread_identifier")
   String bitcointalkThreadIdentifier;

   @SerializedName("telegram_channel_identifier")
   String telegramChannelIdentifier;

   @SerializedName("subreddit_url")
   String subredditUrl;

   @SerializedName("repos_url")
   ReposUrl reposUrl;


    public void setHomepage(List<String> homepage) {
        this.homepage = homepage;
    }
    public List<String> getHomepage() {
        return homepage;
    }
    
    public void setBlockchainSite(List<String> blockchainSite) {
        this.blockchainSite = blockchainSite;
    }
    public List<String> getBlockchainSite() {
        return blockchainSite;
    }
    
    public void setOfficialForumUrl(List<String> officialForumUrl) {
        this.officialForumUrl = officialForumUrl;
    }
    public List<String> getOfficialForumUrl() {
        return officialForumUrl;
    }
    
    public void setChatUrl(List<String> chatUrl) {
        this.chatUrl = chatUrl;
    }
    public List<String> getChatUrl() {
        return chatUrl;
    }
    
    public void setAnnouncementUrl(List<String> announcementUrl) {
        this.announcementUrl = announcementUrl;
    }
    public List<String> getAnnouncementUrl() {
        return announcementUrl;
    }
    
    public void setTwitterScreenName(String twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
    }
    public String getTwitterScreenName() {
        return twitterScreenName;
    }
    
    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }
    public String getFacebookUsername() {
        return facebookUsername;
    }
    
    public void setBitcointalkThreadIdentifier(String bitcointalkThreadIdentifier) {
        this.bitcointalkThreadIdentifier = bitcointalkThreadIdentifier;
    }
    public String getBitcointalkThreadIdentifier() {
        return bitcointalkThreadIdentifier;
    }
    
    public void setTelegramChannelIdentifier(String telegramChannelIdentifier) {
        this.telegramChannelIdentifier = telegramChannelIdentifier;
    }
    public String getTelegramChannelIdentifier() {
        return telegramChannelIdentifier;
    }
    
    public void setSubredditUrl(String subredditUrl) {
        this.subredditUrl = subredditUrl;
    }
    public String getSubredditUrl() {
        return subredditUrl;
    }
    
    public void setReposUrl(ReposUrl reposUrl) {
        this.reposUrl = reposUrl;
    }
    public ReposUrl getReposUrl() {
        return reposUrl;
    }
    
}