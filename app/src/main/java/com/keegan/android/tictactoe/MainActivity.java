package com.keegan.android.tictactoe;

import android.graphics.Point;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button[][] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        buildGuiByCode();
    }

    public void buildGuiByCode(){
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w = size.x / TicTacToe.SIDE;

        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(TicTacToe.SIDE);
        gridLayout.setRowCount(TicTacToe.SIDE);

        buttons = new Button[TicTacToe.SIDE][TicTacToe.SIDE];
        for(int row = 0; row < TicTacToe.SIDE; row++){
            for(int col = 0; col < TicTacToe.SIDE; col++){
                buttons[row][col] = new Button(this);
                gridLayout.addView(buttons[row][col], w, w);
            }
        }

        setContentView(gridLayout);
    }
}
