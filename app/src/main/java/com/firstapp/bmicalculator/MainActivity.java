package com.firstapp.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    TextView resulttext;
    String calculation, BMIresult;
Double bmi, value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resulttext = findViewById(R.id.result);

    }

    public void calculateBMI(View view) {
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        int weightvalue = Integer.parseInt(S1);
        Double heightvalue = Double.parseDouble(S2);

        Double bmi = weightvalue / (heightvalue * heightvalue);

        if(bmi <= 17){
            BMIresult = "Severely Under Weight";
        }else if(bmi <= 18.5){
            BMIresult = "Under Weight";
        }else if(bmi > 18.5 && bmi <= 24.9){
            BMIresult = "Normal weight";
        }else if(bmi >= 25 && bmi <= 29.9){
            BMIresult = " OverWeight";
        }else{
            BMIresult = " Obese";
        }
        calculation = "Result:\n\n" + bmi + "\n" + BMIresult;

        resulttext.setText(calculation);
    }
}