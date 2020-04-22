package com.example.constaint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, btndivide, btnplus, btnminus, btnC, btnequal, btnmultiply;
    private TextView textinput, textoutput;
    float v1, v2;

    boolean plus, divide, multiple, minus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn_Zero);
        btn00 = (Button) findViewById(R.id.btn_DoubleZero);
        btn1 = (Button) findViewById(R.id.bnt_One);
        btn2 = (Button) findViewById(R.id.btn_Two);
        btn3 = (Button) findViewById(R.id.btn_Three);
        btn4 = (Button) findViewById(R.id.bnt_Four);
        btn5 = (Button) findViewById(R.id.btn_Five);
        btn6 = (Button) findViewById(R.id.btn_Six);
        btn7 = (Button) findViewById(R.id.btn_Seven);
        btn8 = (Button) findViewById(R.id.btn_Eight);
        btn9 = (Button) findViewById(R.id.btn_Nine);
        btnC = (Button) findViewById(R.id.btn_Clear);
        btndivide = (Button) findViewById(R.id.btn_Divide);
        btnmultiply = (Button) findViewById(R.id.btn_Multiply);
        btnplus = (Button) findViewById(R.id.btn_Plus);
        btnminus = (Button) findViewById(R.id.btn_Minus);
        btnequal = (Button) findViewById(R.id.btn_Equal);
        textinput = (TextView) findViewById(R.id.textView);
        textoutput = (TextView) findViewById(R.id.textView2);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText("");
                textoutput.setText("");
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "0");
            }
        });

       btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "00");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textinput.setText(textinput.getText() + "9");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(textinput.getText() + "");
                plus = true;
                textinput.setText(null);
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(textinput.getText() + "");
                divide = true;
                textinput.setText(null);
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(textinput.getText() + "");
                minus = true;
                textinput.setText(null);
            }
        });

       btnmultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(textinput.getText() + "");
                multiple = true;
                textinput.setText(null);
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (plus) {
                    v2 = Float.parseFloat(textinput.getText() + "");
                    float result = v1 + v2;
                    textoutput.setText(result + "");
                    textinput.setText("");
                    plus = false;
                }
                if (minus) {
                    v2 = Float.parseFloat(textinput.getText() + "");
                    float result = v1 - v2;
                    textoutput.setText(result + "");
                    textinput.setText("");
                    minus = false;

                }
                if (multiple) {
                    v2 = Float.parseFloat(textinput.getText() + "");
                    float result = v1 * v2;
                    textoutput.setText(result + "");
                    textinput.setText("");
                    multiple = false;

                }
                if (divide) {
                    v2 = Float.parseFloat(textinput.getText() + "");
                    float result = v1 / v2;
                    textoutput.setText(result + "");
                    textinput.setText("");
                    divide = false;
                }
            }

        });

    }
}
