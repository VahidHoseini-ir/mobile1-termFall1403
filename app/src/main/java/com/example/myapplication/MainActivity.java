package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 4473bd6 (first commit)
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 2;
        Button btn_add = findViewById(R.id.btn_add);
        EditText edt_name = findViewById(R.id.edt_name);
<<<<<<< HEAD
        TextView txt_name = findViewById(R.id.txt_name);
        TextView txt_family = findViewById(R.id.txt_family);
        TextView txt_age = findViewById(R.id.txt_age);

        txt_name.setText(" Morteza");
        txt_family.setText(" Hoseini");
        txt_age.setText(" 21 years old");
=======
        EditText edt_family = findViewById(R.id.edt_family);
        EditText edt_age = findViewById(R.id.edt_age);
>>>>>>> 4473bd6 (first commit)

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                String name = edt_name.getText().toString();
                if(name.length()>1){
                    name = edt_name.getText().toString();
                }else{
                    name = "error";
                }
                txt_name.setText(name);
=======
                String text_edt_name = edt_name.getText().toString();
                String text_edt_family = edt_family.getText().toString();
                String text_edt_age = edt_age.getText().toString();

                Intent intent3 = new Intent(MainActivity.this, profileActivity.class);
                intent3.putExtra("key_text_edt_name", text_edt_name);
                intent3.putExtra("key_text_edt_family", text_edt_family);
                intent3.putExtra("key_text_edt_age", text_edt_age);
                MainActivity.this.startActivity(intent3);

>>>>>>> 4473bd6 (first commit)

            }
        });


//        Log.e("TAG", "txt_name: "+ name);


    }
}