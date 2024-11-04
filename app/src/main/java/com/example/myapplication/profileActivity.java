package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class profileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);


        Intent dataIntent = getIntent();
        if(dataIntent != null){
            Log.d("TAG", "key_text_edt_name     "+dataIntent.getStringExtra("key_text_edt_name"));
            Log.d("TAG", "key_text_edt_family   "+dataIntent.getStringExtra("key_text_edt_family"));
            Log.d("TAG", "key_text_edt_age      "+dataIntent.getStringExtra("key_text_edt_age"));
        }



    }
}
