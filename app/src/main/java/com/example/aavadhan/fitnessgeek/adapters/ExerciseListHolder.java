package com.example.aavadhan.fitnessgeek.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aavadhan.fitnessgeek.R;

public class ExerciseListHolder extends RecyclerView.ViewHolder {
    private ViewGroup container;
    private TextView exerciseName;
    private TextView exerciseWeight;
    private TextView exerciseSets;
    private TextView exerciseReps;

    public ExerciseListHolder(View v) {
        super(v);
        container = v.findViewById(R.id.exercise_row_linear_layout);
        exerciseName = v.findViewById(R.id.exercise_name);
        exerciseWeight = v.findViewById(R.id.exercise_weight);
        exerciseSets = v.findViewById(R.id.exercise_sets);
        exerciseReps = v.findViewById(R.id.exercise_reps);
    }

    public ViewGroup getContainer() {
        return container;
    }

    public TextView getExerciseName() {
        return exerciseName;
    }

    public TextView getExerciseWeight() {
        return exerciseWeight;
    }

    public TextView getExerciseSets() {
        return exerciseSets;
    }

    public TextView getExerciseReps() {
        return exerciseReps;
    }
}