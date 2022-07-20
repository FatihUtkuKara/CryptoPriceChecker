package com.example.cryptopricechecker;

public class ApiUtils {

    public static  final String BaseUrl = "https://api.coingecko.com/api/v3/";

    public static PricesDaoInterface getPricesDaoInterface(){
        return RetrofitClient.getClient(BaseUrl).create(PricesDaoInterface.class);

    }
}
