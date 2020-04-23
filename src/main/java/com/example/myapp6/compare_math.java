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

import static com.example.myapp6.R.color.vert;

public class compare_math extends AppCompatActivity {
    Button btn_inf,btn_egal,btn_sup,btn_quiter;
    TextView text1,text2,textResulta;
    String [] tbal ={"<",">","="};
    int Scoor=0;
    int nbr_click=0;
    int nbr1,nbr2;
    Intent intent_math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_math);
        intent_math = new Intent(this, Math.class);
        btn_egal=findViewById(R.id.btn_egal);
        btn_inf=findViewById(R.id.btn_inf);
        btn_sup=findViewById(R.id.btn_sup);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        textResulta=findViewById(R.id.textResul);
        btn_quiter=findViewById(R.id.btnSorte_compar);
        jouer();

        btn_quiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                examen_terminer();
                startActivity(intent_math);
                finish();
            }
        });
        btn_inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (Scoor==12){ganier_12_sur_12();}
                else {
                    if (nbr_click <= 12) {
                        if (Integer.valueOf(text1.getText().toString()) < Integer.valueOf(text2.getText().toString())) {
                            Scoor++;
                            textResulta.setTextColor(getResources().getColor(R.color.vert));
                            textResulta.setText(R.string.mss_vrai);
                            jouer();

                        } else {
                            textResulta.setTextColor(getResources().getColor(R.color.rouge));
                            if (Scoor > 0) {
                                Scoor--;
                                textResulta.setText(R.string.mssg_foux_1);

                            } else {
                                textResulta.setText(R.string.mssg_foux_1);
                            }
                        }


                    } else {
                        examen_terminer();
                        jouer();


                    }


                }}
        });
        btn_egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (Scoor==12){ganier_12_sur_12();}
                else{
                if (nbr_click<=12){
                    if (Integer.valueOf(text1.getText().toString())==Integer.valueOf(text2.getText().toString())){
                        Scoor++;
                        textResulta.setTextColor(getResources().getColor(R.color.vert));
                        textResulta.setText(R.string.mss_vrai);
                        jouer();

                    }else{
                        textResulta.setTextColor(getResources().getColor(R.color.rouge));
                        if (Scoor>0){
                            Scoor--;
                            textResulta.setText(R.string.mssg_foux_1);

                        }
                        else {textResulta.setText(R.string.mssg_foux_1);}
                    }


                }
                else{
                    examen_terminer();
                    jouer();


                }


            }}
        });
        btn_sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbr_click++;
                if (Scoor==12){ganier_12_sur_12();}
                else {

                if (nbr_click<=12){
                    if (Integer.valueOf(text1.getText().toString())>Integer.valueOf(text2.getText().toString())){
                        Scoor++;
                        textResulta.setTextColor(getResources().getColor(R.color.vert));
                        textResulta.setText(R.string.mss_vrai);
                        jouer();

                    }else{
                        textResulta.setTextColor(getResources().getColor(R.color.rouge));
                        if (Scoor>0){
                            Scoor--;
                            textResulta.setText(R.string.mssg_foux_1);

                        }
                        else {textResulta.setText(R.string.mssg_foux_1);}
                    }


                }
                else{
                    examen_terminer();
                    jouer();

                }


            }}
        });
    }
    public void jouer(){
        int nbrold1=nbr1;
        int nbrold2=nbr2;
        while(nbr1==nbrold1 && nbrold2==nbr2 ){
        nbr1= new Random().nextInt(10)+1;
        nbr2= new Random().nextInt(10)+1;}
        text1.setText(String.valueOf(nbr1));
        text2.setText(String.valueOf(nbr2));


    }
    public void ganier_12_sur_12(){textResulta.setTextColor(getResources().getColor(vert));
        textResulta.setText(R.string.ganer);
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
        textResulta.setText("");
        Scoor=0;
        nbr_click=0;

    }
}
