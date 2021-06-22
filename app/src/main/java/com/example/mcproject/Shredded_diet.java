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


public class Shredded_diet extends Fragment {

    RecyclerView recyclerView;
    List<diet_data> diet_list = new ArrayList<>();
    private Object DietAdapter;


    public Shredded_diet() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_shredded_diet, container, false);
        recyclerView = view.findViewById(R.id.diet_recycler);


        diet_list.add(new diet_data(R.drawable.diet1," one 3-week study, \n14 healthy adults following a paleo diet lost an average of 5.1 pounds (2.3 kg) and reduced their waist circumference \n— a marker for belly fat — by an average of 0.6 inches (1.5 cm)\n"));
        diet_list.add(new diet_data(R.drawable.diet6,"Fuck two ibrars dirty nasty ass"));
        diet_list.add(new diet_data(R.drawable.diet2,"5 times do deepthroat to ibrar fucking sloppy mouth's"));
        diet_list.add(new diet_data(R.drawable.diet3,""));
        diet_list.add(new diet_data(R.drawable.diet5,""));

        DietAdapter = new DietAdapter(diet_list,Shredded_diet.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView.Adapter) DietAdapter);
        return view;
    }
}
