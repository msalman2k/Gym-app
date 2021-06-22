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


public class Shredded_exercise extends Fragment {

    RecyclerView recyclerView;
    List<exercise_data> exercise_list = new ArrayList<>();
    private Object ExerciseAdapter;


    public Shredded_exercise() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View  view =  inflater.inflate(R.layout.fragment_shredded_exercise, container, false);
        recyclerView = view.findViewById(R.id.exercise_recyclerview);


        exercise_list.add(new exercise_data(R.drawable.exercise_biceps,"BICEPS"));
        exercise_list.add(new exercise_data(R.drawable.exercise_tricep,"TRICEPS"));
        exercise_list.add(new exercise_data(R.drawable.exercise_wing,"WINGS"));
        exercise_list.add(new exercise_data(R.drawable.exercise_biceps,"BICEPS"));
        exercise_list.add(new exercise_data(R.drawable.exercise_biceps,"BICEPS"));
        exercise_list.add(new exercise_data(R.drawable.exercise_biceps,"BICEPS"));

        ExerciseAdapter = new ExerciseAdapter(exercise_list,Shredded_exercise.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView.Adapter) ExerciseAdapter);

        return view;
    }
}