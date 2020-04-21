package com.example.bca_mca_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.bca_mca_notes.starting.Bca_sem_selection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent iNext;
                iNext = new Intent(MainActivity.this, Bca_sem_selection.class);

                startActivity(iNext);
                finish();

            }
        },1500);


    }
}
