package com.example.aavadhan.fitnessgeek.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aavadhan.fitnessgeek.R;
import com.example.aavadhan.fitnessgeek.model.ExerciseEntity;

import java.util.List;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListHolder> {
    // TODO: Change string to model class
    private List<ExerciseEntity> exerciseList;

    public ExerciseListAdapter(List<ExerciseEntity> list) {
        exerciseList = list;
    }

    @NonNull
    @Override
    public ExerciseListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.exercise_row, viewGroup, false);
        return new ExerciseListHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseListHolder exerciseListHolder, int i) {
        final ExerciseEntity exercise = exerciseList.get(i);
        exerciseListHolder.getExerciseName().setText(exercise.getExerciseName());
        exerciseListHolder.getExerciseWeight().setText(exercise.getWeight());
        exerciseListHolder.getExerciseReps().setText(exercise.getReps());
        exerciseListHolder.getExerciseSets().setText(exercise.getSets());
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

}
