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

import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    public String coinName = "";
    private PricesDaoInterface detailDıf;
    ImageView image;
    TextView description;
    BaseJson2POJO cryptodetail;
    TextView genesisDate;
    TextView symbol;
    TextView currentPrice;
    TextView currentPriceBtc;
    TextView ath;
    TextView totalSupply;
    TextView marketCapRank;
    TextView marketCap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        image = findViewById(R.id.image);
        currentPrice = findViewById(R.id.currentPrice);
        ath = findViewById(R.id.ath);
        totalSupply = findViewById(R.id.totalSupply);
        marketCap = findViewById(R.id.marketCap);
        marketCapRank = findViewById(R.id.marketCapRank);
        description = findViewById(R.id.description);
        detailDıf = ApiUtils.getPricesDaoInterface();
        genesisDate=findViewById(R.id.genesisDate);
        symbol =findViewById(R.id.symbol);
        currentPriceBtc = findViewById(R.id.currentPriceBtc);

        if (getIntent().hasExtra("coinName")) {
            coinName = getIntent().getStringExtra("coinName").toLowerCase(Locale.ROOT);
        }


        getCryptoDetail();

    }


    public void getCryptoDetail() {
        detailDıf.getCoinDetails(coinName).enqueue(new Callback<BaseJson2POJO>() {
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
                load(cryptodetail.getImage().getLarge()).into(image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(cryptodetail.getLinks().getHomepage().get(0)));
                startActivity(browserIntent);
            }
        });

        description.setText(cryptodetail.getDescription().getEn());

        symbol.setText(cryptodetail.getSymbol());

        genesisDate.setText(cryptodetail.getGenesisDate());

        currentPrice.setText(String.valueOf(cryptodetail.getMarketData().getCurrentPrice().getUsd()));

        marketCap.setText(String.valueOf(cryptodetail.getMarketData().getMarketCap().getUsd()));

        currentPriceBtc.setText(String.valueOf(cryptodetail.getMarketData().getCurrentPrice().getBtc()));

        ath.setText(String.valueOf(cryptodetail.getMarketData().getAth().getUsd()));

        marketCapRank.setText(String.valueOf(cryptodetail.getMarketCapRank()));

        totalSupply.setText(String.valueOf(cryptodetail.getMarketData().getTotalSupply()));

        String title = cryptodetail.getName() + " / " + coinName;

        getSupportActionBar().setTitle(title);
    }
}