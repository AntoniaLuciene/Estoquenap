package com.example.estoque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Novo_Controlador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo__controlador);

        Button btn = (Button) findViewById(R.id.btn_add);

        EditText nome = (EditText) findViewById(R.id.edt_nom);
        EditText matr = (EditText) findViewById(R.id.edt_matr);
        EditText email = (EditText) findViewById(R.id.edt_email);
        EditText senha = (EditText) findViewById(R.id.edt_senha);


        btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });



    }
}