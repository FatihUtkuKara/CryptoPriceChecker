
package com.example.cryptopricechecker.cryptos; ;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Monero {

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
