 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class Image {

   @SerializedName("thumb")
   String thumb;

   @SerializedName("small")
   String small;

   @SerializedName("large")
   String large;


    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
    public String getThumb() {
        return thumb;
    }
    
    public void setSmall(String small) {
        this.small = small;
    }
    public String getSmall() {
        return small;
    }
    
    public void setLarge(String large) {
        this.large = large;
    }
    public String getLarge() {
        return large;
    }
    
}