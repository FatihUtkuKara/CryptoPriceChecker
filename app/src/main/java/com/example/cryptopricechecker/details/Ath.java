package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Ath {
    @SerializedName("usd")
    double usd;

    public void setUsd(double usd) {
        this.usd = usd;
    }
    public double getUsd() {
        return usd;
    }
}
