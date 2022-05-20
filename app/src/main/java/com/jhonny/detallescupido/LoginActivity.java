package com.jhonny.detallescupido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    //Intanciar una variable de tipo button
    Button mbtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // almacenar el id btnLogin del xml o layout y settear ese id en la variable mbtnLogin
       mbtnLogin = findViewById(R.id.btnLogin);

       // Generar un evento onClick para cuando se presione el boton login y me rediriga a AdminActivity
       mbtnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(LoginActivity.this,AdminActivity.class);
               startActivity(intent);
               finish();
           }
       });

    }
}