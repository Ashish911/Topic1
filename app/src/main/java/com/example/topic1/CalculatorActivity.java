package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btnAdd, btnSub, btnModulos,
            btnMultiply, btndot, btnEqual;
    EditText etNumber;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = findViewById(R.id.btnZero);
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);
        btn4 = findViewById(R.id.btnFour);
        btn5 = findViewById(R.id.btnFive);
        btn6 = findViewById(R.id.btnSix);
        btn7 = findViewById(R.id.btnSeven);
        btn8 = findViewById(R.id.btnEight);
        btn9 = findViewById(R.id.btnNine);
        btnAdd = findViewById(R.id.btnPlus);
        btnSub = findViewById(R.id.btnSubtract);
        btnModulos = findViewById(R.id.btnModulos);
        btnMultiply = findViewById(R.id.btnMultiply);
        btndot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        etNumber = findViewById(R.id.etFirst);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText()+ "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + "0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(etNumber.getText())){
                    etNumber.setError("Enter a Number");
                    return;
                }

                float N;
                N = Float.parseFloat(etNumber.getText().toString());

                CalculatorLogic calculatorLogic = new CalculatorLogic();
                calculatorLogic.setNumber(N);
                calculatorLogic.Addition();
                calculatorLogic.getNumber();

                String S = String.valueOf(N);
                etNumber.setText(S);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String N;
//                N = etNumber.getText().toString();
//
//                CalculatorLogic calculatorLogic = new CalculatorLogic();
//                calculatorLogic.setNumber(N);

                mValueOne = Float.parseFloat(etNumber.getText() + "");
                mSubtract = true;
                etNumber.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String N;
//                N = etNumber.getText().toString();
//
//                CalculatorLogic calculatorLogic = new CalculatorLogic();
//                calculatorLogic.setNumber(N);

                mValueOne = Float.parseFloat(etNumber.getText() + "");
                crunchifyMultiplication = true;
                etNumber.setText(null);
            }
        });

        btnModulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String N;
//                N = etNumber.getText().toString();
//
//                CalculatorLogic calculatorLogic = new CalculatorLogic();
//                calculatorLogic.setNumber(N);

                mValueOne = Float.parseFloat(etNumber.getText() + "");
                crunchifyDivision = true;
                etNumber.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mValueTwo = Float.parseFloat(etNumber.getText() + "");
//
//                if (crunchifyAddition == true) {
//                    etNumber.setText(mValueOne + mValueTwo + "");
//                    crunchifyAddition = false;
//                }
//
//                if (mSubtract == true) {
//                    etNumber.setText(mValueOne - mValueTwo + "");
//                    mSubtract = false;
//                }
//
//                if (crunchifyMultiplication == true) {
//                    etNumber.setText(mValueOne * mValueTwo + "");
//                    crunchifyMultiplication = false;
//                }
//
//                if (crunchifyDivision == true) {
//                    etNumber.setText(mValueOne / mValueTwo + "");
//                    crunchifyDivision = false;
//                }
            }
        });



    }
}
