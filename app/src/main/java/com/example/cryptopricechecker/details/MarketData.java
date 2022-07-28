 package com.example.cryptopricechecker.details;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class MarketData {

   @SerializedName("current_price")
   CurrentPrice currentPrice;

   @SerializedName("total_value_locked")
   String totalValueLocked;

   @SerializedName("mcap_to_tvl_ratio")
   String mcapToTvlRatio;

   @SerializedName("fdv_to_tvl_ratio")
   String fdvToTvlRatio;

   @SerializedName("roi")
   String roi;

   @SerializedName("ath")
   Ath ath;

   @SerializedName("ath_change_percentage")
   AthChangePercentage athChangePercentage;

   @SerializedName("ath_date")
   AthDate athDate;

   @SerializedName("atl")
   Atl atl;

   @SerializedName("atl_change_percentage")
   AtlChangePercentage atlChangePercentage;

   @SerializedName("atl_date")
   AtlDate atlDate;

   @SerializedName("market_cap")
   MarketCap marketCap;

   @SerializedName("market_cap_rank")
   int marketCapRank;

   @SerializedName("fully_diluted_valuation")
   FullyDilutedValuation fullyDilutedValuation;

   @SerializedName("total_volume")
   TotalVolume totalVolume;

   @SerializedName("high_24h")
   High24h high24h;

   @SerializedName("low_24h")
   Low24h low24h;

   @SerializedName("price_change_24h")
   double priceChange24h;

   @SerializedName("price_change_percentage_24h")
   double priceChangePercentage24h;

   @SerializedName("price_change_percentage_7d")
   double priceChangePercentage7d;

   @SerializedName("price_change_percentage_14d")
   double priceChangePercentage14d;

   @SerializedName("price_change_percentage_30d")
   double priceChangePercentage30d;

   @SerializedName("price_change_percentage_60d")
   double priceChangePercentage60d;

   @SerializedName("price_change_percentage_200d")
   double priceChangePercentage200d;

   @SerializedName("price_change_percentage_1y")
   double priceChangePercentage1y;

   @SerializedName("market_cap_change_24h")
   int marketCapChange24h;

   @SerializedName("market_cap_change_percentage_24h")
   double marketCapChangePercentage24h;

   @SerializedName("price_change_24h_in_currency")
   PriceChange24hInCurrency priceChange24hInCurrency;

   @SerializedName("price_change_percentage_1h_in_currency")
   PriceChangePercentage1hInCurrency priceChangePercentage1hInCurrency;

   @SerializedName("price_change_percentage_24h_in_currency")
   PriceChangePercentage24hInCurrency priceChangePercentage24hInCurrency;

   @SerializedName("price_change_percentage_7d_in_currency")
   PriceChangePercentage7dInCurrency priceChangePercentage7dInCurrency;

   @SerializedName("price_change_percentage_14d_in_currency")
   PriceChangePercentage14dInCurrency priceChangePercentage14dInCurrency;

   @SerializedName("price_change_percentage_30d_in_currency")
   PriceChangePercentage30dInCurrency priceChangePercentage30dInCurrency;

   @SerializedName("price_change_percentage_60d_in_currency")
   PriceChangePercentage60dInCurrency priceChangePercentage60dInCurrency;

   @SerializedName("price_change_percentage_200d_in_currency")
   PriceChangePercentage200dInCurrency priceChangePercentage200dInCurrency;

   @SerializedName("price_change_percentage_1y_in_currency")
   PriceChangePercentage1yInCurrency priceChangePercentage1yInCurrency;

   @SerializedName("market_cap_change_24h_in_currency")
   MarketCapChange24hInCurrency marketCapChange24hInCurrency;

   @SerializedName("market_cap_change_percentage_24h_in_currency")
   MarketCapChangePercentage24hInCurrency marketCapChangePercentage24hInCurrency;

   @SerializedName("total_supply")
   int totalSupply;

   @SerializedName("max_supply")
   int maxSupply;

   @SerializedName("circulating_supply")
   int circulatingSupply;

   @SerializedName("last_updated")
   Date lastUpdated;


    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }
    
    public void setTotalValueLocked(String totalValueLocked) {
        this.totalValueLocked = totalValueLocked;
    }
    public String getTotalValueLocked() {
        return totalValueLocked;
    }
    
    public void setMcapToTvlRatio(String mcapToTvlRatio) {
        this.mcapToTvlRatio = mcapToTvlRatio;
    }
    public String getMcapToTvlRatio() {
        return mcapToTvlRatio;
    }
    
    public void setFdvToTvlRatio(String fdvToTvlRatio) {
        this.fdvToTvlRatio = fdvToTvlRatio;
    }
    public String getFdvToTvlRatio() {
        return fdvToTvlRatio;
    }
    
    public void setRoi(String roi) {
        this.roi = roi;
    }
    public String getRoi() {
        return roi;
    }
    
    public void setAth(Ath ath) {
        this.ath = ath;
    }
    public Ath getAth() {
        return ath;
    }
    
    public void setAthChangePercentage(AthChangePercentage athChangePercentage) {
        this.athChangePercentage = athChangePercentage;
    }
    public AthChangePercentage getAthChangePercentage() {
        return athChangePercentage;
    }
    
    public void setAthDate(AthDate athDate) {
        this.athDate = athDate;
    }
    public AthDate getAthDate() {
        return athDate;
    }
    
    public void setAtl(Atl atl) {
        this.atl = atl;
    }
    public Atl getAtl() {
        return atl;
    }
    
    public void setAtlChangePercentage(AtlChangePercentage atlChangePercentage) {
        this.atlChangePercentage = atlChangePercentage;
    }
    public AtlChangePercentage getAtlChangePercentage() {
        return atlChangePercentage;
    }
    
    public void setAtlDate(AtlDate atlDate) {
        this.atlDate = atlDate;
    }
    public AtlDate getAtlDate() {
        return atlDate;
    }
    
    public void setMarketCap(MarketCap marketCap) {
        this.marketCap = marketCap;
    }
    public MarketCap getMarketCap() {
        return marketCap;
    }
    
    public void setMarketCapRank(int marketCapRank) {
        this.marketCapRank = marketCapRank;
    }
    public int getMarketCapRank() {
        return marketCapRank;
    }
    
    public void setFullyDilutedValuation(FullyDilutedValuation fullyDilutedValuation) {
        this.fullyDilutedValuation = fullyDilutedValuation;
    }
    public FullyDilutedValuation getFullyDilutedValuation() {
        return fullyDilutedValuation;
    }
    
    public void setTotalVolume(TotalVolume totalVolume) {
        this.totalVolume = totalVolume;
    }
    public TotalVolume getTotalVolume() {
        return totalVolume;
    }
    
    public void setHigh24h(High24h high24h) {
        this.high24h = high24h;
    }
    public High24h getHigh24h() {
        return high24h;
    }
    
    public void setLow24h(Low24h low24h) {
        this.low24h = low24h;
    }
    public Low24h getLow24h() {
        return low24h;
    }
    
    public void setPriceChange24h(double priceChange24h) {
        this.priceChange24h = priceChange24h;
    }
    public double getPriceChange24h() {
        return priceChange24h;
    }
    
    public void setPriceChangePercentage24h(double priceChangePercentage24h) {
        this.priceChangePercentage24h = priceChangePercentage24h;
    }
    public double getPriceChangePercentage24h() {
        return priceChangePercentage24h;
    }
    
    public void setPriceChangePercentage7d(double priceChangePercentage7d) {
        this.priceChangePercentage7d = priceChangePercentage7d;
    }
    public double getPriceChangePercentage7d() {
        return priceChangePercentage7d;
    }
    
    public void setPriceChangePercentage14d(double priceChangePercentage14d) {
        this.priceChangePercentage14d = priceChangePercentage14d;
    }
    public double getPriceChangePercentage14d() {
        return priceChangePercentage14d;
    }
    
    public void setPriceChangePercentage30d(double priceChangePercentage30d) {
        this.priceChangePercentage30d = priceChangePercentage30d;
    }
    public double getPriceChangePercentage30d() {
        return priceChangePercentage30d;
    }
    
    public void setPriceChangePercentage60d(double priceChangePercentage60d) {
        this.priceChangePercentage60d = priceChangePercentage60d;
    }
    public double getPriceChangePercentage60d() {
        return priceChangePercentage60d;
    }
    
    public void setPriceChangePercentage200d(double priceChangePercentage200d) {
        this.priceChangePercentage200d = priceChangePercentage200d;
    }
    public double getPriceChangePercentage200d() {
        return priceChangePercentage200d;
    }
    
    public void setPriceChangePercentage1y(double priceChangePercentage1y) {
        this.priceChangePercentage1y = priceChangePercentage1y;
    }
    public double getPriceChangePercentage1y() {
        return priceChangePercentage1y;
    }
    
    public void setMarketCapChange24h(int marketCapChange24h) {
        this.marketCapChange24h = marketCapChange24h;
    }
    public int getMarketCapChange24h() {
        return marketCapChange24h;
    }
    
    public void setMarketCapChangePercentage24h(double marketCapChangePercentage24h) {
        this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    }
    public double getMarketCapChangePercentage24h() {
        return marketCapChangePercentage24h;
    }
    
    public void setPriceChange24hInCurrency(PriceChange24hInCurrency priceChange24hInCurrency) {
        this.priceChange24hInCurrency = priceChange24hInCurrency;
    }
    public PriceChange24hInCurrency getPriceChange24hInCurrency() {
        return priceChange24hInCurrency;
    }
    
    public void setPriceChangePercentage1hInCurrency(PriceChangePercentage1hInCurrency priceChangePercentage1hInCurrency) {
        this.priceChangePercentage1hInCurrency = priceChangePercentage1hInCurrency;
    }
    public PriceChangePercentage1hInCurrency getPriceChangePercentage1hInCurrency() {
        return priceChangePercentage1hInCurrency;
    }
    
    public void setPriceChangePercentage24hInCurrency(PriceChangePercentage24hInCurrency priceChangePercentage24hInCurrency) {
        this.priceChangePercentage24hInCurrency = priceChangePercentage24hInCurrency;
    }
    public PriceChangePercentage24hInCurrency getPriceChangePercentage24hInCurrency() {
        return priceChangePercentage24hInCurrency;
    }
    
    public void setPriceChangePercentage7dInCurrency(PriceChangePercentage7dInCurrency priceChangePercentage7dInCurrency) {
        this.priceChangePercentage7dInCurrency = priceChangePercentage7dInCurrency;
    }
    public PriceChangePercentage7dInCurrency getPriceChangePercentage7dInCurrency() {
        return priceChangePercentage7dInCurrency;
    }
    
    public void setPriceChangePercentage14dInCurrency(PriceChangePercentage14dInCurrency priceChangePercentage14dInCurrency) {
        this.priceChangePercentage14dInCurrency = priceChangePercentage14dInCurrency;
    }
    public PriceChangePercentage14dInCurrency getPriceChangePercentage14dInCurrency() {
        return priceChangePercentage14dInCurrency;
    }
    
    public void setPriceChangePercentage30dInCurrency(PriceChangePercentage30dInCurrency priceChangePercentage30dInCurrency) {
        this.priceChangePercentage30dInCurrency = priceChangePercentage30dInCurrency;
    }
    public PriceChangePercentage30dInCurrency getPriceChangePercentage30dInCurrency() {
        return priceChangePercentage30dInCurrency;
    }
    
    public void setPriceChangePercentage60dInCurrency(PriceChangePercentage60dInCurrency priceChangePercentage60dInCurrency) {
        this.priceChangePercentage60dInCurrency = priceChangePercentage60dInCurrency;
    }
    public PriceChangePercentage60dInCurrency getPriceChangePercentage60dInCurrency() {
        return priceChangePercentage60dInCurrency;
    }
    
    public void setPriceChangePercentage200dInCurrency(PriceChangePercentage200dInCurrency priceChangePercentage200dInCurrency) {
        this.priceChangePercentage200dInCurrency = priceChangePercentage200dInCurrency;
    }
    public PriceChangePercentage200dInCurrency getPriceChangePercentage200dInCurrency() {
        return priceChangePercentage200dInCurrency;
    }
    
    public void setPriceChangePercentage1yInCurrency(PriceChangePercentage1yInCurrency priceChangePercentage1yInCurrency) {
        this.priceChangePercentage1yInCurrency = priceChangePercentage1yInCurrency;
    }
    public PriceChangePercentage1yInCurrency getPriceChangePercentage1yInCurrency() {
        return priceChangePercentage1yInCurrency;
    }
    
    public void setMarketCapChange24hInCurrency(MarketCapChange24hInCurrency marketCapChange24hInCurrency) {
        this.marketCapChange24hInCurrency = marketCapChange24hInCurrency;
    }
    public MarketCapChange24hInCurrency getMarketCapChange24hInCurrency() {
        return marketCapChange24hInCurrency;
    }
    
    public void setMarketCapChangePercentage24hInCurrency(MarketCapChangePercentage24hInCurrency marketCapChangePercentage24hInCurrency) {
        this.marketCapChangePercentage24hInCurrency = marketCapChangePercentage24hInCurrency;
    }
    public MarketCapChangePercentage24hInCurrency getMarketCapChangePercentage24hInCurrency() {
        return marketCapChangePercentage24hInCurrency;
    }
    
    public void setTotalSupply(int totalSupply) {
        this.totalSupply = totalSupply;
    }
    public int getTotalSupply() {
        return totalSupply;
    }
    
    public void setMaxSupply(int maxSupply) {
        this.maxSupply = maxSupply;
    }
    public int getMaxSupply() {
        return maxSupply;
    }
    
    public void setCirculatingSupply(int circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }
    public int getCirculatingSupply() {
        return circulatingSupply;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    
}