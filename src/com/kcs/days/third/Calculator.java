package com.kcs.days.third;

/**
 * Created by andriusbaltrunas on 5/15/2018.
 */
public class Calculator {

    public double sum(double numb, double numb2) {
        return numb + numb2;
    }

    public double minus(double numb, double numb2) {
        return numb - numb2;
    }

    public double division(double numb, double numb2){
        return numb / numb2;
    }

    public double multiplication(double numb, double numb2){
        return numb * numb2;
    }

    public double pow(double numb, int degree){
        return Math.pow(numb, degree);
    }
}
