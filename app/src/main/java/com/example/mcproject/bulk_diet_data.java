package com.example.mcproject;

public class bulk_diet_data {
    int bulk_diet_image;
    String bulk_diet_name;

    public bulk_diet_data(int bulk_diet_image, String bulk_diet_name) {
        this.bulk_diet_image = bulk_diet_image;
        this.bulk_diet_name = bulk_diet_name;
    }

    public int getBulk_diet_image() {
        return bulk_diet_image;
    }

    public void setBulk_diet_image(int bulk_diet_image) {
        this.bulk_diet_image = bulk_diet_image;
    }

    public String getBulk_diet_name() {
        return bulk_diet_name;
    }

    public void setBulk_diet_name(String bulk_diet_name) {
        this.bulk_diet_name = bulk_diet_name;
    }
}
