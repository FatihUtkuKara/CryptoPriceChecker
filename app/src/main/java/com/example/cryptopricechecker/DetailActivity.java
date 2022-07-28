package com.example.cryptopricechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cryptopricechecker.details.BaseJson2POJO;
import com.example.cryptopricechecker.retrofit.ApiUtils;
import com.example.cryptopricechecker.retrofit.PricesDaoInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    private String coinName = "";
    private PricesDaoInterface detailDıf;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        detailDıf = ApiUtils.getPricesDaoInterface();
        if (getIntent().hasExtra("coinName")) {
            coinName = getIntent().getStringExtra("coinName");
            Toast.makeText(this, coinName, Toast.LENGTH_SHORT).show();


        }


        getCryptoDetail();


    }


    public void getCryptoDetail() {



        detailDıf.getCoinDetails("bitcoin").enqueue(new Callback<BaseJson2POJO>() {
            @Override
            public void onResponse(Call<BaseJson2POJO> call, Response<BaseJson2POJO> response) {

                BaseJson2POJO cryptodetail = response.body();

               textView.setText(cryptodetail.getDescription().getEn());
               Log.d("deneme",cryptodetail.getName());

                Toast.makeText(DetailActivity.this, "deneme", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<BaseJson2POJO> call, Throwable t) {

            }
        });


    }
}