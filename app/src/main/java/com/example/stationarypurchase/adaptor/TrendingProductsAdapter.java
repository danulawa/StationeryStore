package com.example.stationarypurchase.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stationarypurchase.R;
import com.example.stationarypurchase.model.TrendingProducts;

import java.util.List;

public class TrendingProductsAdapter extends RecyclerView.Adapter<TrendingProductsAdapter.TrendingProductViewHolder> {

    Context context;
    List<TrendingProducts> TrendingProductList;

    @NonNull
    @Override
    public TrendingProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.trending_row_layout,parent,false);
        return new TrendingProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingProductViewHolder holder, int position) {
        holder.trendingimageView.setImageResourse(TrendingProductList.get(position).getImageurl())
    }

    @Override
    public int getItemCount() {
        //return TrendingProductList.size();
        return 5;
    }

    public static class TrendingProductViewHolder extends RecyclerView.ViewHolder{

        ImageView TreningImageView;

        public TrendingProductViewHolder(@NonNull View itemView) {
            super(itemView);

            TreningImageView = itemView.findViewById(R.id.trendingimageView);
        }
    }
}
