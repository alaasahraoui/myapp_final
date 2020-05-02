package com.example.myapp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URL;

public class coursesActivity extends AppCompatActivity {
public CardView c1;
    public CardView c2;
    public CardView c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openlink();

            }
        }
        );

        c2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {openlink();

                                  }
                              }
        );


        c3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {openlink();

                                  }
                              }
        );
    }


public void openlink(){
    Uri uri = Uri.parse("https://drive.google.com/open?id=1YNVV8kvmpKdlklF5HjpuiRLyhr1iAJ2G"); // missing 'http://' will cause crashed
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);


}







    public void start_quiz_list(View view){open_quiz_list();

    }


    public void open_quiz_list(){
//transition.setDuration(10000);
//transition.setInterpolator(new DecelerateInterpolator());
//getWindow().setExitTransition(transition);
        // ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle()

        Intent int1 = new Intent(this,Activity3.class);


        startActivity(int1);


    }






}
