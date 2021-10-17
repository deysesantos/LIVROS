package br.com.example.livros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button botaoLivro1 = findViewById(R.id.btnLivro1);

        botaoLivro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaLivro1 = new Intent(PrincipalActivity.this, Livro1Activity.class);
                startActivity(irParaLivro1);
            }
        });



        Button botaoLivro2 = findViewById(R.id.btnLivro2);

        botaoLivro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaLivro2 = new Intent(PrincipalActivity.this, Livro2Activity.class);
                startActivity(irParaLivro2);
            }
        });
        Button botaoLivro3 = findViewById(R.id.btnLivro3);

        botaoLivro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaLivro3 = new Intent(PrincipalActivity.this, Livro3Activity.class);
                startActivity(irParaLivro3);
            }
        });
            }
        };










