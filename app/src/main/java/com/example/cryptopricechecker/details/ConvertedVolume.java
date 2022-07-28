 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class ConvertedVolume {

   @SerializedName("btc")
   int btc;

   @SerializedName("eth")
   int eth;

   @SerializedName("usd")
   int usd;


    public void setBtc(int btc) {
        this.btc = btc;
    }
    public int getBtc() {
        return btc;
    }
    
    public void setEth(int eth) {
        this.eth = eth;
    }
    public int getEth() {
        return eth;
    }
    
    public void setUsd(int usd) {
        this.usd = usd;
    }
    public int getUsd() {
        return usd;
    }
    
}