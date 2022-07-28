 package com.example.cryptopricechecker.details;

import com.google.gson.annotations.SerializedName;

   
public class Market {

   @SerializedName("name")
   String name;

   @SerializedName("identifier")
   String identifier;

   @SerializedName("has_trading_incentive")
   boolean hasTradingIncentive;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public String getIdentifier() {
        return identifier;
    }
    
    public void setHasTradingIncentive(boolean hasTradingIncentive) {
        this.hasTradingIncentive = hasTradingIncentive;
    }
    public boolean getHasTradingIncentive() {
        return hasTradingIncentive;
    }
    
}