package com.example.myapp6;

import android.annotation.SuppressLint;
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

public class math_number extends AppCompatActivity {
    ImageView image_view_nbr;
        TextView textResl;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,btn_sortir;
  int[] lst_image={R.drawable.nomber_0,R.drawable.nomber_1,R.drawable.nomber_2,R.drawable.number_3,R.drawable.nomber_4,
            R.drawable.nomber_5,R.drawable.nomber_6,R.drawable.nomber_7,R.drawable.nomber_8,R.drawable.number_9};

    int nbr_randome,Scoor,nbr_click;
    Intent intent_math;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         intent_math = new Intent(this, Math.class);
        setContentView(R.layout.activity_math_number);
        image_view_nbr=findViewById(R.id.image_view_nbr);
        textResl=findViewById(R.id.textResul3);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        btn_sortir=findViewById(R.id.btn_quiter);
        jouer();
        b0.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==0){
                    Scoor++;
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    if (Scoor==12){

                        ganier_12_sur_12();
                    }
                    else {

                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==1){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){

                        ganier_12_sur_12();

                    }
                    else {

                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==2){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                      ganier_12_sur_12();

                    }
                    else {
                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==3){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                       ganier_12_sur_12();

                    }
                    else {
                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==4){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                     ganier_12_sur_12();

                    }
                    else {

                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==5){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                       ganier_12_sur_12();

                    }
                    else {
                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;

                if (nbr_randome==6){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                        ganier_12_sur_12();

                    }
                    else {
                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==7){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                       ganier_12_sur_12();

                    }
                    else {
                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==8){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                      ganier_12_sur_12();

                    }
                    else {
                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (nbr_randome==9){
                    textResl.setTextColor(getResources().getColor(R.color.vert));
                    Scoor++;
                    if (Scoor==12){
                       ganier_12_sur_12();

                    }
                    else {

                        textResl.setText(R.string.mss_vrai);
                        jouer();
                    }

                }
                else{
                    textResl.setTextColor(getResources().getColor(R.color.rouge));
                    if (Scoor==0){
                        Scoor=0;
                    }
                    else {Scoor--;}
                    textResl.setText(R.string.mssg_foux_1);


                }
                if (nbr_click >= 12){
                    examen_terminer();
                }
            }
        });
        btn_sortir.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                examen_terminer();
                startActivity(intent_math);
                finish();
            }
        });



    }




    public void jouer(){
         nbr_randome= new Random().nextInt(10);
        image_view_nbr.setImageResource(lst_image[nbr_randome]);

    }
    public void examen_terminer(){
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
        textResl.setText("");
        Scoor=0;
        nbr_click=0;

    }
    public void ganier_12_sur_12(){textResl.setTextColor(getResources().getColor(vert));
        textResl.setText(R.string.ganer);
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

}
