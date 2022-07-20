package com.example.cryptopricechecker;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface PricesDaoInterface {

        @GET("simple/price")
        Call<BtcPrice> getBtcPrice(
                @QueryMap Map<String,String> map
                );





}
