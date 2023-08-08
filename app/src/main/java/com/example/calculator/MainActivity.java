package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private LinearLayout zero,one,twe,tre,fore,five,six,seven,eight,niue,point,equal,plus,mines,multip,divide,percent,plusminusvariant,ac;
    private TextView textView;
    private double num1 = 0.0 ;
    private double num2 = 0.0 ;
    private double num3 = 0.0 ;
    private boolean p = false ;
    private boolean m = false ;
    private boolean mu = false ;
    private boolean d = false ;
    private boolean pr = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);

        zero=findViewById(R.id.linear_zero);
        one=findViewById(R.id.linear_one);
        twe=findViewById(R.id.linear_twe);
        tre=findViewById(R.id.linear_tre);
        fore=findViewById(R.id.linear_for);
        five=findViewById(R.id.linear_five);
        six=findViewById(R.id.linear_sixs);
        seven=findViewById(R.id.linear_seven);
        eight=findViewById(R.id.linear_eighet);
        niue=findViewById(R.id.linear_nien);
        point=findViewById(R.id.linear_point);
        equal=findViewById(R.id.linear_equal);
        plus=findViewById(R.id.linear_plus);
        divide=findViewById(R.id.linear_divide);
        multip=findViewById(R.id.linear_multipliction);
        percent=findViewById(R.id.linear_persent);
        mines=findViewById(R.id.linear_mines);
        plusminusvariant=findViewById(R.id.linear_mp);
        ac=findViewById(R.id.linear_ac);

        textView.setText("0");

        p = false ;
        m = false ;
        mu = false ;
        d = false ;
        pr = false ;


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                String text = textView.getText().toString().trim();
                char t = text.charAt(0);

                if (t=='0'){

                    if (text.length()>1){

                    char t1 = text.charAt(1);

                        if (t1=='.'){
                            textView.setText(textView.getText().toString()+0);
                        }
                }else {
                    textView.setText(String.valueOf(0));
                }
                }else{
                    textView.setText(textView.getText().toString()+0);
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(1));


            }
        });

        twe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(2));

            }
        });

        tre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(3));

            }
        });

        fore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(4));

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(5));

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(6));

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(7));

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(8));

            }
        });

        niue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                print(String.valueOf(9));

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                if (!textView.getText().toString().contains(".")){
                    textView.setText(textView.getText().toString()+".");
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));

                if (p){

                    num2 = Double.parseDouble(textView.getText().toString());
                    num3=num1+num2;

                } else if (m) {

                    num2 = Double.parseDouble(textView.getText().toString());
                    num3=num1-num2;

                }else if (mu) {

                    num2 = Double.parseDouble(textView.getText().toString());
                    num3=num1*num2;

                }else if (d) {

                    num2 = Double.parseDouble(textView.getText().toString());
                    num3=num1/num2;

                }else if (pr) {

                    num2 = Double.parseDouble(textView.getText().toString());
                    num3=num1/num2;

                }else{

                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

                }



                DecimalFormat df = new DecimalFormat("#########.##########");
                textView.setText(String.valueOf(df.format(num3)));

            }
        });



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                p = true ;
                m = false ;
                mu = false ;
                d = false ;
                pr = false ;
                num1 = Double.parseDouble(textView.getText().toString());
                textView.setText("0");

            }
        });

        mines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                m = true ;
                p = false ;
                mu = false ;
                d = false ;
                pr = false ;
                num1 = Double.parseDouble(textView.getText().toString());
                textView.setText("0");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                d = true ;
                p = false ;
                m = false ;
                mu = false ;
                pr = false ;
                num1 = Double.parseDouble(textView.getText().toString());
                textView.setText("0");

            }
        });

        multip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                mu = true ;
                p = false ;
                m = false ;
                d = false ;
                pr = false ;
                num1 = Double.parseDouble(textView.getText().toString());
                textView.setText("0");

            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                pr = true ;
                p = false ;
                m = false ;
                mu = false ;
                d = false ;
                num1 = Double.parseDouble(textView.getText().toString());
                textView.setText("0");

            }
        });

        plusminusvariant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                double positiveDouble = Double.parseDouble(textView.getText().toString());
                double negativeDouble = -positiveDouble;

                DecimalFormat df = new DecimalFormat("#########.##########");
                textView.setText(String.valueOf(df.format(negativeDouble)));

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_clik));


                textView.setText("0");
                num1 = 0.0 ;
                num2 = 0.0 ;
                num3 = 0.0 ;

            }
        });

    }



    public void print(String n){

        String text = textView.getText().toString().trim();
        char t = text.charAt(0);
        if (t=='0'){
            if (text.length()>1){
                char t1 = text.charAt(1);
                if (t1=='.'){
                    textView.setText(textView.getText().toString()+n);
                }
            }else {
                textView.setText(String.valueOf(n));
            }
        }else{
            textView.setText(textView.getText().toString()+n);
        }

        }






























}