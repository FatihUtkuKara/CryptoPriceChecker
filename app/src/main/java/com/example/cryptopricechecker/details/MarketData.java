package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class MarketData {

    @SerializedName("current_price")
    @Expose
    CurrentPrice currentPrice;

    @SerializedName("market_cap")
    MarketCap marketCap;

    @SerializedName("ath")
    Ath ath;

    @SerializedName("total_supply")
    double totalSupply;

    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setMarketCap(MarketCap marketCap) {
        this.marketCap = marketCap;
    }
    public MarketCap getMarketCap() {
        return marketCap;
    }

    public void setAth(Ath ath) {
        this.ath = ath;
    }
    public Ath getAth() {
        return ath;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }
    public double getTotalSupply() {
        return totalSupply;
    }


}
