package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView textResultado;
    private EditText editPeso, editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
    }

    public void calculaIMC(View view) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        Double resultado = peso / (altura * altura);
        if (resultado <= 19){
            textResultado.setText("Seu IMC é " +decimalFormat.format(resultado)+"." +" Abaixo do peso normal");
            editAltura.setText("");
            editPeso.setText("");
        }
        else if(resultado>19 && resultado < 25){
            textResultado.setText("Seu IMC é " +decimalFormat.format(resultado)+"." +" Seu peso esta normal");
            editAltura.setText("");
            editPeso.setText("");
        } 
        else if (resultado>=25 && resultado<=30) {
            textResultado.setText("Seu IMC é " +decimalFormat.format(resultado)+"." +" Você esta com exesso de peso");
            editAltura.setText("");
            editPeso.setText("");
        } else if (resultado>=30 && resultado<=35) {
            textResultado.setText("Seu IMC é " +decimalFormat.format(resultado)+"."+ " Você tem obesidade classe 1");
            editAltura.setText("");
            editPeso.setText("");
        } else if (resultado >=35 && resultado<40) {
            textResultado.setText("Seu IMC é " +decimalFormat.format(resultado)+"."+ " Você tem obesidade classe 2");
            editAltura.setText("");
            editPeso.setText("");
        }
        else {
            textResultado.setText("Seu IMC é " +decimalFormat.format(resultado)+"."+" Você tem obesidade classe 3");
            editAltura.setText("");
            editPeso.setText("");
        }

    }
}