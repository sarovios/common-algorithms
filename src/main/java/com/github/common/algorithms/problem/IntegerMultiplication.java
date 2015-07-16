package com.github.common.algorithms.problem;

//TODO: implement karatsuba multiplication
public class IntegerMultiplication {

    private int result;

    public void recursive(int num1, int num2) {
        if ( (num2 == 0) || (num1 == 0) ) return;
        if (num2 < 0) {
            result -= num1;
            recursive(num1, num2 + 1);
        }
        if (num2 > 0) {
            result += num1;
            recursive(num1, num2 - 1);
        }
    }

    public int getResult() {
        return this.result;
    }

    public void clear() {
        this.result = 0;
    }

}
