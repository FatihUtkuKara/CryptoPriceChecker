
package com.example.cryptopricechecker; ;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BtcPrice {

    @SerializedName("bitcoin")
    @Expose
    private Bitcoin bitcoin;

    public Bitcoin getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(Bitcoin bitcoin) {
        this.bitcoin = bitcoin;
    }

}
