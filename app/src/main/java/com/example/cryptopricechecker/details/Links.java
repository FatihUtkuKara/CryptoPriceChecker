 package com.example.cryptopricechecker.details;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Links {

   @SerializedName("homepage")
   List<String> homepage;

   @SerializedName("official_forum_url")
   List<String> officialForumUrl;


    public void setHomepage(List<String> homepage) {
        this.homepage = homepage;
    }
    public List<String> getHomepage() {
        return homepage;
    }
    
    public void setOfficialForumUrl(List<String> officialForumUrl) {
        this.officialForumUrl = officialForumUrl;
    }
    public List<String> getOfficialForumUrl() {
        return officialForumUrl;
    }
    
}