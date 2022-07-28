 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class PublicInterestStats {

   @SerializedName("alexa_rank")
   int alexaRank;

   @SerializedName("bing_matches")
   String bingMatches;


    public void setAlexaRank(int alexaRank) {
        this.alexaRank = alexaRank;
    }
    public int getAlexaRank() {
        return alexaRank;
    }
    
    public void setBingMatches(String bingMatches) {
        this.bingMatches = bingMatches;
    }
    public String getBingMatches() {
        return bingMatches;
    }
    
}