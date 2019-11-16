package com.example.topic1;

public class Calc {

    boolean isAdd, isSub, isDiv, isMul;

    public boolean isAdd() {
        return isAdd;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }

    public boolean isSub() {
        return isSub;
    }

    public void setSub(boolean sub) {
        isSub = sub;
    }

    public boolean isDiv() {
        return isDiv;
    }

    public void setDiv(boolean div) {
        isDiv = div;
    }

    public boolean isMul() {
        return isMul;
    }

    public void setMul(boolean mul) {
        isMul = mul;
    }

    public float Calculate(Float Number1, Float Number2){

        if (isAdd == true){
            return Number1 + Number2;
        }
        else if (isSub == true){
            return Number1 - Number2;
        }
        else if (isDiv == true){
            return Number1/Number2;
        }
        else if (isMul == true){
            return Number1 * Number2;
        }
        else
        {
            return Number2;
        }
    }
}
