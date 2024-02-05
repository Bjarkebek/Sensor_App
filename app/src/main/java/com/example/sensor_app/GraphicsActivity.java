package com.example.sensor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class GraphicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics);
        MyGraphics myGraphics = new MyGraphics(this);

        FrameLayout fl = (FrameLayout) findViewById(R.id.fl_graphics);
        fl.addView(myGraphics,0);

    }
}