package com.masterandroid.viewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buton1;
    EditText edit1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton1 = findViewById(R.id.button1);
        edit1 = findViewById(R.id.editText);
        txt1 = findViewById(R.id.text1);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String text = edit1.getText().toString();
               txt1.setText(text);
            }
        });
    }
}