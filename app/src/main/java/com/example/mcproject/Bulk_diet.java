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

public class Bulk_diet extends Fragment {

    RecyclerView recyclerView;
    List<bulk_diet_data> bulk_diet_dataList = new ArrayList<>();
    private Object BulkDietAdapter;


    public Bulk_diet() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_bulk_diet, container, false);

        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet1,"hy sdhkb"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet2,"hy sdhkb"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet3,"hy sdhkb"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet5,"hy sdhkb"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet6,"hy sdhkb"));
       
        BulkDietAdapter = new DietAdapter(bulk_diet_dataList,Bulk_diet.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView.Adapter)  BulkDietAdapter);




        return view;
    }
}