package com.example.mcproject;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BulkExerciseAdapter extends RecyclerView.Adapter<BulkExerciseAdapter.ViewHolder> {

    List<bulk_exercise_data> bulk_exercise_dataList;
    Bulk_exercise Context;

    public BulkExerciseAdapter(List<bulk_exercise_data> bulk_exercise_dataList, Bulk_exercise context) {
        this.bulk_exercise_dataList = bulk_exercise_dataList;
        Context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        bulk_exercise_data bulkExerciseData = bulk_exercise_dataList.get(position);
        holder.bulk_ex_img.setImageResource(bulkExerciseData.getBulk_ex_img());
        holder.bulk_ex_name.setText(bulkExerciseData.getBulk_ex_name());
    }

    @Override
    public int getItemCount() {
        return bulk_exercise_dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bulk_ex_img;
        TextView bulk_ex_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bulk_ex_img = itemView.findViewById(R.id.bulk_exercise_img1);
            bulk_ex_name = itemView.findViewById(R.id.bulk_exercise_t1);
        }
    }
}
