package com.example.cryptopricechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
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
    BaseJson2POJO cryptodetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        detailDıf = ApiUtils.getPricesDaoInterface();

        if (getIntent().hasExtra("coinName")) {
            coinName = getIntent().getStringExtra("coinName");
        }
        getCryptoDetail();
    }


    public void getCryptoDetail() {
        detailDıf.getCoinDetails("bitcoin").enqueue(new Callback<BaseJson2POJO>() {
            @Override
            public void onResponse(Call<BaseJson2POJO> call, Response<BaseJson2POJO> response) {
                cryptodetail = response.body();
                populateUI();
            }

            @Override
            public void onFailure(Call<BaseJson2POJO> call, Throwable t) {
                Log.e("DetailActivity", t.getLocalizedMessage());
            }
        });


    }

    private void populateUI() {
        Glide.with(getApplicationContext()).
                load(cryptodetail.getImage().getLarge()).into(imageView);

        textView.setText(cryptodetail.getDescription().getEn());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(cryptodetail.getLinks().getHomepage().get(0)));
                startActivity(browserIntent);
            }
        });
    }
}