package com.example.topic1;

public class CalculatorLogic {

    private float Number;

    float ValueNo2;
    boolean isAddition, isSubtraction, isMultiplication, isDivision;

    public float getNumber() {
        return Number;
    }

    public void setNumber(float number) {
        Number = number;
    }

    public void Addition(){
        float ValueNo1;

            ValueNo1 = Number;
            isAddition = true;
            Number = 0;
    }

    public void Subtraction(){

    }

}
