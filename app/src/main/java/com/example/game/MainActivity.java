package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int a =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button button = findViewById(R.id.A);
       final ImageView image = findViewById(R.id.imageView);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(a==0) {
                   image.setVisibility(View.VISIBLE);
                   button.setText("A is here");
                   a=1;
               }
               else
               {
                   image.setVisibility(View.INVISIBLE);
                   button.setText(" Show A");
                   a=0;
               }

           }
       });

    }
}