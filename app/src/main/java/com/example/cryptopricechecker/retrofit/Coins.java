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

    public String getCoinCode() {
        return coinCode;
    }

    public void setCoinCode(String coinCode) {
        this.coinCode = coinCode;
    }

    private String coinPrice;

    public Coins(String coinName, String coinPrice, String coinCode) {
        this.coinName = coinName;
        this.coinPrice = coinPrice;
        this.coinCode = coinCode;
    }

    private String coinCode ;

}
