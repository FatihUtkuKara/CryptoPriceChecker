
package com.example.cryptopricechecker; ;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Bitcoin {

    @SerializedName("usd")
    @Expose
    private Integer usd;

    public Integer getUsd() {
        return usd;
    }

    public void setUsd(Integer usd) {
        this.usd = usd;
    }

}
