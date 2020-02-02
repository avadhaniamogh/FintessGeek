package com.example.aavadhan.fitnessgeek.model;

public class ExerciseEntity {

    String exerciseName;

    String weight;

    String sets;

    String reps;

    public ExerciseEntity() {
    }

    public ExerciseEntity(String exerciseName, String weight, String sets, String reps) {
        this.exerciseName = exerciseName;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }
}
