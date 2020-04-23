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

import static com.example.myapp6.R.color.rouge;
import static com.example.myapp6.R.color.vert;

public class forme extends AppCompatActivity {
    int encien_image;
    int image[]={R.drawable.forme1,R.drawable.forme2,R.drawable.forme3,R.drawable.forme4,R.drawable.forme5,R.drawable.forme6,R.drawable.forme7
    ,R.drawable.forme8,R.drawable.forme9,R.drawable.forme10,R.drawable.forme11,R.drawable.forme12};
    int[] nome = {R.string.forme1,R.string.forme2,R.string.forme3,R.string.forme4,R.string.forme5,
            R.string.forme6,R.string.forme7,R.string.forme8,R.string.forme9,R.string.forme10
            ,R.string.forme11,R.string.forme12};
    Button btnchoix1,btnchoix2,btnchoix3,btn_quiter;
    Button table_butn[]={btnchoix1,btnchoix2,btnchoix3} ;
    ImageView imagev;
    TextView textResulta3;
    int Scoor=0;
    int nbr_click=0;
    int place_vrai_reponse;
    Intent intent_math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forme);
        table_butn[0]=findViewById(R.id.btnchoix1);
        table_butn[1]=findViewById(R.id.btnchoix2);
        table_butn[2]=findViewById(R.id.btnchoix3);
        btn_quiter=findViewById(R.id.btnSorte_forme);
        imagev=findViewById(R.id.imagev);
        textResulta3=findViewById(R.id.textResulta3);
        intent_math = new Intent(this, Math.class);
        jouer();

        table_butn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    nbr_click++;

                    if (table_butn[0]==table_butn[ place_vrai_reponse]){
                        Scoor++;
                        if (Scoor ==12){
                            ganier_12_sur_12();

                        }
                        else {
                            textResulta3.setTextColor(getResources().getColor(vert));
                            textResulta3.setText(R.string.mss_vrai);
                        }


                        jouer();
                    }
                    else{
                        if (Scoor>0) Scoor--;
                        textResulta3.setTextColor(getResources().getColor(rouge));
                        textResulta3.setText(R.string.mssg_foux_1);
                    }
                    if (nbr_click >= 12){
                        fin_examen();



                    }

                }



        });
        table_butn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nbr_click++;

                if (table_butn[1]==table_butn[ place_vrai_reponse]){
                    Scoor++;
                    if (Scoor ==12){
                        ganier_12_sur_12();

                    }
                    else {
                        textResulta3.setTextColor(getResources().getColor(vert));
                        textResulta3.setText(R.string.mss_vrai);
                    }


                    jouer();
                }
                else{
                    if (Scoor>0) Scoor--;
                    textResulta3.setTextColor(getResources().getColor(rouge));
                    textResulta3.setText(R.string.mssg_foux_1);
                }
                if (nbr_click >= 12){
                    fin_examen();



                }

            }



        });
        table_butn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    nbr_click++;
                if (table_butn[2]==table_butn[ place_vrai_reponse]){
                    Scoor++;
                    if (Scoor ==12){
                        ganier_12_sur_12();

                    }
                    else {
                        textResulta3.setTextColor(getResources().getColor(vert));
                        textResulta3.setText(R.string.mss_vrai);
                    }


                    jouer();
                }
                else{
                    if (Scoor>0) Scoor--;
                    textResulta3.setTextColor(getResources().getColor(rouge));
                    textResulta3.setText(R.string.mssg_foux_1);
                }
                if (nbr_click >= 12){
                    fin_examen();



                }

            }



        });
        btn_quiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fin_examen();
                startActivity(intent_math);
                finish();

            }
        });

    }
    public void ganier_12_sur_12(){textResulta3.setTextColor(getResources().getColor(vert));
        textResulta3.setText(R.string.ganer);
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
        textResulta3.setText("");
        nbr_click=0;
        Scoor=0;
    }

    public void jouer(){
        int image_random= new Random().nextInt(12);
        while (image_random==encien_image){
            image_random= new Random().nextInt(12);
        }
        encien_image=image_random;
        imagev.setImageResource(image[image_random]);

         place_vrai_reponse=new Random().nextInt(3);
        table_butn[place_vrai_reponse].setText(nome[image_random]);
        int reponse_faux1=new Random().nextInt(12);
        int reponse_faux2=0;
        int cpt=0;
        while (cpt<3){


            if (cpt!=place_vrai_reponse){
                while ( reponse_faux1 == image_random|| reponse_faux1==reponse_faux2 )
                {
                    reponse_faux1 = new Random().nextInt(2)+1;
                }

                table_butn[cpt].setText(nome[reponse_faux1]);
                reponse_faux2=reponse_faux1;




            }
            cpt++;
        }



    }
}
