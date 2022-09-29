package com.example.appquecocino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView registerTextView;
    Button loginBtn;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=(EditText) findViewById(R.id.email_edit_text);
        password=findViewById(R.id.password_edit_text);

        loginBtn=findViewById(R.id.login_btn);
        registerTextView=findViewById(R.id.register_text_view_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailtxt = email.getText().toString();
                String passwordtxt = password.getText().toString();

                if(emailtxt.isEmpty()){
                    email.setError("Debe ingresar un correo.");
                    email.requestFocus();
                    return;
                }

                if(!Patterns.EMAIL_ADDRESS.matcher(emailtxt).matches()){
                    email.setError("Ingrese un correo válido.");
                    email.requestFocus();
                    return;
                }

                if(passwordtxt.isEmpty()){
                    password.setError("Debe ingresar una contraseña.");
                    password.requestFocus();
                    return;
                }else{
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}