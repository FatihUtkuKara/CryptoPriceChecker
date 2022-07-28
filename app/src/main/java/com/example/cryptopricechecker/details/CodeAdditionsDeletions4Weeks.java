 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class CodeAdditionsDeletions4Weeks {

   @SerializedName("additions")
   int additions;

   @SerializedName("deletions")
   int deletions;


    public void setAdditions(int additions) {
        this.additions = additions;
    }
    public int getAdditions() {
        return additions;
    }
    
    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }
    public int getDeletions() {
        return deletions;
    }
    
}