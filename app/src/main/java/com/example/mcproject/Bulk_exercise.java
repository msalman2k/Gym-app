package com.example.mcproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Bulk_exercise extends Fragment {

    RecyclerView recyclerView;
    List<bulk_exercise_data> bulk_exercise_dataList = new ArrayList<>();
    private Object BulkExerciseAdapter;


    public Bulk_exercise() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_bulk_exercise, container, false);
        recyclerView = view.findViewById(R.id.bulk_exercise_recycler);


        bulk_exercise_dataList.add(new bulk_exercise_data(R.drawable.exercise_biceps,"BICEPS"));
        bulk_exercise_dataList.add(new bulk_exercise_data(R.drawable.exercise_tricep,"TRICEPS"));
        bulk_exercise_dataList.add(new bulk_exercise_data(R.drawable.exercise_wing,"WINGS"));
        bulk_exercise_dataList.add(new bulk_exercise_data(R.drawable.exercise_biceps,"BICEPS"));
        bulk_exercise_dataList.add(new bulk_exercise_data(R.drawable.exercise_biceps,"BICEPS"));


        BulkExerciseAdapter = new BulkExerciseAdapter(bulk_exercise_dataList,Bulk_exercise.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView.Adapter) BulkExerciseAdapter);





        return view;
    }
}