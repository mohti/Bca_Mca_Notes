package com.example.bca_mca_notes.starting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bca_mca_notes.R;
import com.example.bca_mca_notes.bca.bca_sem_1_fragment_seter;
import com.example.bca_mca_notes.flagManeger.Flag_manager_for_inflatemenu;

public class Bca_sem_selection extends AppCompatActivity {

    Button sem1_btn,sem2_btn,sem3_btn,sem4_btn,sem5_btn,sem6_btn;
    Flag_manager_for_inflatemenu flag = new Flag_manager_for_inflatemenu();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem_selection);

    sem1_btn=findViewById(R.id.sem1_btn);
    sem2_btn=findViewById(R.id.sem2_btn);
    sem3_btn=findViewById(R.id.sem3_btn);
    sem4_btn=findViewById(R.id.sem4_btn);
    sem5_btn=findViewById(R.id.sem5_btn);
    sem6_btn=findViewById(R.id.sem6_btn);


        sem1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Flag_manager_for_inflatemenu f = new Flag_manager_for_inflatemenu(1);
                Intent i = new Intent(Bca_sem_selection.this, bca_sem_1_fragment_seter.class);
                 startActivity(i);


            }
        });



        sem2_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag.setManage_layout_by_sem(2);
            Intent i = new Intent(Bca_sem_selection.this, bca_sem_1_fragment_seter.class);
            startActivity(i);


        }
    });

        sem3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag.manage_layout_by_sem=3;
                Intent i = new Intent(Bca_sem_selection.this, bca_sem_1_fragment_seter.class);
                startActivity(i);


            }
        });

        sem4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag.manage_layout_by_sem=4;
                Intent i = new Intent(Bca_sem_selection.this, bca_sem_1_fragment_seter.class);
                startActivity(i);

            }
        });

        sem5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag.manage_layout_by_sem=5;
                Intent i = new Intent(Bca_sem_selection.this, bca_sem_1_fragment_seter.class);
                startActivity(i);


            }
        });

        sem6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag.manage_layout_by_sem=6;
                Intent i = new Intent(Bca_sem_selection.this, bca_sem_1_fragment_seter.class);
                startActivity(i);


            }
        });



    }




  }
