package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_EDT_NAME = "KEY_EDT_NAME";
    public static final String KEY_EDT_FAMILY = "KEY_EDT_FAMILY";
    public static final String KEY_EDT_AGE = "KEY_EDT_AGE";
    public static final String KEY_EDT_PROFILE = "KEY_EDT_PROFILE";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 2;
        Button btn_add = findViewById(R.id.btn_add);
        EditText edt_name = findViewById(R.id.edt_name);
        EditText edt_family = findViewById(R.id.edt_family);
        EditText edt_age = findViewById(R.id.edt_age);

        profileData profileData = new profileData();
        profileData.setName("alireza");
        profileData.setFamily("mohammadi");
        profileData.setAddress("amirkavir");
        profileData.setCity("12");
        profileData.setAge("23");
        profileData.setCountry("");


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_edt_name = edt_name.getText().toString();
                String text_edt_family = edt_family.getText().toString();
                String text_edt_age = edt_age.getText().toString();

                Intent intent3 = new Intent(MainActivity.this , profileActivity.class);
//                intent3.putExtra(KEY_EDT_NAME, text_edt_name);
//                intent3.putExtra(KEY_EDT_FAMILY, text_edt_family);
//                intent3.putExtra(KEY_EDT_AGE, text_edt_age);
                intent3.putExtra(KEY_EDT_PROFILE , profileData);
                MainActivity.this.startActivity(intent3);



            }
        });


//        Log.e("TAG", "txt_name: "+ name);


    }
}