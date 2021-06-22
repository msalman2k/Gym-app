package com.example.mcproject;

public class diet_data {
    int diet_image1;
    String diet_desc;

    public diet_data(int diet_image1, String diet_desc) {
        this.diet_image1 = diet_image1;
        this.diet_desc = diet_desc;
    }

    public int getDiet_image1() {
        return diet_image1;
    }

    public void setDiet_image1(int diet_image1) {
        this.diet_image1 = diet_image1;
    }

    public String getDiet_desc() {
        return diet_desc;
    }

    public void setDiet_desc(String diet_desc) {
        this.diet_desc = diet_desc;
    }
}
