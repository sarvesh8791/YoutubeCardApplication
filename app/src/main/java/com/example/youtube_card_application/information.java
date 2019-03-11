package com.example.youtube_card_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class information extends AppCompatActivity {
Button btnChangeText;
TextView tv_text;
EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        tv_text=findViewById(R.id.change8);
        btnChangeText=findViewById(R.id.btn);
        et=findViewById(R.id.input_text);
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st=et.getText().toString();
                tv_text.setText(st);
                Toast.makeText(getApplicationContext(),"Commented Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
