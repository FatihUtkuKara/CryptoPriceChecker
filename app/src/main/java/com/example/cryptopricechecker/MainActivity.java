package com.example.cryptopricechecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.os.Handler;

import com.example.cryptopricechecker.adapter.RvAdapter;
import com.example.cryptopricechecker.cryptos.CryptoPrice;
import com.example.cryptopricechecker.retrofit.ApiUtils;
import com.example.cryptopricechecker.retrofit.Coins;
import com.example.cryptopricechecker.retrofit.PricesDaoInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
        private RecyclerView rv;
        private ArrayList<Coins> cryptoList;
        private RvAdapter adapter;
        private PricesDaoInterface pricesDıf ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
        cryptoList = new ArrayList<>();
       // prices = findViewById(R.id.prices);
        pricesDıf = ApiUtils.getPricesDaoInterface();
        getCryptoPrice();




    }

        public void getCryptoPrice() {

            Map<String,String> data = new HashMap<>();
            data.put("ids","bitcoin,ethereum,binancecoin,near,ripple,chainlink," +
                    "eos,tron,algorand,monero,litecoin,cardano,uniswap," +
                    "stellar,polkadot,celo,solana,cake,internet-computer,neutrino");
            data.put("vs_currencies","usd");

            pricesDıf.getCryptoPrice(data).enqueue(new Callback<CryptoPrice>() {
                @Override
                public void onResponse(Call<CryptoPrice> call, Response<CryptoPrice> response) {

                    CryptoPrice crypto = response.body();

                    double i = crypto.getEthereum().getUsd();
                    String str = Double.toString(i);

                for(int k = 0;k<999;k++) {
                    Coins c1 = new Coins("Sol", Double.toString(crypto.getSolana().getUsd()), "sol");
                    Coins c2 = new Coins("Ethereum", Double.toString(crypto.getEthereum().getUsd()), "eth");
                    Coins c3 = new Coins("Bitcoin", Double.toString(crypto.getBitcoin().getUsd()), "btc");
                    Coins c4 = new Coins("Near", Double.toString(crypto.getNear().getUsd()), "near");
                    Coins c5 = new Coins("Uniswap", Double.toString(crypto.getUniswap().getUsd()), "uniswap");
                    Coins c6 = new Coins("Link", Double.toString(crypto.getChainlink().getUsd()), "link");
                    Coins c7 = new Coins("Xrp", Double.toString(crypto.getRipple().getUsd()), "xrp");
                    Coins c8 = new Coins("Tron", Double.toString(crypto.getTron().getUsd()), "tron");
                    Coins c9 = new Coins("Icp", Double.toString(crypto.getInternetComputer().getUsd()), "icp");
                    Coins c10 = new Coins("Monero", Double.toString(crypto.getMonero().getUsd()), "monero");
                    Coins c11 = new Coins("Cake", Double.toString(crypto.getCake().getUsd()), "cake");
                    Coins c12 = new Coins("Ada", Double.toString(crypto.getCardano().getUsd()), "ada");
                    Coins c13 = new Coins("Eos", Double.toString(crypto.getEos().getUsd()), "eos");
                    Coins c14 = new Coins("Xlm", Double.toString(crypto.getRipple().getUsd()), "xrp");
                    Coins c15 = new Coins("Dot", Double.toString(crypto.getPolkadot().getUsd()), "dot");
                    Coins c16 = new Coins("Celo", Double.toString(crypto.getCelo().getUsd()), "celo");
                    Coins c17 = new Coins("Bnb", Double.toString(crypto.getBinancecoin().getUsd()), "bnb");
                    Coins c18 = new Coins("Ltc", Double.toString(crypto.getLitecoin().getUsd()), "ltc");
                    Coins c19 = new Coins("Algo", Double.toString(crypto.getAlgorand().getUsd()), "algo");
                    Coins c20 = new Coins("Neutrino", Double.toString(crypto.getNeutrino().getUsd()), "neutrino");

                    cryptoList.add(c1);
                    cryptoList.add(c2);
                    cryptoList.add(c3);
                    cryptoList.add(c4);
                    cryptoList.add(c5);
                    cryptoList.add(c6);
                    cryptoList.add(c7);
                    cryptoList.add(c8);
                    cryptoList.add(c9);
                    cryptoList.add(c10);
                    cryptoList.add(c11);
                    cryptoList.add(c12);
                    cryptoList.add(c13);
                    cryptoList.add(c14);
                    cryptoList.add(c15);
                    cryptoList.add(c16);
                    cryptoList.add(c17);
                    cryptoList.add(c18);
                    cryptoList.add(c19);
                    cryptoList.add(c20);

                    //refresh(3000);
                   /* try {
                        Thread.sleep(7000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } */
                }
                    adapter = new RvAdapter(MainActivity.this,cryptoList);
                    rv.setAdapter(adapter);





                }




                @Override
                public void onFailure(Call<CryptoPrice> call, Throwable t) {

                }


            });



        }
    private void refresh(int milliseconds) {
        final Handler handler = new Handler();

        final  Runnable runnable = new Runnable() {
            @Override
            public void run() {
                getCryptoPrice();
            }
        };
        handler.postDelayed(runnable,milliseconds);

    }




}