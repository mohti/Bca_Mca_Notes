package com.example.bca_mca_notes.starting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bca_mca_notes.R;

public class first_start extends AppCompatActivity {

    Button  bca_start,mca_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_start);

        bca_start=findViewById(R.id.first_start_bca_btn);
        mca_start=findViewById(R.id.first_start_mca_btn);


        bca_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i =new Intent(first_start.this,Bca_sem_selection.class);
startActivity(i);



            }
        });

        mca_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(first_start.this,mca_sem_selection.class);


                startActivity(i);

            }
        });


    }
}
