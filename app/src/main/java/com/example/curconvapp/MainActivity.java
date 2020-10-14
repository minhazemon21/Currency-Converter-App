package com.example.curconvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    RadioButton ru,rc,rb;
    TextView tvRESULT;
    Button btnCONVERTER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.eBDT);

        ru = (RadioButton)findViewById(R.id.rbUSD);
        rc = (RadioButton)findViewById(R.id.rbCAD);
        rb = (RadioButton)findViewById(R.id.rbBC);

        tvRESULT = (TextView)findViewById(R.id.tvRESULT);
        btnCONVERTER = (Button)findViewById(R.id.btnconvert);


    }
    public void convert_method(View v)
    {
        String s = e1.getText().toString();
        double result = Double.parseDouble(s);

        if(ru.isChecked())
        {
            result = result / 84.61;
            tvRESULT.setText(String.valueOf(result));
        }
        if(rc.isChecked())
        {
            result = result / 63.54;
            tvRESULT.setText(String.valueOf(result));
        }
        if(rb.isChecked())
    {
        result = result / 699641.22;
        tvRESULT.setText(String.valueOf(result));
    }
        else{
            Toast.makeText(getApplicationContext(),"select one option",Toast.LENGTH_SHORT).show();
        }

    }

}
