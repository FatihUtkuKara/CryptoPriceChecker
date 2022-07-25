package com.example.cryptopricechecker.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptopricechecker.DetailActivity;
import com.example.cryptopricechecker.R;
import com.example.cryptopricechecker.retrofit.Coins;

import java.util.ArrayList;
import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CardViewDesignObjectsHolder> {
    private Context mContext;
    private List<Coins> cryptoList = new ArrayList<Coins>();

    public RvAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CardViewDesignObjectsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.card_design,parent,false);

        return new CardViewDesignObjectsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewDesignObjectsHolder holder, int position) {
        Coins coin = cryptoList.get(position);
       // holder.coinImage.setImageResource(mContext.getResources().getIdentifier(coin.getCoinName(),"drawable",mContext.getPackageName()));
        if(coin.getCoinName().equals("Bitcoin")){
            holder.coinImage.setBackgroundResource(R.drawable.btc);
        }
        if(coin.getCoinName().equals("Ethereum")){
            holder.coinImage.setBackgroundResource(R.drawable.eth);
        }
        if(coin.getCoinName().equals("Bnb")){
            holder.coinImage.setBackgroundResource(R.drawable.bnb);
        }
        if(coin.getCoinName().equals("Near")){
            holder.coinImage.setBackgroundResource(R.drawable.near);
        }
        if(coin.getCoinName().equals("Xrp")){
            holder.coinImage.setBackgroundResource(R.drawable.xrp);
        }
        if(coin.getCoinName().equals("Link")){
            holder.coinImage.setBackgroundResource(R.drawable.link);
        }
        if(coin.getCoinName().equals("Eos")){
            holder.coinImage.setBackgroundResource(R.drawable.eos);
        }
        if(coin.getCoinName().equals("Tron")){
            holder.coinImage.setBackgroundResource(R.drawable.tron);
        }
        if(coin.getCoinName().equals("Algo")){
            holder.coinImage.setBackgroundResource(R.drawable.algo);
        }
        if(coin.getCoinName().equals("Monero")){
            holder.coinImage.setBackgroundResource(R.drawable.monero);
        }
        if(coin.getCoinName().equals("Ltc")){
            holder.coinImage.setBackgroundResource(R.drawable.ltc);
        }
        if(coin.getCoinName().equals("Ada")){
            holder.coinImage.setBackgroundResource(R.drawable.ada);
        }
        if(coin.getCoinName().equals("Uniswap")){
            holder.coinImage.setBackgroundResource(R.drawable.uniswap);
        }
        if(coin.getCoinName().equals("Xlm")){
            holder.coinImage.setBackgroundResource(R.drawable.xlm);
        }
        if(coin.getCoinName().equals("Dot")){
            holder.coinImage.setBackgroundResource(R.drawable.dot);
        }
        if(coin.getCoinName().equals("Celo")){
            holder.coinImage.setBackgroundResource(R.drawable.celo);
        }
        if(coin.getCoinName().equals("Sol")){
            holder.coinImage.setBackgroundResource(R.drawable.sol);
        }
        if(coin.getCoinName().equals("Cake")){
            holder.coinImage.setBackgroundResource(R.drawable.cake);
        }
        if(coin.getCoinName().equals("Icp")){
            holder.coinImage.setBackgroundResource(R.drawable.icp);
        }
        if(coin.getCoinName().equals("Neutrino")){
            holder.coinImage.setBackgroundResource(R.drawable.neutrino);
        }
        holder.coinName.setText(coin.getCoinName());
        holder.coinPrice.setText(coin.getCoinPrice());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, DetailActivity.class);
                i.putExtra("coinName", coin.getCoinName());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {

        return cryptoList.size();
    }

    public void setData(List<Coins> cryptoList) {
        this.cryptoList.clear();
        this.cryptoList.addAll(cryptoList);
        notifyDataSetChanged();
    }

    public class CardViewDesignObjectsHolder extends RecyclerView.ViewHolder{
        public TextView coinName;
        public TextView coinPrice;
        public ImageView coinImage;
        public CardView cardView ;

        public CardViewDesignObjectsHolder(View view) {
            super(view);
            coinName= view.findViewById(R.id.coinName);
            coinPrice= view.findViewById(R.id.coinPrice);
            coinImage= view.findViewById(R.id.coinImage);
            cardView= view.findViewById(R.id.cardView);

        }

    }
}
