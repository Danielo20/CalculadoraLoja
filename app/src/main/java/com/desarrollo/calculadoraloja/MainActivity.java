package com.desarrollo.calculadoraloja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button suma, resta, divi, multi;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);

        suma = (Button) findViewById(R.id.btn_suma);
        resta = (Button) findViewById(R.id.btn_resta);
        divi = (Button) findViewById(R.id.btn_division);
        multi = (Button) findViewById(R.id.btn_multi);

        resultado = findViewById(R.id.txt_resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);

        int rta=0;

        switch (v.getId()){
            case R.id.btn_suma:
                rta=entero1+entero2;
                break;
            case R.id.btn_resta:
                rta=entero1-entero2;
                break;
            case  R.id.btn_multi:
                rta=entero1*entero2;
                break;
            case R.id.btn_division:
                rta=entero1/entero2;
                break;
        }

        resultado.setText(""+rta);
    }
}
