package com.example.cryptopricechecker.retrofit;

import com.example.cryptopricechecker.retrofit.PricesDaoInterface;
import com.example.cryptopricechecker.retrofit.RetrofitClient;

public class ApiUtils {

    public static  final String BaseUrl = "https://api.coingecko.com/api/v3/";

    public static PricesDaoInterface getPricesDaoInterface(){
        return RetrofitClient.getClient(BaseUrl).create(PricesDaoInterface.class);

    }
}
//                  cryptoList.add(String.valueOf(crypto.getEthereum().getUsd()));
//                    cryptoList.add(String.valueOf(crypto.getBinancecoin().getUsd()));
//                    cryptoList.add(String.valueOf(crypto.getNear().getUsd()));
//                    cryptoList.add(String.valueOf(crypto.getAlgorand().getUsd()));
//                    cryptoList.add(String.valueOf(crypto.getBitcoin().getUsd()));
//                    cryptoList.add(String.valueOf(crypto.getRipple().getUsd()));
//                    cryptoList.add(String.valueOf(crypto.getTron().getUsd()));
