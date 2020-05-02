package com.example.myapp6;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class francais_activity extends AppCompatActivity {
    Button button;
     Button button1,sortie_francais;
     Intent intent_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_activity);
        button=(Button) findViewById(R.id.Quiz01);
        button1=(Button) findViewById(R.id.Quiz02);
        sortie_francais=findViewById(R.id.sorte_francais);
        intent_main=new Intent(this,Activity3.class);
        sortie_francais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_main);
                finish();

            }
        });
        View.OnClickListener check=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==button.getId()){
                    gotoAc01();
                }if (view.getId()==button1.getId()){
                    gotoAc02();
                }
            }
        };
        button.setOnClickListener(check);
        button1.setOnClickListener(check);
    }
    public void gotoAc01(){
        Intent intent =new Intent(this,activity_francais_0.class);
        startActivity(intent);
    }public void gotoAc02(){
        Intent intent =new Intent(this,activity_francais1.class);
        startActivity(intent);
    }
}
