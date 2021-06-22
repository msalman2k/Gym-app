package com.example.mcproject;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    List<exercise_data> exercise_dataList;
    Shredded_exercise context;

    public ExerciseAdapter(List<exercise_data> exercise_dataList, Shredded_exercise context) {
        this.exercise_dataList = exercise_dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        exercise_data exercisedata = exercise_dataList.get(position);
        holder.name.setText(exercisedata.getExercise_image());
        holder.image1.setImageResource(exercisedata.getExercise_image());
    }

    @Override
    public int getItemCount() {
        return exercise_dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image1;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.t1);
            image1 =itemView.findViewById(R.id.img1);

        }
    }
}
