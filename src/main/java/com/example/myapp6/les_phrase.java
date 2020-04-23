package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static com.example.myapp6.R.color.rouge;
import static com.example.myapp6.R.color.vert;

public class les_phrase extends AppCompatActivity {
    Button btn3_mots,btn2_mots,btn1_mots,btn_quiter;
    TextView text_resulta,text_phrase;
    Intent intent_arabe;
    int compteur_avant;
    int[] tabl_qst={R.string.qst1,R.string.qst2,R.string.qst3,R.string.qst4,R.string.qst5,
            R.string.qst6,R.string.qst7,R.string.qst8,R.string.qst9,R.string.qst10};
    int[] repanse= {R.string.rep1_1_v,R.string.rep1_2,R.string.rep1_3,
            R.string.rep2_1_v,R.string.rep2_2,R.string.rep2_3,
            R.string.rep3_1_v,R.string.rep3_2,R.string.rep3_3,
            R.string.rep4_1_v,R.string.rep4_2,R.string.rep4_3,
            R.string.rep5_1_v,R.string.rep5_2,R.string.rep5_3,
            R.string.rep6_1_v,R.string.rep6_2,R.string.rep6_3,
            R.string.rep7_1_v,R.string.rep7_2,R.string.rep7_3,
            R.string.rep8_1_v,R.string.rep8_2,R.string.rep8_3,
            R.string.rep9_1_v,R.string.rep9_2,R.string.rep9_3,
            R.string.rep10_1_v,R.string.rep10_2,R.string.rep10_3
            };
    Button tabl_butn[]={btn1_mots,btn2_mots,btn3_mots};
    int compteur,nbr_click,Scoor;
    int position_repanse_vrai, repans_faux;
    int la_vrai_repanse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_phrase);
        text_phrase=findViewById(R.id.txt_phrase);
         la_vrai_repanse=compteur;
        text_resulta=findViewById(R.id.textReslta_phrase);
        tabl_butn[0]=findViewById(R.id.btn1_mots);
        tabl_butn[1]=findViewById(R.id.btn2_mots);
        tabl_butn[2]=findViewById(R.id.btn3_mots);
        btn_quiter=findViewById(R.id.bSorte_phrase);
        intent_arabe= new Intent(this, arabe.class);
        compteur=0;
        nbr_click=0;
        repans_faux=compteur+1;
        Scoor=0;
        jouer();
        btn_quiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fin_examen();
                startActivity(intent_arabe);
                finish();
            }
        });
        tabl_butn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if(tabl_butn[0]==tabl_butn[position_repanse_vrai]){

                    Scoor++;
                    if (Scoor==10){ganier_10_sur_10();}
                    else {
                        text_resulta.setTextColor(getResources().getColor(vert));
                        text_resulta.setText(R.string.mss_vrai);
                    }
                    jouer();


                }
                else{
                    if (Scoor>0) Scoor--;
                    text_resulta.setTextColor(getResources().getColor(rouge));
                    text_resulta.setText(R.string.mssg_foux_1);
                }
                if (nbr_click >= 10){
                    fin_examen();



                }

            }
        });

        tabl_butn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if(tabl_butn[1]==tabl_butn[position_repanse_vrai]){

                    Scoor++;
                    if (Scoor==10){ganier_10_sur_10();}
                    else {
                        text_resulta.setTextColor(getResources().getColor(vert));
                        text_resulta.setText(R.string.mss_vrai);
                    }
                    jouer();


                }
                else{
                    if (Scoor>0) Scoor--;
                    text_resulta.setTextColor(getResources().getColor(rouge));
                    text_resulta.setText(R.string.mssg_foux_1);
                }
                if (nbr_click >= 10){
                    fin_examen();



                }

            }
        });

        tabl_butn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if(tabl_butn[2]==tabl_butn[position_repanse_vrai]){

                    Scoor++;
                    if (Scoor==10){ganier_10_sur_10();}
                    else {
                        text_resulta.setTextColor(getResources().getColor(vert));
                        text_resulta.setText(R.string.mss_vrai);
                    }
                    jouer();


                }
                else{
                    if (Scoor>0) Scoor--;
                    text_resulta.setTextColor(getResources().getColor(rouge));
                    text_resulta.setText(R.string.mssg_foux_1);
                }
                if (nbr_click >= 10){
                    fin_examen();



                }

            }
        });


    }
    public void ganier_10_sur_10(){text_resulta.setTextColor(getResources().getColor(vert));
        text_resulta.setText(R.string.ganer);
        LayoutInflater infl = this.getLayoutInflater();
        View ganer = infl.inflate(R.layout.activity_layout_ganier,(ViewGroup) findViewById(R.id.mon_dilog));
        TextView textBilder1=ganer.findViewById(R.id.textBilder1);
        TextView textBilder2=ganer.findViewById(R.id.textBilder2);
        textBilder1.setText(R.string.mss_fin);
        textBilder2.setText(Scoor+"/10");
        Toast my_toast= new Toast(this);
        my_toast.setDuration(Toast.LENGTH_LONG);
        my_toast.setView(ganer);
        my_toast.show();
        compteur=0;
        compteur_avant=compteur;
        la_vrai_repanse=compteur;
        repans_faux=compteur+1;


        nbr_click=0;
        Scoor=0;}
    public void fin_examen(){
        LayoutInflater infl = this.getLayoutInflater();
        View ganer = infl.inflate(R.layout.activity_layout_ganier,(ViewGroup) findViewById(R.id.mon_dilog));
        TextView textBilder1=ganer.findViewById(R.id.textBilder1);
        TextView textBilder2=ganer.findViewById(R.id.textBilder2);
        textBilder1.setText(R.string.mss_fin);
        textBilder2.setText(Scoor+"/10");
        Toast my_toast= new Toast(this);
        my_toast.setDuration(Toast.LENGTH_LONG);
        my_toast.setView(ganer);
        my_toast.show();
        text_resulta.setText("");
        nbr_click=0;
        Scoor=0;
        compteur=0;
        compteur_avant=compteur;
        la_vrai_repanse=compteur;
        repans_faux=compteur+1;

    }

    public void jouer(){
        text_phrase.setText(tabl_qst[compteur]);
        position_repanse_vrai= new Random().nextInt(3);

        tabl_butn[position_repanse_vrai].setText(repanse[la_vrai_repanse]);


        int cpt=0;

        while (cpt<3){
            if (cpt != position_repanse_vrai){

                tabl_butn[cpt].setText(repanse[repans_faux]);
                repans_faux++;



            }
            cpt++;
        }
        compteur_avant=compteur;
        compteur++;

        if(compteur==10){compteur=compteur_avant;
        la_vrai_repanse=repanse.length-3;
            repans_faux=repanse.length-2;
        }else{la_vrai_repanse=la_vrai_repanse+3;
            repans_faux=repans_faux+1;}






    }
}


