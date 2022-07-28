package com.example.cryptopricechecker.retrofit;

import com.example.cryptopricechecker.retrofit.PricesDaoInterface;
import com.example.cryptopricechecker.retrofit.RetrofitClient;

public class ApiUtils {

    public static  final String BaseUrl = "https://api.coingecko.com/api/v3/";

    public static PricesDaoInterface getPricesDaoInterface(){
        return RetrofitClient.getClient(BaseUrl).create(PricesDaoInterface.class);

    }
}

