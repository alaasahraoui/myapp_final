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
import static com.example.myapp6.R.id;
import static com.example.myapp6.R.layout;
import static com.example.myapp6.R.string;

public class Activity_calcul extends AppCompatActivity implements View.OnClickListener {
    Button btnSorte,btn_choix1,btn_choix2,btn_choix3;
    Button tabl_butn[]={btn_choix1,btn_choix2,btn_choix3};

    TextView text1,text2,text_oper,textResulta;
    int Scoor=0;
    int nbr_click=0;

    String oper[]={"+","-","X"};

    int i,j,k, resulta_debut,nbr2,btn_random_repanse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_calcul);


        tabl_butn[0]=findViewById(id.btn1_choix);
        tabl_butn[1]=findViewById(id.btn2_choix);
        tabl_butn[2]=findViewById(id.btn3_choix);
        btnSorte=findViewById(id.bSorteClcul);
        textResulta=findViewById(id.textResulta_time);

        btnSorte.setOnClickListener(this);
        text1=findViewById(id.text1);
        text2=findViewById(id.text2);
        text_oper=findViewById(id.text_oper);
        reJouer();
        tabl_butn[0].setOnClickListener(this);
        tabl_butn[1].setOnClickListener(this);
        tabl_butn[2].setOnClickListener(this);





    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if (v.getId()== id.btn1_choix){
            nbr_click++;



            if (tabl_butn[0]==tabl_butn[btn_random_repanse]){
                Scoor++;

                if (Scoor ==12){
                    ganier_12_sur_12();

                }
                else {
                    if (nbr_click >= 12){
                        fin_examen();
                    }
                    textResulta.setTextColor(getResources().getColor(vert));
                    textResulta.setText(string.mss_vrai);
                }


                reJouer();
            }
            else{
                if (nbr_click >= 12){
                    fin_examen();
                }
                if (Scoor>0) Scoor--;
                textResulta.setTextColor(getResources().getColor(rouge));
                textResulta.setText(string.mssg_foux_1);
            }


        }



        else{



            if (v.getId()== id.btn2_choix){
                nbr_click++;


                if (tabl_butn[1]==tabl_butn[btn_random_repanse]){
                    Scoor++;
                    if (Scoor ==12){
                        ganier_12_sur_12();

                    }
                    else {
                        if (nbr_click >= 12){
                            fin_examen();
                        }
                        textResulta.setTextColor(getResources().getColor(vert));
                        textResulta.setText(string.mss_vrai);
                    }


                    reJouer();
                }
                else{
                    if (nbr_click >= 12){
                        fin_examen();
                    }
                    if (Scoor>0) Scoor--;
                    textResulta.setTextColor(getResources().getColor(rouge));
                    textResulta.setText(string.mssg_foux_1);
                }

            }

            else{

                if (v.getId()== id.btn3_choix){
                    nbr_click++;

                    if (tabl_butn[2]==tabl_butn[btn_random_repanse]){
                        Scoor++;
                        if (Scoor ==12){
                            ganier_12_sur_12();

                        }
                        else {
                            if (nbr_click >= 12){
                                fin_examen();
                            }
                            textResulta.setTextColor(getResources().getColor(vert));
                            textResulta.setText(string.mss_vrai);
                        }


                        reJouer();
                    }
                    else{
                        if (nbr_click >= 12){
                            fin_examen();
                        }
                        if (Scoor>0) Scoor--;
                        textResulta.setTextColor(getResources().getColor(rouge));
                        textResulta.setText(string.mssg_foux_1);
                    }



                }

                else{
                    if (v.getId()== id.bSorteClcul){
                    fin_examen();
                    Intent intent_math = new Intent(this,Math.class);
                    this.startActivity(intent_math);
                    finish();}

                }

            }
        }}



        public void fin_examen(){
            LayoutInflater infl = this.getLayoutInflater();
            View ganer = infl.inflate(layout.activity_layout_ganier,(ViewGroup) findViewById(id.mon_dilog));
            TextView textBilder1=ganer.findViewById(id.textBilder1);
            TextView textBilder2=ganer.findViewById(id.textBilder2);
            textBilder1.setText(string.mss_fin);
            textBilder2.setText(Scoor+"/12");
            Toast my_toast= new Toast(this);
            my_toast.setDuration(Toast.LENGTH_LONG);
            my_toast.setView(ganer);
            my_toast.show();
            textResulta.setText("");
            nbr_click=0;
            Scoor=0;
        }

        public void ganier_12_sur_12(){textResulta.setTextColor(getResources().getColor(vert));
            textResulta.setText(string.ganer);
            LayoutInflater infl = this.getLayoutInflater();
            View ganer = infl.inflate(layout.activity_layout_ganier,(ViewGroup) findViewById(id.mon_dilog));
            TextView textBilder1=ganer.findViewById(id.textBilder1);
            TextView textBilder2=ganer.findViewById(id.textBilder2);
            textBilder1.setText(string.mss_fin);
            textBilder2.setText(Scoor+"/12");
            Toast my_toast= new Toast(this);
            my_toast.setDuration(Toast.LENGTH_LONG);
            my_toast.setView(ganer);
            my_toast.show();
            textResulta.setText("");
            nbr_click=0;
            Scoor=0;}
        public void reJouer() {
            i=new Random().nextInt(10)+1;
            j=new Random().nextInt(10)+1;
            k=new Random().nextInt(3);

            text_oper.setText(oper[k]);

            switch (oper[k]){
                case"+": resulta_debut= i+j;break;
                case"-":resulta_debut=i-j;break;
                case"X":resulta_debut=i*j;break;
            }

            btn_random_repanse=new Random().nextInt(2)+1;
            tabl_butn[btn_random_repanse].setText(String.valueOf(resulta_debut));

            int cpt=0;
            int nbr1 = new Random().nextInt(2)+1;

            while (cpt<3){


                if (cpt!=btn_random_repanse){
                    while ( nbr1 == resulta_debut || nbr1==nbr2 )
                    {
                        nbr1 = new Random().nextInt(2)+1;
                    }

                    tabl_butn[cpt].setText(String.valueOf(nbr1));
                    nbr2=nbr1;
                    nbr1 = new Random().nextInt(2)+1;



                }
                cpt++;
            }
            text1.setText(String.valueOf(i));
            text2.setText(String.valueOf(j));





        }


    }

