package com.example.cryptopricechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
        private PricesDaoInterface pricesDıf ;
        TextView prices;
        int btcPrice ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prices = findViewById(R.id.prices);
        pricesDıf = ApiUtils.getPricesDaoInterface();

        getBtcPrice();
    }

        public void getBtcPrice() {
            Map<String,String> data = new HashMap<>();
            data.put("ids","bitcoin");
            data.put("vs_currencies","usd");

        pricesDıf.getBtcPrice(data).enqueue(new Callback<BtcPrice>() {
            @Override
            public void onResponse(Call<BtcPrice> call, Response<BtcPrice> response) {

                BtcPrice btc = response.body();
                Log.d("BtcPrice",String.valueOf((btc.getBitcoin().getUsd())));
                btcPrice = btc.getBitcoin().getUsd();
                prices.setText(String.valueOf(btcPrice));
            }

            @Override
            public void onFailure(Call<BtcPrice> call, Throwable t) {

            }
        });




        }

}