package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.time.chrono.ThaiBuddhistChronology;

public class splashAcitivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(splashAcitivity.this, MainActivity.class);
//                splashAcitivity.this.startActivity(intent);
//
//            }
//        },3000);


        Handler handler2 = new Handler();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Intent intent123 = new Intent(splashAcitivity.this, MainActivity.class);
                splashAcitivity.this.startActivity(intent123);

            }
        };

        handler2.postDelayed(runnable1, 3000);



    }

//    public void goToActivityB() {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(3000);
//
//                    Intent intent123 = new Intent(splashAcitivity.this, MainActivity.class);
//                    splashAcitivity.this.startActivity(intent123);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        thread.start();
//    }


}
