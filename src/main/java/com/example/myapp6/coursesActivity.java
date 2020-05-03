package com.example.myapp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URL;

public class coursesActivity extends AppCompatActivity {
public CardView c11;
    public CardView c22;
    public CardView c33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        c11=findViewById(R.id.c111);
        c22=findViewById(R.id.c22);
        c33=findViewById(R.id.c33);


        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openlink();

            }
        });

        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openlink();

            }
        });
        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openlink();

            }
        });


    }


public void openlink(){
    Uri uri = Uri.parse("https://drive.google.com/open?id=1bFyHobTpWRBQjzrOfy6GbXuvxDwzE-4Z"); // missing 'http://' will cause crashed
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
