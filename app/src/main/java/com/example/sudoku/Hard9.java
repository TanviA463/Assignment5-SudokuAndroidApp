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

public class Hard9 extends AppCompatActivity {

    TextView num_11, num_12, num_13, num_14, num_15, num_16, num_17, num_18, num_19, num_21, num_22,
            num_23, num_24, num_25, num_26, num_27, num_28, num_29, num_31, num_32, num_33, num_34,
            num_35, num_36, num_37, num_38, num_39, num_41, num_42, num_43, num_44, num_45, num_46,
            num_47, num_48, num_49, num_51, num_52, num_53, num_54, num_55, num_56, num_57, num_58,
            num_59, num_61, num_62, num_63, num_64, num_65, num_66, num_67, num_68, num_69, num_71,
            num_72, num_73, num_74, num_75, num_76, num_77, num_78, num_79, num_81, num_82, num_83,
            num_84, num_85, num_86, num_87, num_88, num_89, num_91, num_92, num_93, num_94, num_95,
            num_96, num_97, num_98, num_99, dialogBox;

    int[][] answer = {{6, 4, 5, 9, 3, 2, 1, 8, 7},
                      {1, 2, 7, 8, 4, 5, 9, 6, 3},
                      {9, 8, 3, 1, 7, 6, 2, 5, 4},
                      {4, 3, 8, 2, 9, 7, 6, 1, 5},
                      {2, 1, 6, 4, 5, 8, 3, 7, 9},
                      {5, 7, 9, 6, 1, 4, 4, 2, 8},
                      {8, 5, 4, 3, 6, 1, 7, 9, 2},
                      {3, 6, 2, 7, 8, 9, 5, 4, 1},
                      {7, 9, 1, 5, 2, 4, 8, 3, 6}};

    TextView[][] storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button check;
        setContentView(R.layout.activity_hard9);

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
        num_17 = findViewById(R.id.num17);
        num_18 = findViewById(R.id.num18);
        num_19 = findViewById(R.id.num19);

        num_21 = findViewById(R.id.num21);
        num_22 = findViewById(R.id.num22);
        num_23 = findViewById(R.id.num23);
        num_24 = findViewById(R.id.num24);
        num_25 = findViewById(R.id.num25);
        num_26 = findViewById(R.id.num26);
        num_27 = findViewById(R.id.num27);
        num_28 = findViewById(R.id.num28);
        num_29 = findViewById(R.id.num29);

        num_31 = findViewById(R.id.num31);
        num_32 = findViewById(R.id.num32);
        num_33 = findViewById(R.id.num33);
        num_34 = findViewById(R.id.num34);
        num_35 = findViewById(R.id.num35);
        num_36 = findViewById(R.id.num36);
        num_37 = findViewById(R.id.num37);
        num_38 = findViewById(R.id.num38);
        num_39 = findViewById(R.id.num39);

        num_41 = findViewById(R.id.num41);
        num_42 = findViewById(R.id.num42);
        num_43 = findViewById(R.id.num43);
        num_44 = findViewById(R.id.num44);
        num_45 = findViewById(R.id.num45);
        num_46 = findViewById(R.id.num46);
        num_47 = findViewById(R.id.num47);
        num_48 = findViewById(R.id.num48);
        num_49 = findViewById(R.id.num49);

        num_51 = findViewById(R.id.num51);
        num_52 = findViewById(R.id.num52);
        num_53 = findViewById(R.id.num53);
        num_54 = findViewById(R.id.num54);
        num_55 = findViewById(R.id.num55);
        num_56 = findViewById(R.id.num56);
        num_57 = findViewById(R.id.num57);
        num_58 = findViewById(R.id.num58);
        num_59 = findViewById(R.id.num59);

        num_61 = findViewById(R.id.num61);
        num_62 = findViewById(R.id.num62);
        num_63 = findViewById(R.id.num63);
        num_64 = findViewById(R.id.num64);
        num_65 = findViewById(R.id.num65);
        num_66 = findViewById(R.id.num66);
        num_67 = findViewById(R.id.num67);
        num_68 = findViewById(R.id.num68);
        num_69 = findViewById(R.id.num69);

        num_71 = findViewById(R.id.num71);
        num_72 = findViewById(R.id.num72);
        num_73 = findViewById(R.id.num73);
        num_74 = findViewById(R.id.num74);
        num_75 = findViewById(R.id.num75);
        num_76 = findViewById(R.id.num76);
        num_77 = findViewById(R.id.num77);
        num_78 = findViewById(R.id.num78);
        num_79 = findViewById(R.id.num79);

        num_81 = findViewById(R.id.num81);
        num_82 = findViewById(R.id.num82);
        num_83 = findViewById(R.id.num83);
        num_84 = findViewById(R.id.num84);
        num_85 = findViewById(R.id.num85);
        num_86 = findViewById(R.id.num86);
        num_87 = findViewById(R.id.num87);
        num_88 = findViewById(R.id.num88);
        num_89 = findViewById(R.id.num89);

        num_91 = findViewById(R.id.num91);
        num_92 = findViewById(R.id.num92);
        num_93 = findViewById(R.id.num93);
        num_94 = findViewById(R.id.num94);
        num_95 = findViewById(R.id.num95);
        num_96 = findViewById(R.id.num96);
        num_97 = findViewById(R.id.num97);
        num_98 = findViewById(R.id.num98);
        num_99 = findViewById(R.id.num99);

        //Quick access for TextViews initialized above
        storage = new TextView[][]
                {{num_11, num_12, num_13, num_14, num_15, num_16, num_17, num_18, num_19},
                {num_21, num_22, num_23, num_24, num_25, num_26, num_27, num_28, num_29},
                {num_31, num_32, num_33, num_34, num_35, num_36, num_37, num_38, num_39},
                {num_41, num_42, num_43, num_44, num_45, num_46, num_47, num_48, num_49},
                {num_51, num_52, num_53, num_54, num_55, num_56, num_57, num_58, num_59},
                {num_61, num_62, num_63, num_64, num_65, num_66, num_67, num_68, num_69},
                {num_71, num_72, num_73, num_74, num_75, num_76, num_77, num_78, num_79},
                {num_81, num_82, num_83, num_84, num_85, num_86, num_87, num_88, num_89},
                {num_91, num_92, num_93, num_94, num_95, num_96, num_97, num_98, num_99},
                };

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int[][] board = new int[9][9];

                //For loops initializing integer or null values in board matrix. Removes need for each
                //number to be initialized individually
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        try {
                            board[i][j] = Integer.parseInt(storage[i][j].getText().toString());
                        } catch (Exception e) {
                            dialogBox.setText("You're not done. Press 'Check' when you're done.");
                        }
                    }
                }

                //Counts number of errors
                int count = 0;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
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

