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

import com.example.cryptopricechecker.AdaActivity;
import com.example.cryptopricechecker.AlgoActivity;
import com.example.cryptopricechecker.BitcoinActivity;
import com.example.cryptopricechecker.BnbActivity;
import com.example.cryptopricechecker.CakeActivity;
import com.example.cryptopricechecker.CeloActivity;
import com.example.cryptopricechecker.DotActivity;
import com.example.cryptopricechecker.EosActivity;
import com.example.cryptopricechecker.EthereumActivity;
import com.example.cryptopricechecker.IcpActivity;
import com.example.cryptopricechecker.LinkActivity;
import com.example.cryptopricechecker.LtcActivity;
import com.example.cryptopricechecker.MoneroActivity;
import com.example.cryptopricechecker.NearActivity;
import com.example.cryptopricechecker.NeutrinoActivity;
import com.example.cryptopricechecker.R;
import com.example.cryptopricechecker.SolActivity;
import com.example.cryptopricechecker.TronActivity;
import com.example.cryptopricechecker.UniSwapActivity;
import com.example.cryptopricechecker.XlmActivity;
import com.example.cryptopricechecker.XrpActivity;
import com.example.cryptopricechecker.retrofit.Coins;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CardViewDesignObjectsHolder> {
    private Context mContext;
    private List<Coins> cryptoList;

    public RvAdapter(Context mContext, List<Coins> cryptoList) {
        this.mContext = mContext;
        this.cryptoList = cryptoList;
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
            public void onClick(View v) {
                Toast.makeText(mContext,  coin.getCoinName()+ " selected ", Toast.LENGTH_SHORT).show();

               // if

            if(coin.getCoinName().equals("Bitcoin")) {
                Intent newIntent = new Intent(mContext, BitcoinActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Ethereum")) {
                Intent newIntent = new Intent(mContext, EthereumActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Bnb")) {
                Intent newIntent = new Intent(mContext, BnbActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Near")) {
                Intent newIntent = new Intent(mContext, NearActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Xrp")) {
                Intent newIntent = new Intent(mContext, XrpActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Link")) {
                Intent newIntent = new Intent(mContext, LinkActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Eos")) {
                Intent newIntent = new Intent(mContext, EosActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Tron")) {
                Intent newIntent = new Intent(mContext, TronActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Icp")) {
                Intent newIntent = new Intent(mContext, IcpActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Monero")) {
                Intent newIntent = new Intent(mContext, MoneroActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Cake")) {
                Intent newIntent = new Intent(mContext, CakeActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Ada")) {
                Intent newIntent = new Intent(mContext, AdaActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Uniswap")) {
                Intent newIntent = new Intent(mContext, UniSwapActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Xlm")) {
                Intent newIntent = new Intent(mContext, XlmActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Dot")) {
                Intent newIntent = new Intent(mContext, DotActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Celo")) {
                Intent newIntent = new Intent(mContext, CeloActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Sol")) {
                Intent newIntent = new Intent(mContext, SolActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Ltc")) {
                Intent newIntent = new Intent(mContext, LtcActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Algo")) {
                Intent newIntent = new Intent(mContext, AlgoActivity.class);
                mContext.startActivity(newIntent); }

            if(coin.getCoinName().equals("Neutrino")) {
                Intent newIntent = new Intent(mContext, NeutrinoActivity.class);
                mContext.startActivity(newIntent); }

            } });

    }

    @Override
    public int getItemCount() {

        return 20;
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
