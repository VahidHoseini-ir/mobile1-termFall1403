package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.time.chrono.ThaiBuddhistChronology;

import javax.security.auth.login.LoginException;

public class splashAcitivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "onStart splashAcitivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "onResume splashAcitivity");

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Log.e("TAG", "onCreate splashAcitivity");

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(splashAcitivity.this, MainActivity.class);
//                splashAcitivity.this.startActivity(intent);
//
//            }
//        },3000);


        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                splashAcitivity.this.startActivity(new Intent(splashAcitivity.this, MainActivity.class));
                finish();

            }
        };

        new Handler().postDelayed(runnable1, 3000);


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "onPause splashAcitivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "onStop splashAcitivity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "onDestroy splashAcitivity");

    }

    public void goToActivityB() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent intent123 = new Intent(splashAcitivity.this, MainActivity.class);
                    splashAcitivity.this.startActivity(intent123);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }


}
