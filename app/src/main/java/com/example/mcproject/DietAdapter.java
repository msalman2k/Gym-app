package com.example.mcproject;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DietAdapter extends RecyclerView.Adapter<DietAdapter.ViewHolder> {

    List<diet_data> diet_dataList;
    Shredded_diet context;

    public DietAdapter(List<diet_data> diet_dataList, Shredded_diet context) {
        this.diet_dataList = diet_dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public DietAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DietAdapter.ViewHolder holder, int position) {
        diet_data dietdata = diet_dataList.get(position);
        holder.name.setText(dietdata.getDiet_desc());
        holder.image1.setImageResource(dietdata.getDiet_image1());
    }

    @Override
    public int getItemCount() {
        return diet_dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image1;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.diet_t1);
            image1 =itemView.findViewById(R.id.diet_img1);
        }
    }
}
