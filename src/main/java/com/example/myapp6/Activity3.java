package com.example.myapp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
public class Activity3 extends AppCompatActivity {

    private ImageView geo_img,butn_arabe,butn_math,heur,anglais,francais;
    Intent intent_ara,intent_mat,intent_time,inten_anglais,intent_francais;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login2);
        geo_img= findViewById(R.id.geo_img);
        intent_ara=new Intent(this,arabe.class);
        final Intent intent_mat= new Intent(this,Math.class);
        intent_time= new Intent(this,activity_time.class);
        inten_anglais=new Intent(this,activity_anglais.class);
        intent_francais=new Intent(this,francais_activity.class);


        butn_arabe=findViewById(R.id.butn_arabe);
        butn_math=findViewById(R.id.butn_math);
        anglais=findViewById(R.id.anglias);
        francais=findViewById(R.id.francais);
        francais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_francais);
                finish();
            }
        });


        anglais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(inten_anglais);
                finish();
            }
        });
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

  public void   openCoursesAct(View View){      Intent int1 = new Intent(this,coursesActivity.class);


      startActivity(int1);


  };
    public void openQuizAct(){
//transition.setDuration(10000);
//transition.setInterpolator(new DecelerateInterpolator());
//getWindow().setExitTransition(transition);
        // ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle()

        Intent int1 = new Intent(this,QuizActivity.class);


        startActivity(int1);


    }
   



    }



