//@author Tanvi Adithan
//@license Copyright 2020, all rights reserved

/*
 * Easy4 class containing code for 4x4 Sudoku puzzles.
 */


package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;

public class Medium6 extends AppCompatActivity {

    TextView num_11, num_12, num_13, num_14, num_15, num_16, num_21, num_22, num_23, num_24, num_25,
            num_26, num_31, num_32, num_33, num_34, num_35, num_36, num_41, num_42, num_43, num_44,
            num_45, num_46, num_51, num_52, num_53, num_54, num_55, num_56, num_61, num_62, num_63,
            num_64, num_65, num_66, dialogBox;

    int[][] answer = {{5, 1, 6, 4, 2, 3}, {4, 3, 2, 5, 1, 6}, {6, 4, 1, 3, 5, 2}, {3, 2, 5, 1, 6, 4},
            {1, 6, 3, 2, 4, 5}, {2, 5, 4, 6, 3, 1}};

    TextView[][] storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button check;
        setContentView(R.layout.activity_medium6);

        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                goBack();
            }
        });

        dialogBox = findViewById(R.id.dialogBox);
        check = findViewById(R.id.ValidateAnswerKey);

        num_11 = findViewById(R.id.num11);
        num_12 = findViewById(R.id.num12);
        num_13 = findViewById(R.id.num13);
        num_14 = findViewById(R.id.num14);
        num_15 = findViewById(R.id.num15);
        num_16 = findViewById(R.id.num16);

        num_21 = findViewById(R.id.num21);
        num_22 = findViewById(R.id.num22);
        num_23 = findViewById(R.id.num23);
        num_24 = findViewById(R.id.num24);
        num_25 = findViewById(R.id.num25);
        num_26 = findViewById(R.id.num26);

        num_31 = findViewById(R.id.num31);
        num_32 = findViewById(R.id.num32);
        num_33 = findViewById(R.id.num33);
        num_34 = findViewById(R.id.num34);
        num_35 = findViewById(R.id.num35);
        num_36 = findViewById(R.id.num36);

        num_41 = findViewById(R.id.num41);
        num_42 = findViewById(R.id.num42);
        num_43 = findViewById(R.id.num43);
        num_44 = findViewById(R.id.num44);
        num_45 = findViewById(R.id.num45);
        num_46 = findViewById(R.id.num46);

        num_51 = findViewById(R.id.num51);
        num_52 = findViewById(R.id.num52);
        num_53 = findViewById(R.id.num53);
        num_54 = findViewById(R.id.num54);
        num_55 = findViewById(R.id.num55);
        num_56 = findViewById(R.id.num56);

        num_61 = findViewById(R.id.num61);
        num_62 = findViewById(R.id.num62);
        num_63 = findViewById(R.id.num63);
        num_64 = findViewById(R.id.num64);
        num_65 = findViewById(R.id.num65);
        num_66 = findViewById(R.id.num66);

        //Quick access for TextViews initialized above
        storage = new TextView[][]
                {{num_11, num_12, num_13, num_14, num_15, num_16},
                 {num_21, num_22, num_23, num_24, num_25, num_26},
                 {num_31, num_32, num_33, num_34, num_35, num_36},
                 {num_41, num_42, num_43, num_44, num_45, num_46},
                 {num_51, num_52, num_53, num_54, num_55, num_56},
                 {num_61, num_62, num_63, num_64, num_65, num_66}};

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int[][] board = new int[6][6];

                //For loops initializing integer or null values in board matrix. Removes need for each
                //number to be initialized individually
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        try {
                            board[i][j] = Integer.parseInt(storage[i][j].getText().toString());
                        } catch (Exception e) {
                            dialogBox.setText("You're not done. Press 'Check' when you're done.");
                        }
                    }
                }

                //Counts number of errors
                int count = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
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

    // Goes back to main page
    public void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

