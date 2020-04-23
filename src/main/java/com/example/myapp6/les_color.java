package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static com.example.myapp6.R.color.vert;

public class les_color extends AppCompatActivity {
    Button btn1,btn2,btn3,btnSorte;
    Button tabl_btn[]={btn1,btn2,btn3};
    TextView textReslt;
    ImageView viewColor;
    int btn_vrai_reponse;
    int random_color_choix,random_color_choix_avant;
    int color[]={R.color.rouge1,R.color.vert2,R.color.jone3,R.color.blue4,R.color.banafsaji5,R.color.bortoGali6
    ,R.color.noire7,R.color.blanche8,R.color.wardi9,R.color.bonie10};
    int name_color[]={R.string.rouje1,R.string.vert2,R.string.jone3,R.string.blue4,R.string.banafsaji5,R.string.bortoGali6
            ,R.string.noire7,R.string.blanche8,R.string.wardi9,R.string.bonie10};
    int Scoor=0;
    int nbr_click=0;
    Intent intent_arabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_color);
        btnSorte=findViewById(R.id.bSortecolor);
        tabl_btn[0]=findViewById(R.id.btn1);
        tabl_btn[1]=findViewById(R.id.btn2);
        tabl_btn[2]=findViewById(R.id.btn3);
        viewColor=findViewById(R.id.viewColor);
        textReslt=findViewById(R.id.textReslta);
        intent_arabe=new Intent(this,arabe.class);

        jouer();


        btnSorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    fin_examen();
                startActivity(intent_arabe);
                finish();



            }
        });
        tabl_btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;

                if (tabl_btn[0]==tabl_btn[btn_vrai_reponse]){
                    Scoor++;
                    if (Scoor==12){ganier_12_sur_12();}
                    else{if (nbr_click>=12){fin_examen();}
                    else {
                        textReslt.setTextColor(getResources().getColor(vert));
                        textReslt.setText(R.string.mss_vrai);
                        jouer();
                    }}





                }
                else{
                    if (nbr_click>=12) {fin_examen();}
                    else{
                        if (Scoor>0) Scoor--;
                        textReslt.setTextColor(getResources().getColor(R.color.rouge));
                        textReslt.setText(R.string.mssg_foux_1);
                    }


                }

            }
        });
        tabl_btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;

                if (tabl_btn[1]==tabl_btn[btn_vrai_reponse]){
                    Scoor++;
                    if (Scoor==12){ganier_12_sur_12();}
                    else{if (nbr_click>=12){fin_examen();}
                    else {
                        textReslt.setTextColor(getResources().getColor(vert));
                        textReslt.setText(R.string.mss_vrai);
                        jouer();
                    }}





                }
                else{
                    if (nbr_click>=12) {fin_examen();}
                    else{
                        if (Scoor>0) Scoor--;
                        textReslt.setTextColor(getResources().getColor(R.color.rouge));
                        textReslt.setText(R.string.mssg_foux_1);
                    }


                }

            }
        });
        tabl_btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;

                if (tabl_btn[2]==tabl_btn[btn_vrai_reponse]){
                    Scoor++;
                    if (Scoor==12){ganier_12_sur_12();}
                    else{if (nbr_click>=12){fin_examen();}
                    else {
                        textReslt.setTextColor(getResources().getColor(vert));
                        textReslt.setText(R.string.mss_vrai);
                        jouer();
                    }}





                }
                else{
                    if (nbr_click>=12) {fin_examen();}
                    else{
                        if (Scoor>0) Scoor--;
                        textReslt.setTextColor(getResources().getColor(R.color.rouge));
                        textReslt.setText(R.string.mssg_foux_1);
                    }


                }

            }
        });



    }
    public void ganier_12_sur_12(){textReslt.setTextColor(getResources().getColor(vert));
        textReslt.setText(R.string.ganer);
        LayoutInflater infl = this.getLayoutInflater();
        View ganer = infl.inflate(R.layout.activity_layout_ganier,(ViewGroup) findViewById(R.id.mon_dilog));
        TextView textBilder1=ganer.findViewById(R.id.textBilder1);
        TextView textBilder2=ganer.findViewById(R.id.textBilder2);
        textBilder1.setText(R.string.mss_fin);
        textBilder2.setText(Scoor+"/12");
        Toast my_toast= new Toast(this);
        my_toast.setDuration(Toast.LENGTH_LONG);
        my_toast.setView(ganer);
        my_toast.show();
        textReslt.setText("");
        nbr_click=0;
        Scoor=0;}
    public void fin_examen(){
        LayoutInflater infl = this.getLayoutInflater();
        View ganer = infl.inflate(R.layout.activity_layout_ganier,(ViewGroup) findViewById(R.id.mon_dilog));
        TextView textBilder1=ganer.findViewById(R.id.textBilder1);
        TextView textBilder2=ganer.findViewById(R.id.textBilder2);
        textBilder1.setText(R.string.mss_fin);
        textBilder2.setText(Scoor+"/12");
        Toast my_toast= new Toast(this);
        my_toast.setDuration(Toast.LENGTH_LONG);
        my_toast.setView(ganer);
        my_toast.show();
        textReslt.setText("");
        nbr_click=0;
        Scoor=0;
    }
    public void jouer(){
        random_color_choix= new Random().nextInt(10);
        while (random_color_choix==random_color_choix_avant){
            random_color_choix= new Random().nextInt(10);
        }
        random_color_choix_avant=random_color_choix;
        viewColor.setImageResource(color[random_color_choix]);
         btn_vrai_reponse=new Random().nextInt(3);
        tabl_btn[btn_vrai_reponse].setText(getResources().getString(name_color[random_color_choix]));
        int cpt=0;
        int btn_faux_reponse1=new Random().nextInt(10);
        int btn_faux_reponse2=0;
        while (cpt<3){


            if (cpt!=btn_vrai_reponse){
                while ( btn_faux_reponse1== random_color_choix|| btn_faux_reponse1==btn_faux_reponse2 )
                {
                    btn_faux_reponse1 = new Random().nextInt(2)+1;
                }

                tabl_btn[cpt].setText(getResources().getString(name_color[btn_faux_reponse1]));
                btn_faux_reponse2=btn_faux_reponse1;




            }
            cpt++;
        }



    }

}
