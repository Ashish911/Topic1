package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btnAdd, btnSub, btnDivision,
            btnMultiply, btnDot, btnEqual, btnC;
    EditText etNumber;

    float ValueNo1, ValueNo2;

    boolean isAddition, isSubtract, isMultiplication, isDivision;

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
        btnDivision = findViewById(R.id.btnModulos);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        etNumber = findViewById(R.id.etFirst);
        btnC = findViewById(R.id.btnC);

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

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText(etNumber.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNumber == null) {
                    etNumber.setText("");
                } else {
                    ValueNo1 = Float.parseFloat(etNumber.getText() + "");
                    isAddition = true;
                    etNumber.setText(null);
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueNo1 = Float.parseFloat(etNumber.getText() + "");
                isSubtract = true;
                etNumber.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueNo1 = Float.parseFloat(etNumber.getText() + "");
                isMultiplication = true;
                etNumber.setText(null);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueNo1 = Float.parseFloat(etNumber.getText() + "");
                isDivision = true;
                etNumber.setText(null);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueNo2 = Float.parseFloat(etNumber.getText() + "");

                if (isAddition == true) {
                    Calc calc = new Calc();
                    calc.setAdd(isAddition);
                    Float result = calc.Calculate(ValueNo1,ValueNo2);
                    etNumber.setText(Float.toString(result));
                    isAddition = false;
                }

                if (isSubtract == true) {
                    Calc calc = new Calc();
                    calc.setSub(isSubtract);
                    Float result = calc.Calculate(ValueNo1,ValueNo2);
                    etNumber.setText(Float.toString(result));
                    isSubtract = false;
                }

                if (isMultiplication == true) {
                    Calc calc = new Calc();
                    calc.setMul(isMultiplication);
                    Float result = calc.Calculate(ValueNo1,ValueNo2);
                    etNumber.setText(Float.toString(result));
                    isMultiplication = false;
                }

                if (isDivision == true) {
                    Calc calc = new Calc();
                    calc.setDiv(isDivision);
                    Float result = calc.Calculate(ValueNo1,ValueNo2);
                    etNumber.setText(Float.toString(result));
                    isDivision = false;
                }
            }
        });



    }
}
