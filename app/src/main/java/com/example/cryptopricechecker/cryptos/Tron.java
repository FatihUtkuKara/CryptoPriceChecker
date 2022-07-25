
package com.example.cryptopricechecker.cryptos; ;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Tron {

    @SerializedName("usd")
    @Expose
    private Double usd;

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

}
