 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class ConvertedLast {

   @SerializedName("btc")
   double btc;

   @SerializedName("eth")
   double eth;

   @SerializedName("usd")
   int usd;


    public void setBtc(double btc) {
        this.btc = btc;
    }
    public double getBtc() {
        return btc;
    }
    
    public void setEth(double eth) {
        this.eth = eth;
    }
    public double getEth() {
        return eth;
    }
    
    public void setUsd(int usd) {
        this.usd = usd;
    }
    public int getUsd() {
        return usd;
    }
    
}