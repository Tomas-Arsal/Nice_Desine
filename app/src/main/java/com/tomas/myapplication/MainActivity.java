package com.tomas.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.balysv.materialripple.MaterialRippleLayout;

public class MainActivity extends AppCompatActivity {
    MaterialRippleLayout Hell;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hell = findViewById(R.id.Hell);
        Hell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);
            }
        });

    }
}
// a comment in xml do   ctrol /
/*
    <TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:textColor="@color/colorPrimary"
    android:textSize="20dp"
    android:text="LOVE YOU JESUS "
    android:gravity="center"
    android:textStyle="bold"
    android:shadowRadius="30"
    android:shadowDx="5"
    android:shadowDy="5"
    android:shadowColor="@color/colorPrimaryDark"
    />
    */