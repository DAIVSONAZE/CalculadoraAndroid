package com.example.marilane.primeiroandroid;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;


public class MainActivity extends AppCompatActivity {

    EditText ednumeroUm, ednumeroDois;
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ednumeroUm = (EditText) findViewById(R.id.ednumero1);
        ednumeroDois = (EditText) findViewById(R.id.ednumero2);

        /*botao soma*/
        button1 = (Button) findViewById(R.id.buttonSoma);

        /*botao subtracao*/
        button2 = (Button) findViewById(R.id.buttonSubtracao);

        /*botao multiplicacao*/
        button3 = (Button) findViewById(R.id.buttonMultiplicacao);


        /*botao divisao*/
        button4 = (Button) findViewById(R.id.buttonDivisao);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*adição*/
                double num1 = Double.parseDouble(ednumeroUm.getText().toString());
                double num2 = Double.parseDouble(ednumeroDois.getText().toString());

                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                /*adição*/
                dialogo.setTitle("Resultado Soma");
                dialogo.setMessage("A soma e " + soma);
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sub1 = Double.parseDouble(ednumeroUm.getText().toString());
                double sub2 = Double.parseDouble(ednumeroDois.getText().toString());

                double subtracao = sub1 - sub2;

                AlertDialog.Builder dialogoSub = new AlertDialog.Builder(MainActivity.this);

                dialogoSub.setTitle("Resultado Subtração");
                dialogoSub.setMessage("A subtração e " + subtracao);
                dialogoSub.setNeutralButton("ok", null);
                dialogoSub.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double mult1 = Double.parseDouble(ednumeroUm.getText().toString());
                double mult2 = Double.parseDouble(ednumeroDois.getText().toString());

                double multiplicacao = mult1 * mult2;

                AlertDialog.Builder dialogoMult = new AlertDialog.Builder(MainActivity.this);

                dialogoMult.setTitle("Resultado Multiplicação");
                dialogoMult.setMessage("A multplicação e " + multiplicacao);
                dialogoMult.setNeutralButton("ok", null);
                dialogoMult.show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double div1 = Double.parseDouble(ednumeroUm.getText().toString());
                double div2 = Double.parseDouble(ednumeroDois.getText().toString());

                double divisao = div1 / div2;

                AlertDialog.Builder dialogoDiv = new AlertDialog.Builder(MainActivity.this);

                dialogoDiv.setTitle("Resultado Divisão");
                dialogoDiv.setMessage("A divisão e " + divisao);
                dialogoDiv.setNeutralButton("ok", null);
                dialogoDiv.show();
            }
        });
        }
    }

