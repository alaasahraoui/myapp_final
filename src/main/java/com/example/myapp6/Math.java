package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Math extends AppCompatActivity implements View.OnClickListener {
    Button butn_compar,butn_calcul,butn_number,butn_achekl,butnSortie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        butn_achekl=findViewById(R.id.butn_achekl);
        butn_calcul=findViewById(R.id.butn_calcul);
        butn_compar=findViewById(R.id.butn_compar);
        butn_number=findViewById(R.id.butn_number);

        butnSortie=findViewById(R.id.butnSortie);
        butnSortie.setOnClickListener(this);
        butn_number.setOnClickListener(this);
        butn_compar.setOnClickListener(this);
        butn_achekl.setOnClickListener(this);
        butn_calcul.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.butnSortie){
            Intent intent_main = new Intent(this,Activity3.class);
            this.startActivity(intent_main);
            finish();

        }
        else{
            if (v.getId()==R.id.butn_number){
                Intent intent_number= new Intent(this,math_number.class);
                this.startActivity(intent_number);
                finish();

            }
            else{

                if (v.getId()==R.id.butn_achekl){
                    Intent intent_forme= new Intent(this,forme.class);
                    this.startActivity(intent_forme);
                    finish();

                }
                else{
                    if (v.getId()==R.id.butn_compar){
                        Intent intent_compar = new Intent(this,compare_math.class);
                        this.startActivity(intent_compar);
                        finish();

                    }
                    else{
                        Intent intent_calcul = new Intent(this,Activity_calcul.class);
                        this.startActivity(intent_calcul);
                        finish();


                    }
                }
            }
        }
    }
}
