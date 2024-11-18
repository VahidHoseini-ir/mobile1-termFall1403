package com.example.myapplication;

import static com.example.myapplication.MainActivity.KEY_EDT_PROFILE;

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
        profileData profileDataActivity = dataIntent.getParcelableExtra(KEY_EDT_PROFILE);

        if(dataIntent != null){
            Log.d("TAG", "key_text_edt_name     "+profileDataActivity.getName());
            Log.d("TAG", "key_text_edt_family   "+profileDataActivity.getFamily());
            Log.d("TAG", "key_text_edt_age      "+profileDataActivity.getAge());
        }

    }
}
