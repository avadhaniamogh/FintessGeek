package com.example.aavadhan.fitnessgeek.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aavadhan.fitnessgeek.R;

public class AddExerciseActivity extends AppCompatActivity {
    private EditText weight,sets,reps,name;
    private  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exercise);
        name = (EditText) findViewById(R.id.name_details);

        weight = (EditText) findViewById(R.id.weight_details);

        sets = (EditText) findViewById(R.id.sets_details);
        reps = (EditText) findViewById(R.id.reps_details);

        btn = (Button)findViewById(R.id.btna);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });

    }

}
