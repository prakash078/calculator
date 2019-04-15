package com.example.calculatetax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView showresult;
    Button button;
    Float aFloat, aFloat1;
    Model model=new Model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input =findViewById(R.id.salary);
        showresult =findViewById(R.id.result);
        button =findViewById(R.id.calculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                model.setSalary(input.getText().toString());
                aFloat =Float.parseFloat(input.getText().toString());
                aFloat = aFloat *12;
                if(aFloat <=200000)
                {
                    aFloat1 =(aFloat)/100;
                    showresult.setText("Your tax amount is Rs." + aFloat1.toString());
                }
                else if(aFloat >200000 && aFloat <=350000)
                {
                    aFloat = aFloat -200000;
                    aFloat1 =2000+((aFloat *15)/100);
                    showresult.setText("Your tax amount is Rs." + aFloat1.toString());
                }
                else if(aFloat >350000)
                {
                    aFloat = aFloat -350000;
                    aFloat1 =24500+((aFloat *25)/100);
                    showresult.setText("Your tax amount is Rs." + aFloat1.toString());
                }

            }
        });


    }
}
