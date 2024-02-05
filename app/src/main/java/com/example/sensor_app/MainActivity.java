package com.example.sensor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();

        ((ListView) findViewById(R.id.lv_sensor)).setAdapter(
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list));

        List<Sensor> deviceSensors = ((SensorManager) getSystemService(SENSOR_SERVICE))
                .getSensorList(Sensor.TYPE_ALL);

        // to add every sensor in the device to the list
        for (Sensor sensor : deviceSensors) {
            list.add(sensor.getName());
        }

        findViewById(R.id.btn_accelerator).setOnClickListener(view ->
                startActivity(new Intent(this, AcceleratorActivity.class))
        );


    }
}