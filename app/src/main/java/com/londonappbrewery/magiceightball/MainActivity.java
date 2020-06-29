package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
        ask = (Button) findViewById(R.id.button_ask);

        final ImageView Choice = (ImageView)findViewById(R.id.imageView);
        final int decision[] = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};


        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random choice = new Random();
                int rand = choice.nextInt(5);
                Log.d("magiceightball", "Choice is" +rand);

                Choice.setImageResource(decision[rand]);
            }
        });
    }
}
