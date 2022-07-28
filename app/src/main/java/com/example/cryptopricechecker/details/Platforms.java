 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class Platforms {

   @SerializedName("bitcoin")
   String bitcoin;


    public void set(String bitcoin) {
        this.bitcoin = bitcoin;
    }
    public String get() {
        return bitcoin;
    }
    
}