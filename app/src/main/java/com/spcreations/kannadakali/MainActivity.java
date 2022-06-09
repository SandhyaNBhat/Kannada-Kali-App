package com.spcreations.kannadakali;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Find the view that shows the categories defined on the app

        // TextView alphabets = (TextView)findViewById(R.id.alphabets);
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView flowers = (TextView)findViewById(R.id.flowers);
        TextView fruits = (TextView)findViewById(R.id.fruits);
        TextView days = (TextView)findViewById(R.id.Days);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        TextView conversations = (TextView)findViewById(R.id.conversations);

        //Set clicklistener on each of the views.

     /*   alphabets.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, AlphabetsActivity.class);
                startActivity(i);

            }

        });*/

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);

            }

        });


        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(i);

            }

        });

        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);

            }

        });

        flowers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, FlowersActivity.class);
                startActivity(i);

            }

        });

        fruits.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, FruitsActivity.class);
                startActivity(i);

            }

        });


        days.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, DaysActivity.class);
                startActivity(i);

            }

        });

        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);

            }

        });
       // Included for version 2 upgrade.
        conversations.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent i = new Intent(MainActivity.this, ConversationsActivity.class);
                startActivity(i);

            }

        });
    }

}

