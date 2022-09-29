package com.example.appquecocino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BienvenidaActivity extends AppCompatActivity{

    Button registerBtn;
    TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        registerBtn=findViewById(R.id.register_btn);
        loginTextView=findViewById(R.id.login_text_view);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BienvenidaActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BienvenidaActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}