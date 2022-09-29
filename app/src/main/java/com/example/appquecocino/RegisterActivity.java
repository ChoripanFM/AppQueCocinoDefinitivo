package com.example.appquecocino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView loginTextView;
    Button registerBtn;
    EditText email, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email=findViewById(R.id.email_edit_text);
        password=findViewById(R.id.password_edit_text);
        confirmPassword=findViewById(R.id.confirm_password_edit_text);

        registerBtn=findViewById(R.id.register_btn);
        loginTextView=findViewById(R.id.login_text_view);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailtxt = email.getText().toString();
                String passwordtxt = password.getText().toString();
                String confirmpasswordtxt = confirmPassword.getText().toString();

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
                }

                if(!passwordtxt.equals(confirmpasswordtxt)){
                    confirmPassword.setError("La contraseña no coincide.");
                    confirmPassword.requestFocus();
                    return;
                }else{
                    Intent i = new Intent(RegisterActivity.this, HomeActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}