package com.example.debogageexp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn;
EditText ed1,ed2;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.edone);
        ed2=findViewById(R.id.edTwo);
        res=findViewById(R.id.res);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul(ed1.getText().toString(),ed2.getText().toString());
                res.setText(String.valueOf(res));
                //res.setText(String.valueOf(res+"ABDC"));
                //hatytou ena bch yekhou 26.0 w code yerajaali res=26.0 donc cv ama ena taw neheb nelas9olou chaine

            }
        });
    }
    /**
     * Perform the sum of two strings passed in paramters
     * @param s1
     * @param s2
     * @return sum of s1 and s2 after being parsed to Double
     */
    public Double calcul(String s1,String s2){
        Double n1=Double.valueOf(s1);
        Log.i("varvalue","the value is"+n1);
        Double n2=Double.valueOf(s2);
        Log.i("varvalue","the value is"+n2);

        Double res=n1+n2;
        Log.i("varvalue","the value is"+res);


        if(res>100){
            Log.w("varvalue","res Value is more than 100");
        }
        if(res>10000){
            Log.wtf("VarValue","res is more than 1000000");
        }
        return res;
    }
}