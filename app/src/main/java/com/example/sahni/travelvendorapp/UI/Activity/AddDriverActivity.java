package com.example.sahni.travelvendorapp.UI.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.sahni.travelvendorapp.R;

public class AddDriverActivity extends AppCompatActivity {
    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_driver);

        container=findViewById(R.id.container);
    }
}
