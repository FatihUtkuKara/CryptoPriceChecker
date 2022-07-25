package com.example.cryptopricechecker.retrofit;

import com.example.cryptopricechecker.cryptos.CryptoPrice;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PricesDaoInterface {

        @GET("simple/price")
        Call<CryptoPrice> getCryptoPrice(
                @QueryMap Map<String,String> map
                );

        @GET("coins/{coin_id}")
        Call<CryptoPrice> getCoinDetails(@Path(value = "coin_id", encoded = true) String coinId);






}
