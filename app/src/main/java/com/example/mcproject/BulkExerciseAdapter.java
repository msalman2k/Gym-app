package com.example.mcproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BulkExerciseAdapter extends RecyclerView.Adapter<BulkExerciseAdapter.ViewHolder> {

    List<bulk_exercise_data> bulk_exercise_dataList;
    Context context;

    public BulkExerciseAdapter(List<bulk_exercise_data> bulk_exercise_dataList, Context context) {
        this.bulk_exercise_dataList = bulk_exercise_dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bulk_exercise_item,parent,false);
        return new ViewHolder(view);
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

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView bulk_ex_img;
        TextView bulk_ex_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bulk_ex_img = itemView.findViewById(R.id.bulk_exercise_img1);
            bulk_ex_name = itemView.findViewById(R.id.bulk_exercise_t1);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
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
        }
    }

