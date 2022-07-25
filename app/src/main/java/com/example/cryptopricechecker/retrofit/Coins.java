package com.example.cryptopricechecker.retrofit;

public class Coins {
    private String coinName;

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCoinPrice() {
        return coinPrice;
    }

    public void setCoinPrice(String coinPrice) {
        this.coinPrice = coinPrice;
    }

    public String getCoinImage() {
        return coinImage;
    }

    public void setCoinImage(String coinImage) {
        this.coinImage = coinImage;
    }

    private String coinPrice;

    public Coins(String coinName, String coinPrice, String coinImage) {
        this.coinName = coinName;
        this.coinPrice = coinPrice;
        this.coinImage = coinImage;
    }

    private String coinImage ;

}
