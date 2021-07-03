package com.example.mcproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.BufferedInputStream;
import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    List<exercise_data> exercise_dataList;
    Context context;


    public ExerciseAdapter(List<exercise_data> exercise_dataList, Context context) {
        this.exercise_dataList = exercise_dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        exercise_data exercisedata = exercise_dataList.get(position);
        holder.name.setText(exercisedata.getExercise_name());
        holder.image1.setImageResource(exercisedata.getExercise_image());

    }
    @Override
    public int getItemCount() {
        return exercise_dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView image1;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.t1);
            image1 = itemView.findViewById(R.id.img1);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (getAdapterPosition()) {

                case 0:
                    Intent intent = new Intent(context, shredded_chest_exercise.class);
                    context.startActivity(intent);
                    break;
                case 1: // Open second activity
                    Intent intent1 = new Intent(context, shredded_biceps_exercise.class);
                    context.startActivity(intent1);
                    break;
                case 2: // Open third activity
                    Intent intent2 = new Intent(context, shredded_triceps_exercise.class);
                    context.startActivity(intent2);
                    break;
                case 3: // Open fourth activity
                    Intent intent3 = new Intent(context, shredded_wing_exercise.class);
                    context.startActivity(intent3);
                    break;
                case 4: // Open fifth activity
                    Intent intent4 = new Intent(context, shredded_thigh_exercise.class);
                    context.startActivity(intent4);
                     break;
                default:

            }
        }
    }}
