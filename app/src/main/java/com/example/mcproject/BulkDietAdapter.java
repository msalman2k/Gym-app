package com.example.mcproject;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BulkDietAdapter extends RecyclerView.Adapter<BulkDietAdapter.ViewHolder> {

    List<bulk_diet_data> bulk_diet_dataList = new ArrayList<>();
    Bulk_diet Context;

    @NonNull
    @Override
    public BulkDietAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BulkDietAdapter.ViewHolder holder, int position) {
        bulk_diet_data bulkDietData = bulk_diet_dataList.get(position);
        holder.bulk_diet_image.setImageResource(bulkDietData.getBulk_diet_image());
        holder.bulk_diet_text.setText(bulkDietData.getBulk_diet_name());

    }

    @Override
    public int getItemCount() {
        return bulk_diet_dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView bulk_diet_image;
        TextView bulk_diet_text;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bulk_diet_image=itemView.findViewById(R.id.bulk_diet_img1);
            bulk_diet_text=itemView.findViewById(R.id.bulk_diet_t1);

        }
    }
}
