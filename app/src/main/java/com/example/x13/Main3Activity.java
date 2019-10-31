package com.example.x13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shashank.sony.fancytoastlib.FancyToast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        final TextView inT1 = (TextView) findViewById(R.id.inpout1);
        final TextView inT2 = (TextView) findViewById(R.id.inpout2);
        final TextView outText1 = (TextView) findViewById(R.id.textView1);

        Button buttonPlus = (Button) findViewById(R.id.button2);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (inT1.getText().toString().isEmpty() || inT2.getText().toString().isEmpty()) {

                    FancyToast.makeText(Main3Activity.this,"Insert number :)",
                            FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();

                }
                else {
                    String inS1 = inT1.getText().toString();
                    String inS2 = inT2.getText().toString();

                    double t1 = Double.valueOf(inS1);
                    Log.d("MyAndroid","onClick else t1");
                    double t2 = Double.valueOf(inS2);
                    Log.d("MyAndroid","onClick else t2");

                    double res = t1 + t2;
                    Log.d("MyAndroid","onClick else res");

                    String resStr = String.valueOf(res);
                    outText1.setText(resStr);

                    FancyToast.makeText(Main3Activity.this,"Done! :)",
                            FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                }
            }
        });
        Button buttonMinus = (Button) findViewById(R.id.button4);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (inT1.getText().toString().isEmpty() || inT2.getText().toString().isEmpty()) {

                    FancyToast.makeText(Main3Activity.this,"Insert number :)",
                            FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
                }
                else {
                    String inQ1 = inT1.getText().toString();
                    String inQ2 = inT2.getText().toString();

                    double r1 = Double.valueOf(inQ1);
                    double r2 = Double.valueOf(inQ2);

                    double res2 = r1 - r2;

                    String resStr = String.valueOf(res2);
                    outText1.setText(resStr);

                    FancyToast.makeText(Main3Activity.this,"Done! :)",
                            FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
                }

            }
        });
        Button buttonMulte = (Button) findViewById(R.id.button3);
        buttonMulte.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (inT1.getText().toString().isEmpty() || inT2.getText().toString().isEmpty()) {

                    FancyToast.makeText(Main3Activity.this,"Insert number :)",
                            FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
                }
                else {
                    String inW1 = inT1.getText().toString();
                    String inW2 = inT2.getText().toString();

                    double y1 = Double.valueOf(inW1);
                    double y2 = Double.valueOf(inW2);

                    double res3 = y1 * y2;

                    String resStr = String.valueOf(res3);
                    outText1.setText(resStr);

                    FancyToast.makeText(Main3Activity.this,"Done! :)",
                            FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
                }

            }
        });
        Button buttonDivision = (Button) findViewById(R.id.button);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (inT1.getText().toString().isEmpty() || inT2.getText().toString().isEmpty()) {

                    FancyToast.makeText(Main3Activity.this,"Insert number :)",
                            FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
                }
                else {
                    String inA1 = inT1.getText().toString();
                    String inA2 = inT2.getText().toString();

                    double c1 = Double.valueOf(inA1);
                    double c2 = Double.valueOf(inA2);

                    double res4 = c1 / c2;

                    String resStr = String.valueOf(res4);
                    outText1.setText(resStr);

                    FancyToast.makeText(Main3Activity.this,"Done! :)",
                            FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                }

            }
        });


    }
}
