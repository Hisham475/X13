package com.example.x13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"Chronometer",
                        FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                Intent intent1 = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent1);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"Catclutetor",
                        FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                Intent intent2 = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent2);



            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"Soon",
                        FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();


            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"Soon",
                        FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();


            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"Soon",
                        FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();


            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"Soon",
                        FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();


            }
        });

    }
}
