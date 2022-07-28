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

   @SerializedName("asset_platform_id")
   String assetPlatformId;

   @SerializedName("platforms")
   Platforms platforms;

   @SerializedName("block_time_in_minutes")
   int blockTimeInMinutes;

   @SerializedName("hashing_algorithm")
   Date hashingAlgorithm;

   @SerializedName("categories")
   List<String> categories;

   @SerializedName("public_notice")
   String publicNotice;

   @SerializedName("additional_notices")
   List<String> additionalNotices;

   @SerializedName("localization")
   Localization localization;

   @SerializedName("description")
   Description description;

   @SerializedName("links")
   Links links;

   @SerializedName("image")
   Image image;

   @SerializedName("country_origin")
   String countryOrigin;

   @SerializedName("genesis_date")
   Date genesisDate;

   @SerializedName("sentiment_votes_up_percentage")
   double sentimentVotesUpPercentage;

   @SerializedName("sentiment_votes_down_percentage")
   double sentimentVotesDownPercentage;

   @SerializedName("market_cap_rank")
   int marketCapRank;

   @SerializedName("coingecko_rank")
   int coingeckoRank;

   @SerializedName("coingecko_score")
   double coingeckoScore;

   @SerializedName("developer_score")
   double developerScore;

   @SerializedName("community_score")
   double communityScore;

   @SerializedName("liquidity_score")
   double liquidityScore;

   @SerializedName("public_interest_score")
   double publicInterestScore;

   @SerializedName("market_data")
   MarketData marketData;

   @SerializedName("community_data")
   CommunityData communityData;

   @SerializedName("developer_data")
   DeveloperData developerData;

   @SerializedName("public_interest_stats")
   PublicInterestStats publicInterestStats;

   @SerializedName("status_updates")
   List<String> statusUpdates;

   @SerializedName("last_updated")
   Date lastUpdated;

   @SerializedName("tickers")
   List<Tickers> tickers;


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
    
    public void setAssetPlatformId(String assetPlatformId) {
        this.assetPlatformId = assetPlatformId;
    }
    public String getAssetPlatformId() {
        return assetPlatformId;
    }
    
    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }
    public Platforms getPlatforms() {
        return platforms;
    }
    
    public void setBlockTimeInMinutes(int blockTimeInMinutes) {
        this.blockTimeInMinutes = blockTimeInMinutes;
    }
    public int getBlockTimeInMinutes() {
        return blockTimeInMinutes;
    }
    
    public void setHashingAlgorithm(Date hashingAlgorithm) {
        this.hashingAlgorithm = hashingAlgorithm;
    }
    public Date getHashingAlgorithm() {
        return hashingAlgorithm;
    }
    
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
    public List<String> getCategories() {
        return categories;
    }
    
    public void setPublicNotice(String publicNotice) {
        this.publicNotice = publicNotice;
    }
    public String getPublicNotice() {
        return publicNotice;
    }
    
    public void setAdditionalNotices(List<String> additionalNotices) {
        this.additionalNotices = additionalNotices;
    }
    public List<String> getAdditionalNotices() {
        return additionalNotices;
    }
    
    public void setLocalization(Localization localization) {
        this.localization = localization;
    }
    public Localization getLocalization() {
        return localization;
    }
    
    public void setDescription(Description description) {
        this.description = description;
    }
    public Description getDescription() {
        return description;
    }
    
    public void setLinks(Links links) {
        this.links = links;
    }
    public Links getLinks() {
        return links;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }
    public Image getImage() {
        return image;
    }
    
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
    public String getCountryOrigin() {
        return countryOrigin;
    }
    
    public void setGenesisDate(Date genesisDate) {
        this.genesisDate = genesisDate;
    }
    public Date getGenesisDate() {
        return genesisDate;
    }
    
    public void setSentimentVotesUpPercentage(double sentimentVotesUpPercentage) {
        this.sentimentVotesUpPercentage = sentimentVotesUpPercentage;
    }
    public double getSentimentVotesUpPercentage() {
        return sentimentVotesUpPercentage;
    }
    
    public void setSentimentVotesDownPercentage(double sentimentVotesDownPercentage) {
        this.sentimentVotesDownPercentage = sentimentVotesDownPercentage;
    }
    public double getSentimentVotesDownPercentage() {
        return sentimentVotesDownPercentage;
    }
    
    public void setMarketCapRank(int marketCapRank) {
        this.marketCapRank = marketCapRank;
    }
    public int getMarketCapRank() {
        return marketCapRank;
    }
    
    public void setCoingeckoRank(int coingeckoRank) {
        this.coingeckoRank = coingeckoRank;
    }
    public int getCoingeckoRank() {
        return coingeckoRank;
    }
    
    public void setCoingeckoScore(double coingeckoScore) {
        this.coingeckoScore = coingeckoScore;
    }
    public double getCoingeckoScore() {
        return coingeckoScore;
    }
    
    public void setDeveloperScore(double developerScore) {
        this.developerScore = developerScore;
    }
    public double getDeveloperScore() {
        return developerScore;
    }
    
    public void setCommunityScore(double communityScore) {
        this.communityScore = communityScore;
    }
    public double getCommunityScore() {
        return communityScore;
    }
    
    public void setLiquidityScore(double liquidityScore) {
        this.liquidityScore = liquidityScore;
    }
    public double getLiquidityScore() {
        return liquidityScore;
    }
    
    public void setPublicInterestScore(double publicInterestScore) {
        this.publicInterestScore = publicInterestScore;
    }
    public double getPublicInterestScore() {
        return publicInterestScore;
    }
    
    public void setMarketData(MarketData marketData) {
        this.marketData = marketData;
    }
    public MarketData getMarketData() {
        return marketData;
    }
    
    public void setCommunityData(CommunityData communityData) {
        this.communityData = communityData;
    }
    public CommunityData getCommunityData() {
        return communityData;
    }
    
    public void setDeveloperData(DeveloperData developerData) {
        this.developerData = developerData;
    }
    public DeveloperData getDeveloperData() {
        return developerData;
    }
    
    public void setPublicInterestStats(PublicInterestStats publicInterestStats) {
        this.publicInterestStats = publicInterestStats;
    }
    public PublicInterestStats getPublicInterestStats() {
        return publicInterestStats;
    }
    
    public void setStatusUpdates(List<String> statusUpdates) {
        this.statusUpdates = statusUpdates;
    }
    public List<String> getStatusUpdates() {
        return statusUpdates;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    
    public void setTickers(List<Tickers> tickers) {
        this.tickers = tickers;
    }
    public List<Tickers> getTickers() {
        return tickers;
    }
    
}