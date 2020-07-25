//@author Tanvi Adithan
//@license Copyright 2020, all rights reserved

/*
 * Main class linking to pages containing easy, medium, and hard Sudoku puzzles.
 */

package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button easy = findViewById(R.id.easy);
        Button medium = findViewById(R.id.medium);
        Button hard = findViewById(R.id.hard);
        Button rules = findViewById(R.id.rules);
        easy.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               openEasy();
           }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openMedium();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openHard();
            }
        });

        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openRules();
            }
        });

    }

    // Links to page containing 4x4 Sudoku grid
    public void openEasy() {
        Intent intent = new Intent(this, Easy4.class);
        startActivity(intent);
    }

    // Links to page containing 6x6 Sudoku grid
    public void openMedium() {
        Intent intent = new Intent(this, Medium6.class);
        startActivity(intent);
    }

    // Links to page containing 9x9 Sudoku grid
    public void openHard() {
        Intent intent = new Intent(this, Hard9.class);
        startActivity(intent);
    }

    // Links to page containing Sudoku rules
    public void openRules() {
        Intent intent = new Intent(this, Rules.class);
        startActivity(intent);
    }


}