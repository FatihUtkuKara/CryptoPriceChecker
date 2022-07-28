 package com.example.cryptopricechecker.details;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Tickers {

   @SerializedName("base")
   String base;

   @SerializedName("target")
   String target;

   @SerializedName("market")
   Market market;

   @SerializedName("last")
   double last;

   @SerializedName("volume")
   double volume;

   @SerializedName("converted_last")
   ConvertedLast convertedLast;

   @SerializedName("converted_volume")
   ConvertedVolume convertedVolume;

   @SerializedName("trust_score")
   String trustScore;

   @SerializedName("bid_ask_spread_percentage")
   double bidAskSpreadPercentage;

   @SerializedName("timestamp")
   Date timestamp;

   @SerializedName("last_traded_at")
   Date lastTradedAt;

   @SerializedName("last_fetch_at")
   Date lastFetchAt;

   @SerializedName("is_anomaly")
   boolean isAnomaly;

   @SerializedName("is_stale")
   boolean isStale;

   @SerializedName("trade_url")
   String tradeUrl;

   @SerializedName("token_info_url")
   String tokenInfoUrl;

   @SerializedName("coin_id")
   String coinId;

   @SerializedName("target_coin_id")
   String targetCoinId;


    public void setBase(String base) {
        this.base = base;
    }
    public String getBase() {
        return base;
    }
    
    public void setTarget(String target) {
        this.target = target;
    }
    public String getTarget() {
        return target;
    }
    
    public void setMarket(Market market) {
        this.market = market;
    }
    public Market getMarket() {
        return market;
    }
    
    public void setLast(double last) {
        this.last = last;
    }
    public double getLast() {
        return last;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
    
    public void setConvertedLast(ConvertedLast convertedLast) {
        this.convertedLast = convertedLast;
    }
    public ConvertedLast getConvertedLast() {
        return convertedLast;
    }
    
    public void setConvertedVolume(ConvertedVolume convertedVolume) {
        this.convertedVolume = convertedVolume;
    }
    public ConvertedVolume getConvertedVolume() {
        return convertedVolume;
    }
    
    public void setTrustScore(String trustScore) {
        this.trustScore = trustScore;
    }
    public String getTrustScore() {
        return trustScore;
    }
    
    public void setBidAskSpreadPercentage(double bidAskSpreadPercentage) {
        this.bidAskSpreadPercentage = bidAskSpreadPercentage;
    }
    public double getBidAskSpreadPercentage() {
        return bidAskSpreadPercentage;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setLastTradedAt(Date lastTradedAt) {
        this.lastTradedAt = lastTradedAt;
    }
    public Date getLastTradedAt() {
        return lastTradedAt;
    }
    
    public void setLastFetchAt(Date lastFetchAt) {
        this.lastFetchAt = lastFetchAt;
    }
    public Date getLastFetchAt() {
        return lastFetchAt;
    }
    
    public void setIsAnomaly(boolean isAnomaly) {
        this.isAnomaly = isAnomaly;
    }
    public boolean getIsAnomaly() {
        return isAnomaly;
    }
    
    public void setIsStale(boolean isStale) {
        this.isStale = isStale;
    }
    public boolean getIsStale() {
        return isStale;
    }
    
    public void setTradeUrl(String tradeUrl) {
        this.tradeUrl = tradeUrl;
    }
    public String getTradeUrl() {
        return tradeUrl;
    }
    
    public void setTokenInfoUrl(String tokenInfoUrl) {
        this.tokenInfoUrl = tokenInfoUrl;
    }
    public String getTokenInfoUrl() {
        return tokenInfoUrl;
    }
    
    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }
    public String getCoinId() {
        return coinId;
    }
    
    public void setTargetCoinId(String targetCoinId) {
        this.targetCoinId = targetCoinId;
    }
    public String getTargetCoinId() {
        return targetCoinId;
    }
    
}