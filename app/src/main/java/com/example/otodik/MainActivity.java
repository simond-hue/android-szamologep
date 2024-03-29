package com.example.otodik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public TextView eredmeny;
    public TextView eredmenyText;
    public LinearLayout elso_sor;
    public LinearLayout masodik_sor;
    public LinearLayout harmadik_sor;
    public LinearLayout negyedik_sor;
    public LinearLayout otodik_sor;
    public Button egy;
    public Button ketto;
    public Button harom;
    public Button negy;
    public Button ot;
    public Button hat;
    public Button het;
    public Button nyolc;
    public Button kilenc;
    public Button clear;
    public Button nulla;
    public Button egyenlo;
    public Button plusz;
    public Button minusz;
    public Button szorzas;
    public String input = "";
    public boolean plus = false;
    public boolean minus = false;
    public boolean times = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        egy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="1";
                eredmenyText.setText(input);
            }
        });
        ketto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="2";
                eredmenyText.setText(input);
            }
        });
        harom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="3";
                eredmenyText.setText(input);
            }
        });
        negy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="4";
                eredmenyText.setText(input);
            }
        });
        ot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="5";
                eredmenyText.setText(input);
            }
        });
        hat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="6";
                eredmenyText.setText(input);
            }
        });
        het.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="7";
                eredmenyText.setText(input);
            }
        });
        nyolc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="8";
                eredmenyText.setText(input);
            }
        });
        kilenc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="9";
                eredmenyText.setText(input);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input="";
                eredmenyText.setText(input);
            }
        });
        nulla.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="0";
                eredmenyText.setText(input);
            }
        });
        egyenlo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(plus){
                    int elso_szam = Integer.parseInt(input.split("+")[0]);
                    int masodik_szam = Integer.parseInt(input.split("+")[1]);

                    int eredmeny = elso_szam+masodik_szam;
                    eredmenyText.setText(eredmeny);
                }
                if(minus){
                    int elso_szam = Integer.parseInt(input.split("-")[0]);
                    int masodik_szam = Integer.parseInt(input.split("-")[1]);

                    int eredmeny = elso_szam-masodik_szam;
                    eredmenyText.setText(eredmeny);
                }
                if(minus){
                    int elso_szam = Integer.parseInt(input.split("*")[0]);
                    int masodik_szam = Integer.parseInt(input.split("*")[1]);

                    int eredmeny = elso_szam*masodik_szam;
                    eredmenyText.setText(eredmeny);
                }
                input = "";
                plus = false;
                minus = false;
                times = false;
            }
        });
        plusz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="+";
                eredmenyText.setText(input);
                minusz.setEnabled(false);
                szorzas.setEnabled(false);
                plus = true;
            }
        });
        minusz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="-";
                eredmenyText.setText(input);
                plusz.setEnabled(false);
                szorzas.setEnabled(false);
                minus = true;
            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input+="*";
                eredmenyText.setText(input);
                minusz.setEnabled(false);
                plusz.setEnabled(false);
                times = true;
            }
        });



    }

    public void init(){
        eredmeny = (TextView) findViewById(R.id.eredmeny);
        eredmenyText = (TextView) findViewById(R.id.eredmenyText);
        elso_sor = (LinearLayout) findViewById(R.id.elso_sor);
        masodik_sor = (LinearLayout) findViewById(R.id.masodik_sor);
        harmadik_sor = (LinearLayout) findViewById(R.id.harmadik_sor);
        negyedik_sor = (LinearLayout) findViewById(R.id.negyedik_sor);
        otodik_sor = (LinearLayout) findViewById(R.id.otodik_sor);
        egy = (Button) findViewById(R.id.egy);
        ketto = (Button) findViewById(R.id.ketto);
        harom = (Button) findViewById(R.id.harom);
        negy = (Button) findViewById(R.id.negy);
        ot = (Button) findViewById(R.id.ot);
        hat = (Button) findViewById(R.id.hat);
        het = (Button) findViewById(R.id.het);
        nyolc = (Button) findViewById(R.id.nyolc);
        kilenc = (Button) findViewById(R.id.kilenc);
        clear = (Button) findViewById(R.id.clear);
        nulla = (Button) findViewById(R.id.nulla);
        egyenlo = (Button) findViewById(R.id.egyenlo);
        plusz = (Button) findViewById(R.id.plusz);
        minusz = (Button) findViewById(R.id.minusz);
        szorzas = (Button) findViewById(R.id.szorzas);
    }
}
