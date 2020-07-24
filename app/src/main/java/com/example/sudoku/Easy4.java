//@author Tanvi Adithan
//@license Copyright 2020, all rights reserved

/*
 * Easy4 class containing code for 4x4 Sudoku puzzles.
 */


package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;

public class Easy4 extends AppCompatActivity {

    TextView num_11, num_12, num_13, num_14, num_21, num_22, num_23, num_24, num_31, num_32, num_33, num_34,
            num_41, num_42, num_43, num_44, dialogBox;

    int[][] answer = {{3, 2, 4, 1}, {4, 1, 3, 2}, {1, 4, 2, 3}, {2, 3, 1, 4}};

    TextView[][] storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button check;
        setContentView(R.layout.activity_easy4);

        dialogBox = findViewById(R.id.dialogBox);
        check = findViewById(R.id.ValidateAnswerKey);

        num_11 = findViewById(R.id.num11);
        num_12 = findViewById(R.id.num12);
        num_13 = findViewById(R.id.num13);
        num_14 = findViewById(R.id.num14);

        num_21 = findViewById(R.id.num21);
        num_22 = findViewById(R.id.num22);
        num_23 = findViewById(R.id.num23);
        num_24 = findViewById(R.id.num24);

        num_31 = findViewById(R.id.num31);
        num_32 = findViewById(R.id.num32);
        num_33 = findViewById(R.id.num33);
        num_34 = findViewById(R.id.num34);

        num_41 = findViewById(R.id.num41);
        num_42 = findViewById(R.id.num42);
        num_43 = findViewById(R.id.num43);
        num_44 = findViewById(R.id.num44);

        //Quick access for TextViews initialized above
        storage = new TextView[][]
               {{num_11, num_12, num_13, num_14},
                {num_21, num_22, num_23, num_24},
                {num_31, num_32, num_33, num_34},
                {num_41, num_42, num_43, num_44}};

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int[][] board = new int[4][4];

                //For loops initializing integer or null values in board matrix. Removes need for each
                //number to be initialized individually
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        try {
                            board[i][j] = Integer.parseInt(storage[i][j].getText().toString());
                        } catch (Exception e) {
                            dialogBox.setText("You're not done. Press 'Check' when you're done.");
                        }
                    }
                }

                //Counts number of errors
                int count = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (board[i][j] != answer[i][j]) {
                            storage[i][j].setText(null);
                            count++;
                        }
                    }
                }

                //Gives user message
                if (count == 0) {
                    dialogBox.setText("You did it! Good job!");
                }
                else{
                    String str = "You made " + count + " errors. Try again.";
                    dialogBox.setText(str);
                }
            }
        });
    }
}

