package com.example.mcproject;

public class exercise_data {
    int exercise_image;
    String exercise_name;

    public exercise_data(int exercise_image, String exercise_name) {
        this.exercise_image = exercise_image;
        this.exercise_name = exercise_name;
    }

    public int getExercise_image() {
        return exercise_image;
    }

    public void setExercise_image(int exercise_image) {
        this.exercise_image = exercise_image;
    }

    public String getExercise_name() {
        return exercise_name;
    }

    public void setExercise_name(String exercise_name) {
        this.exercise_name = exercise_name;
    }
}
