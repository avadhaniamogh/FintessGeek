package com.example.aavadhan.fitnessgeek.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.aavadhan.fitnessgeek.R;
import com.example.aavadhan.fitnessgeek.adapters.ExerciseListAdapter;
import com.example.aavadhan.fitnessgeek.model.ExerciseEntity;

import java.util.ArrayList;
import java.util.List;

public class ExerciseListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        recyclerView = findViewById(R.id.exercise_list_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent myIntent = new Intent(ExerciseListActivity.this, AddExerciseActivity.class);
                ExerciseListActivity.this.startActivity(myIntent);
            }
        });

        ExerciseEntity e1 = new ExerciseEntity("Reverse Push ups", "50", "3", "10");
        ExerciseEntity e2 = new ExerciseEntity("Hanging Spiderman Swings", "60", "3", "10");

        List<ExerciseEntity> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        mAdapter = new ExerciseListAdapter(list);
        recyclerView.setAdapter(mAdapter);
    }

}
