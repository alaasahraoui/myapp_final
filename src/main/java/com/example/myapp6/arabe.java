package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class arabe extends AppCompatActivity {
    Button butn_arabe1,butn_arabe4,butn_arabe3,butn_arabe2,btn_sorte;
    Intent Intent_arabe1,Intent_arabe2,Intent_arabe3,Intent_arabe4,intent_aba1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_arabe);
        butn_arabe1=findViewById(R.id.butn_arabe1);
        butn_arabe4=findViewById(R.id.butn_arabe4);
        butn_arabe3=findViewById(R.id.butn_arabe3);
        butn_arabe2=findViewById(R.id.butn_arabe2);
        btn_sorte=findViewById(R.id.butnSortie2);
        Intent_arabe2=new Intent(this,les_animaux.class);
        Intent_arabe3 = new Intent(this,les_phrase.class);
        Intent_arabe1= new Intent(this,alphebet.class);
        Intent_arabe4= new Intent(this,les_color.class);
        intent_aba1=new Intent(this,Activity3.class);
        butn_arabe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Intent_arabe2);
                finish();
            }
        });
        butn_arabe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Intent_arabe3);
                finish();

            }
        });
        butn_arabe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Intent_arabe1);
                finish();

            }
        });
        butn_arabe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Intent_arabe4);
                finish();


            }
        });
        btn_sorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_aba1);
                finish();
            }
        });
    }
}
