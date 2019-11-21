package com.example.segundoparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText valor1, valor2;
    private RadioButton suma, resta, multiplicacion, divicion;
    private TextView resultado;
    int [] b = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText)findViewById(R.id.v1);
        valor2 = (EditText)findViewById(R.id.v2);

        suma = (RadioButton)findViewById(R.id.su);
        resta = (RadioButton)findViewById(R.id.res);
        multiplicacion = (RadioButton)findViewById(R.id.mul);
        divicion = (RadioButton)findViewById(R.id.div);

        resultado = (TextView)findViewById(R.id.txtResultado);
    }

    public int[] validacion()
    {
        int [] a = new int[3];
        String s1 = valor1.getText().toString();
        String s2 = valor2.getText().toString();

        if ( (s1.equals("")) || (s2.equals("")) )
        {
            mensaje("INGRESE LOS 2 VALORES");
            a[0] = 1;
            return a;
        }
        else
        {
            a[0] = 0;
            a[1] = Integer.parseInt(s1);
            a[2] = Integer.parseInt(s2);
            return a;
        }
    }

    public void mensaje (String m)
    {
        resultado.setText(m);
    }

    public void operacionSuma(View v)
    {
        b = validacion();
        if(b[0] == 0)
        {
            int r = b[1] + b[2];
            mensaje("EL RESULTADO ES: " + String.valueOf(r));
        }
    }

    public void operacionResta(View v)
    {
        b = validacion();
        if(b[0] == 0)
        {
            int r = b[1] - b[2];
            mensaje("EL RESULTADO ES: " + String.valueOf(r));
        }
    }

    public void operacionMultiplicacion(View v)
    {
        b = validacion();
        if(b[0] == 0)
        {
            int r = b[1] * b[2];
            mensaje("EL RESULTADO ES: " + String.valueOf(r));
        }
    }

    public void operacionDivision(View v)
    {
        b = validacion();
        if(b[0] == 0)
        {
            float v1 = b[1], v2 = b[2];
            float r = v1 / v2;
            mensaje("EL RESULTADO ES: " + Float.toString(r));
        }
    }
}

