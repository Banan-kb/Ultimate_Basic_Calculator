package com.example.a20191010calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inT1;
    EditText inT2;
    TextView ouText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inT1=(EditText)findViewById(R.id.inText1);
        inT2=(EditText)findViewById(R.id.inText2);
        ouText=(TextView)findViewById(R.id.outText);

        Button PlusBttn  = (Button) findViewById(R.id.bttnPlus);
        PlusBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String inS1 = inT1.getText().toString();
                String inS2 = inT2.getText().toString();

                if(inS1.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));

                }else if(inS2.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));
                }else {

                    double d1 = Double.parseDouble(inS1);
                    double d2 = Double.parseDouble(inS2);
                    String s = Double.toString(d1 + d2);
                    ouText.setTextColor(Color.parseColor("#000000"));
                    ouText.setText(s);
                }
            }
        });

        Button MinusBttn  = (Button) findViewById(R.id.bttnMin);
        MinusBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String inS1 = inT1.getText().toString();
                String inS2 = inT2.getText().toString();

                if(inS1.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));

                }else if(inS2.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));
                }else {
                    double d1 = Double.parseDouble(inS1);
                    double d2 = Double.parseDouble(inS2);
                    String s = Double.toString(d1 - d2);
                    ouText.setTextColor(Color.parseColor("#000000"));
                    ouText.setText(s);
                }
            }
        });

        Button MultBttn  = (Button) findViewById(R.id.bttnMul);
        MultBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String inS1 = inT1.getText().toString();
                String inS2 = inT2.getText().toString();

                if(inS1.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));

                }else if(inS2.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));
                }else {
                    double d1 = Double.parseDouble(inS1);
                    double d2 = Double.parseDouble(inS2);
                    String s = Double.toString(d1 * d2);
                    ouText.setTextColor(Color.parseColor("#000000"));
                    ouText.setText(s);
                }
            }
        });

        Button DivBttn  = (Button) findViewById(R.id.bttnDiv);
        DivBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String inS1 = inT1.getText().toString();
                String inS2 = inT2.getText().toString();

                if(inS1.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));

                }else if(inS2.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));
                }
                else {
                    double d1 = Double.parseDouble(inS1);
                    double d2 = Double.parseDouble(inS2);

                    if(d2 !=0.0){
                        String s = Double.toString(d1 / d2);
                        ouText.setTextColor(Color.parseColor("#000000"));
                        ouText.setText(s);
                    }else{
                        ouText.setText("Cannot divide by zero");
                        ouText.setTextColor(Color.parseColor("#FF0000"));
                    }

                }
            }
        });

        Button SqrtButton  = (Button) findViewById(R.id.bttnSqrt);
        SqrtButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String inS1 = inT1.getText().toString();

                if(inS1.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));

                }
                else {
                    double d1 = Double.parseDouble(inS1);

                    String s = Double.toString(Math.sqrt(d1));
                    ouText.setTextColor(Color.parseColor("#000000"));

                    ouText.setText(s);
                }
            }
        });

        Button PowButton  = (Button) findViewById(R.id.bttnPow);
        PowButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String inS1 = inT1.getText().toString();

                if(inS1.isEmpty()){
                    ouText.setText("Please enter a number");
                    ouText.setTextColor(Color.parseColor("#FF0000"));

                }
                else {
                    double d1 = Double.parseDouble(inS1);

                    String s = Double.toString(d1*d1);
                    ouText.setTextColor(Color.parseColor("#000000"));

                    ouText.setText(s);
                }
            }
        });
    }
}
