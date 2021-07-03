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

public class Bulk_diet extends Fragment  {

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
        recyclerView = view.findViewById(R.id.bulk_diet_recycler);


        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet1,"Breakfast: scrambled eggs, stir-fried veggies, and oatmeal\n" +
                "Snack: whey protein shake\n" +
                "Lunch: grilled chicken breast, mixed greens, and baked sweet potato\n" +
                "Snack: hard-boiled egg(s) and carrot sticks\n" +
                "Dinner: broiled fish, green beans with brown rice"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet6,"Breakfast: protein pancakes with fresh berries\n" +
                "Snack: apple slices and almonds\n" +
                "Lunch: lean ground beef burger on lettuce with tomato, onion, and green beans\n" +
                "Snack: protein shake\n" +
                "Dinner: shrimp stir-fried with bell pepper and brown rice over spinach"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet2,"Breakfast: Greek yogurt, almonds or walnuts, whole grain granola, and fresh berries\n" +
                "Snack: protein shake\n" +
                "Lunch: grilled fish with a spinach salad and broccoli\n" +
                "Snack: egg white omelet with bell peppers and mushrooms\n" +
                "Dinner: chicken breast topped with fresh salsa with a sweet potato and a side salad"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet3,"Breakfast: oatmeal with berries and scrambled egg whites\n" +
                "Snack: turkey breast with carrots and celery\n" +
                "Lunch: sirloin steak with broccoli and mushrooms\n" +
                "Snack: apples with natural nut butter\n" +
                "Dinner: broiled fish, brown rice, and a mixed green salad"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet5,"Breakfast: oatmeal with berries and scrambled egg whites\n" +
                "Snack: turkey breast with carrots and celery\n" +
                "Lunch: sirloin steak with broccoli and mushrooms\n" +
                "Snack: apples with natural nut butter\n" +
                "Dinner: broiled fish, brown rice, and a mixed green salad"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet6,"Breakfast: protein shake with oatmeal\n" +
                "Snack: hard-boiled egg whites with sliced peppers and cucumbers\n" +
                "Lunch: grilled chicken with white bean and tomato salad\n" +
                "Snack: Greek yogurt with berries and nuts\n" +
                "Dinner: grilled fish with quinoa and green beans"));
        bulk_diet_dataList.add(new bulk_diet_data(R.drawable.diet3,"Breakfast: scrambled egg whites with cheese, peppers, herbs, and Ezekiel bread\n" +
                "Snack: protein shake\n" +
                "Lunch: grilled chicken breast with bell peppers, black beans, and onions over romaine lettuce\n" +
                "Snack: apple and almonds\n" +
                "Dinner: sirloin steak with sweet potato and asparagus"));

        BulkDietAdapter = new BulkDietAdapter(bulk_diet_dataList,Bulk_diet.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView.Adapter)  BulkDietAdapter);

        return view;
    }
}