//@author Tanvi Adithan
//@license Copyright 2020, all rights reserved

/*
 * Main class linking to pages containing easy, medium, and hard Xudoku puzzles.
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
        easy.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               openEasy();
           }
        });
    }

    // Links to page containing 4x4 Sudoku grid
    public void openEasy() {
        Intent intent = new Intent(this, Easy4.class);
        startActivity(intent);
    }


}