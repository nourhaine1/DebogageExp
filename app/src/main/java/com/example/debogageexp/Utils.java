package com.example.debogageexp;

public class Utils {
    public static double Calcul(Double a1,Double a2,char op){
        Double res=null;
        switch(op){
            case '+':
                res=a1+a2;
                break;
            case '-':
                res=a1-a2;
                break;
            case '*':
                res=a1*a2;
                break;
            case '/':
                res=a1/a2;
                break;
        }
        return res;

    }
}
