package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alphebet extends AppCompatActivity {
    Button btn_Sortie3,btnaller,btnretour;
    TextView text_lettre;
    ImageView image_mots;
    int compteur=0;
    int mots[]={R.string.l1,R.string.l2,R.string.l3,R.string.l4,R.string.l5,R.string.l6,
            R.string.l7,R.string.l8,R.string.l9,R.string.l10,R.string.l11,R.string.l12,
            R.string.l13,R.string.l14,R.string.l15,R.string.l16,R.string.l17,R.string.l18,
            R.string.l19,R.string.l20,R.string.l21,R.string.l22,R.string.l23,R.string.l24,
            R.string.l25,R.string.l26,R.string.l27,R.string.l28};
    int photo_mpts[]={R.drawable.a,R.drawable.b,R.drawable.t,R.drawable.t1,R.drawable.h,R.drawable.j,R.drawable.kh,R.drawable.d,R.drawable.dt,
            R.drawable.r1,R.drawable.z,R.drawable.s,R.drawable.ch,R.drawable.sa,R.drawable.daa,
            R.drawable.ta,R.drawable.dat,R.drawable.a3a,R.drawable.ra1,R.drawable.fa,R.drawable.a9,
            R.drawable.ka,R.drawable.la,R.drawable.ma,R.drawable.na,R.drawable.ha,R.drawable.wa,
            R.drawable.ya};
    Intent intent_arabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphebet);
        btn_Sortie3=findViewById(R.id.butnSortie3);
        btnaller=findViewById(R.id.btnaller);
        btnretour=findViewById(R.id.btnretour);
        text_lettre=findViewById(R.id.text_lettre);
        image_mots=findViewById(R.id.image_mots);
        image_mots.setImageResource(photo_mpts[compteur]);
        text_lettre.setText(mots[compteur]);

        btnaller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnretour.setVisibility(btnretour.VISIBLE);
                if (compteur<28){
                compteur++;}
                if (compteur==28){
                    btnaller.setVisibility(btnaller.INVISIBLE);
                }
                else {

                    image_mots.setImageResource(photo_mpts[compteur]);
                    text_lettre.setText(mots[compteur]);

                }


            }
        });
        btnretour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnaller.setVisibility(btnaller.VISIBLE);
                if (compteur>=0){
                compteur--;}
                if (compteur<0){
                    compteur=0;
                    btnretour.setVisibility(btnretour.INVISIBLE);

                }
                else {

                    image_mots.setImageResource(photo_mpts[compteur]);
                    text_lettre.setText(mots[compteur]);

                }


            }
        });
        intent_arabe= new Intent(this,arabe.class);
        btn_Sortie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_arabe);
                finish();

            }
        });
    }
}
