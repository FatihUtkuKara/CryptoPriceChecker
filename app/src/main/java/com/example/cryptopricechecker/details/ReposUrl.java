 package com.example.cryptopricechecker.details;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class ReposUrl {

   @SerializedName("github")
   List<String> github;

   @SerializedName("bitbucket")
   List<String> bitbucket;


    public void setGithub(List<String> github) {
        this.github = github;
    }
    public List<String> getGithub() {
        return github;
    }
    
    public void setBitbucket(List<String> bitbucket) {
        this.bitbucket = bitbucket;
    }
    public List<String> getBitbucket() {
        return bitbucket;
    }
    
}