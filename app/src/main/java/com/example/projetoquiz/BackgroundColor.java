package com.example.projetoquiz;

import android.graphics.Color;
/**
 * Created by Sushant on 23-11-2016.
 */
import java.util.Random;
public class BackgroundColor {
    private String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };
    public int getColor(){
        String color;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt;
        colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
