 package com.example.cryptopricechecker.details;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class BaseJson2POJO {

   @SerializedName("id")
   String id;

   @SerializedName("symbol")
   String symbol;

   @SerializedName("name")
   String name;

    @SerializedName("description")
    Description description;

    @SerializedName("links")
    Links links;

    @SerializedName("image")
    Image image;

    @SerializedName("genesis_date")
    String genesis_date;

    @SerializedName("market_data")
    MarketData marketData;

    @SerializedName("market_cap_rank")
    int marketCapRank;





    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setDescription(Description description) {
        this.description = description;
    }
    public Description getDescription() {
        return description;
    }

    public Links getLinks() {
        return links;
    }

    public Image getImage() {
        return image;
    }

    public String getGenesisDate() {
        return genesis_date;
    }

   public void setMarketData(MarketData marketData) {
        this.marketData = marketData;
    }
   public MarketData getMarketData() {
        return marketData;
    }


    public void setMarketCapRank(int marketCapRank) {
        this.marketCapRank = marketCapRank;
    }
    public int getMarketCapRank() {
        return marketCapRank;
    }



}