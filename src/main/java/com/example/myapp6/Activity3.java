package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
public class Activity3 extends AppCompatActivity {

    private ImageView geo_img,butn_arabe,butn_math,heur;
    Intent intent_ara,intent_mat,intent_time;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        geo_img= findViewById(R.id.geo_img);
        intent_ara=new Intent(this,arabe.class);
        final Intent intent_mat= new Intent(this,Math.class);
        intent_time= new Intent(this,activity_time.class);


        butn_arabe=findViewById(R.id.butn_arabe);
        butn_math=findViewById(R.id.butn_math);
        heur=findViewById(R.id.heur);
        heur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_time);
                finish();

            }
        });


        butn_arabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(intent_ara);
            }
        });
        butn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent_mat);
                finish();

            }
        });
        geo_img.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           openQuizAct();
                                       }
                                   }

        );


    }


    public void start_quizAct(View view){openQuizAct();

    }


    public void openQuizAct(){
//transition.setDuration(10000);
//transition.setInterpolator(new DecelerateInterpolator());
//getWindow().setExitTransition(transition);
        // ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle()

        Intent int1 = new Intent(this,QuizActivity.class);


        startActivity(int1);


    }
   



    }



