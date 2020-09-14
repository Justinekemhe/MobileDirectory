package com.example.mobiledirectory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    public void buttonclicked(View v) {
        if (v.getId()== R.id.button_add){
            Intent add = new Intent(getApplicationContext(),CompanyAdd.class);
            startActivity(add);
        }
    }

    }
