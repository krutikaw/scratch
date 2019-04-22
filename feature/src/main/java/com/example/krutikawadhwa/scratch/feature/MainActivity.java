package com.example.krutikawadhwa.scratch.feature;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button button_hair;
    private Button button_skinTone;
    private Button button_outfit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_hair = (Button) findViewById(R.id.button_hair);
        button_hair.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openHair();
            }

        });

        button_outfit = (Button) findViewById(R.id.button_outfit);
        button_hair.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openOutfit();
            }

        });

        button_outfit = (Button) findViewById(R.id.button_outfit);
        button_outfit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openOutfit();
            }

        });
    }

    public void openHair(){
        Intent intent = new Intent(this, Hair.class);
        startActivity(intent);
    }

    public void openOutfit(){
        Intent intent = new Intent(this, Outfit.class);
        startActivity(intent);
    }

    public void openskinTone(){
        Intent intent = new Intent(this, skinTone.class);
        startActivity(intent);
    }
}
