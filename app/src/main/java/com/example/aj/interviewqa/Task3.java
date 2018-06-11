package com.example.aj.interviewqa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer[] aa = new Integer[]{4,5,98,45,67,34,35,54,21,45,73,62};
        Integer[] bb = new Integer[]{6, 45, 54, 29, 32, 21, 87, 21, 34};

        Integer[] common = Task2WithJavaSupport.makeCommonArray(aa,bb);
        int max = Task2WithJavaSupport.findMax(common);
        int min = Task2WithJavaSupport.findMin(common);

        for(Integer i : common){
            Log.wtf("LOG_TAG", "common: " + i);
        }
        Log.wtf("LOG_TAG", "min: " + max);
        Log.wtf("LOG_TAG", "min: " + min);

        Integer[] _common = Task2ManualImplementation.makeCommonArray(aa,bb);
        Integer _max = Task2ManualImplementation.findMax(_common);
        Integer _min = Task2ManualImplementation.findMin(_common);

        for(Integer i : _common){
            Log.wtf("LOG_TAG", "common: " + i);
        }
        Log.wtf("LOG_TAG", "min: " + _max);
        Log.wtf("LOG_TAG", "min: " + _min);

    }
}
