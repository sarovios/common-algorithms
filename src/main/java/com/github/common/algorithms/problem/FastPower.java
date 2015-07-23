package com.github.common.algorithms.problem;

public class FastPower {

    public int compute(int a, int b) {
        if (b == 1) return a;
        int c = a*a;
        int ans = compute(c, (int) Math.floor( (double)b/2));
        if (b % 2 != 0) return a*ans;
        else return ans;
    }
}
