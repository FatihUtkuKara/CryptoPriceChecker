package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class CurrentPrice {

    @SerializedName("usd")
    @Expose
    double usd;

    @SerializedName("btc")
    double btc;




    public void setUsd(double usd) {
        this.usd = usd;
    }
    public double getUsd() {
        return usd;
    }

    public void setBtc(double btc) {
        this.btc = btc;
    }
    public double getBtc() {
        return btc;
    }
}
