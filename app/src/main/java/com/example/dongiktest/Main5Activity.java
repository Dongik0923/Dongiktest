package com.example.dongiktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toast.makeText(Main5Activity.this, "사랑합니다 교수님:hearts:", Toast.LENGTH_SHORT).show();
    }
}
