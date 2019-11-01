package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView =  findViewById(R.id.textView);

    }
    public void submit(View view) {
        float ratingValue = ratingBar.getRating();


        if (ratingValue < 2) {
            textView.setText("Rating: " + ratingValue + "\nwe will try better next time");
        } else if (ratingValue <2.5 && ratingValue > 2) {
            textView.setText("Rating: " + ratingValue + "\nwe constantly making it better");

        }else if (ratingValue == 2.5) {
            textView.setText("Rating: " + ratingValue + "\nshut the fuck up bitch");

        }else if(ratingValue <=4 && ratingValue >3){
            textView.setText("Rating: "+ ratingValue+"\n thank you");
        }else{
            textView.setText("Rating: "+ratingValue+"\nthank you for your compliment");
        }
    }
}
