package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class les_animaux extends AppCompatActivity {
    Button btn_aller_anim,btn_retour_anim,btnSorte_anim;
    ImageView image_anim;
    int[] list_anim={R.drawable.animal1,R.drawable.animal2,R.drawable.animal3,R.drawable.animal4,R.drawable.animal5,
            R.drawable.animal6,R.drawable.animal7,R.drawable.animal8,R.drawable.animal9,R.drawable.animal10,
            R.drawable.animal11,R.drawable.animal12,R.drawable.animal13,R.drawable.animal14,R.drawable.animal15,
            R.drawable.animal16,R.drawable.animal17,R.drawable.animal18,R.drawable.animal19,R.drawable.animal20,
            R.drawable.animal21,R.drawable.animal22,R.drawable.animal23,R.drawable.animal24,R.drawable.animal25,
            R.drawable.animal26,R.drawable.animal27,R.drawable.animal28,R.drawable.animal29,R.drawable.animal30,
            R.drawable.animal31};
    int nbr_click;
    Intent intent_arabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_animaux);
        btn_aller_anim=findViewById(R.id.btn_aller_anim);
        btn_retour_anim=findViewById(R.id.btn_retour_anim);
        btnSorte_anim=findViewById(R.id.bSorte_anim);
        image_anim=findViewById(R.id.image_anim);
        nbr_click=0;
        image_anim.setImageResource(list_anim[nbr_click]);

        intent_arabe=new Intent(this,arabe.class);
        btn_aller_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_click<=30){
                    btn_retour_anim.setVisibility(btn_retour_anim.VISIBLE);
                    image_anim.setImageResource(list_anim[nbr_click]);

                }
                else{btn_aller_anim.setVisibility(btn_aller_anim.INVISIBLE);
                nbr_click=30;}
            }
        });
        btn_retour_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click--;
                if (nbr_click>=0){
                    btn_aller_anim.setVisibility(btn_aller_anim.VISIBLE);

                    image_anim.setImageResource(list_anim[nbr_click]);

                }
                else{btn_retour_anim.setVisibility(btn_retour_anim.INVISIBLE);
                nbr_click=0;}
            }
        });
        btnSorte_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(intent_arabe);
               finish();
            }
        });
    }
}
