package com.example.mcproject;

public class bulk_exercise_data {
    int bulk_ex_img;
    String bulk_ex_name;

    public bulk_exercise_data(int bulk_ex_img, String bulk_ex_name) {
        this.bulk_ex_img = bulk_ex_img;
        this.bulk_ex_name = bulk_ex_name;
    }

    public int getBulk_ex_img() {
        return bulk_ex_img;
    }

    public void setBulk_ex_img(int bulk_ex_img) {
        this.bulk_ex_img = bulk_ex_img;
    }

    public String getBulk_ex_name() {
        return bulk_ex_name;
    }

    public void setBulk_ex_name(String bulk_ex_name) {
        this.bulk_ex_name = bulk_ex_name;
    }
}
