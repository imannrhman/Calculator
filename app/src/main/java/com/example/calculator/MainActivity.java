package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0
        ,buttonTambah,buttonKurang,buttonKali,buttonBagi,buttonSamaDengan,buttonKoma;
    TextView tvAngka;
    ArrayList<Double> tempAngka = new ArrayList<>();
    ArrayList<String> tempOperasi = new ArrayList<>();
    ArrayList<Integer> tempOperator = new ArrayList<>();
    Boolean jadiDouble = false;
    Boolean sudah= false;
    Boolean janganTuker =false;
    String angka = "";
    String angka1 = "" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn_satu);button1.setOnClickListener(this);
         button2 = (Button) findViewById(R.id.btn_dua);button2.setOnClickListener(this);
         button3 = (Button) findViewById(R.id.btn_tiga);button3.setOnClickListener(this);
         button4 = (Button) findViewById(R.id.btn_empat);button4.setOnClickListener(this);
         button5 = (Button) findViewById(R.id.btn_lima);button5.setOnClickListener(this);
         button6 = (Button) findViewById(R.id.btn_enam);button6.setOnClickListener(this);
         button7 = (Button) findViewById(R.id.btn_tujuh);button7.setOnClickListener(this);
         button8 = (Button) findViewById(R.id.btn_delapan);button8.setOnClickListener(this);
         button9 = (Button) findViewById(R.id.btn_sembilan);button9.setOnClickListener(this);
         button0 = (Button) findViewById(R.id.btn_nol);button0.setOnClickListener(this);
         buttonTambah = (Button) findViewById(R.id.btn_tambah);buttonTambah.setOnClickListener(this);
         buttonKurang = (Button) findViewById(R.id.btn_kurang);buttonKurang.setOnClickListener(this);
         buttonKali = (Button) findViewById(R.id.btn_kali);buttonKali.setOnClickListener(this);
         buttonBagi = (Button) findViewById(R.id.btn_bagi);buttonBagi.setOnClickListener(this);
        buttonSamaDengan = (Button)findViewById(R.id.btn_samadengan); buttonSamaDengan.setOnClickListener(this);
         buttonKoma = (Button) findViewById(R.id.btn_koma);buttonKoma.setOnClickListener(this);


        Button clear = (Button)findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAngka = (TextView)findViewById(R.id.tv_angka);
                tvAngka.setText("0");
                angka = "";
                tempOperator.clear();
                angka1 = "";
                jadiDouble = false;
                tempAngka.clear();
                tempOperasi.clear();
            }
        });


    }

    @Override
    public void onClick(View view) {
        tvAngka = (TextView)findViewById(R.id.tv_angka);
        switch (view.getId()){
            case R.id.btn_satu:
                tvAngka.setText( angka + button1.getText().toString()  );
                angka = angka + button1.getText().toString();
                angka1 = angka1 + button1.getText().toString();
                sudah = false;
                break;
            case R.id.btn_dua:
                tvAngka.setText(angka + button2.getText().toString() );
                angka = angka + button2.getText().toString();
                angka1 = angka1 + button2.getText().toString();
                sudah = false;
                break;
            case R.id.btn_tiga:
                tvAngka.setText(angka + button3.getText().toString() );
                angka = angka + button3.getText().toString();
                angka1 = angka1 + button3.getText().toString();
                sudah = false;
                break;
            case R.id.btn_empat:
                tvAngka.setText(angka + button4.getText().toString());
                angka = angka + button4.getText().toString();
                angka1 = angka1 + button4.getText().toString();
                sudah = false;
                break;
            case R.id.btn_lima:
                tvAngka.setText(angka + button5.getText().toString());
                angka = angka + button5.getText().toString();
                angka1 = angka1 + button5.getText().toString();
                sudah = false;
                break;
            case R.id.btn_enam:
                tvAngka.setText(angka + button6.getText().toString());
                angka = angka + button6.getText().toString();
                angka1 = angka1 + button6.getText().toString();
                sudah = false;
                break;
            case R.id.btn_tujuh:
                tvAngka.setText(angka + button7.getText().toString());
                angka = angka + button7.getText().toString();
                angka1 = angka1 + button7.getText().toString();
                sudah = false;
                break;
            case R.id.btn_delapan:
                tvAngka.setText(angka + button8.getText().toString());
                angka = angka + button8.getText().toString();
                angka1 = angka1 + button8.getText().toString();
                sudah = false;
                break;
            case R.id.btn_sembilan:
                tvAngka.setText( angka + button9.getText().toString());
                angka = angka + button9.getText().toString();
                angka1 = angka1 + button9.getText().toString();
                sudah = false;
                break;
            case R.id.btn_nol:
                if(angka1.equals("0")){
                    angka = angka;
                }
                else{
                tvAngka.setText(angka+ button0.getText().toString());
                angka = angka + button0.getText().toString();
                angka1 = angka1 + button0.getText().toString();
                sudah = false;}
                break;
            case R.id.btn_tambah:
                if(angka.isEmpty() || angka1.isEmpty()||sudah ){
                    angka = angka + "";
                    angka1 ="0";
                }else{
                tvAngka.setText(angka + buttonTambah.getText().toString());
                angka = angka + buttonTambah.getText().toString();
                tempAngka.add(Double.parseDouble(angka1));
                angka1 = "";
                sudah =true;
                tempOperasi.add("+");
                tempOperator.add(1);
                }
                break;
            case R.id.btn_kurang:
                if( angka1.isEmpty()||sudah){
                    angka = angka + "";
                    angka1 ="0";
                }
                else{
                tvAngka.setText(angka + buttonKurang.getText().toString());
                angka = angka + buttonKurang.getText().toString();
                sudah =true;
                tempAngka.add(Double.parseDouble(angka1));
                tempOperasi.add("-");
                tempOperator.add(1);
                angka1 = "";}

                break;
            case R.id.btn_bagi:
                if(angka.isEmpty() || angka1.isEmpty()||sudah){
                    angka = angka + "";
                    angka1 ="1";
                }else {
                    tvAngka.setText(angka + buttonBagi.getText().toString());
                    angka = angka + buttonBagi.getText().toString();
                    tempAngka.add(Double.parseDouble(angka1));
                    sudah =true;
                    tempOperasi.add("/");
                    angka1 = "";
                    tempOperator.add(2);
                }
                break;
            case R.id.btn_kali:
                if(angka.isEmpty() || angka1.isEmpty()||sudah){
                    angka = angka + "";
                    angka1 ="1";
                    }else {
                    tvAngka.setText(angka + buttonKali.getText().toString());
                    angka = angka + buttonKali.getText().toString();
                    tempAngka.add(Double.parseDouble(angka1));
                    sudah =true;
                    angka1 = "";
                    tempOperasi.add("*");
                    tempOperator.add(2);
                }
                break;
            case R.id.btn_samadengan:
                String hasilnya = tvAngka.getText().toString();
                angka1 = validasiAngka(tempOperasi.get(tempOperasi.size()-1),angka1);
                if(tempOperasi.size()>0){
                    tempAngka.add(Double.parseDouble(angka1));
                    hasil();
                    if(jadiDouble){
                    angka1 = validasiAngka(tempOperasi.get(tempOperasi.size()-1),angka1);
                    tempAngka.add(Double.parseDouble(angka1));
                    Double hasil = hasil();
                    jadiDouble = false;
                    hasilnya = String.valueOf(hasil);
                }else{
                    angka1 = validasiAngka(tempOperasi.get(tempOperasi.size()-1),angka1);
                   int hasil = hasil().intValue();
                    hasilnya = String.valueOf(hasil);


                    }}
                tvAngka.setText(hasilnya);
                tempAngka.clear();
                tempOperasi.clear();
                tempOperator.clear();
                angka= "";
                angka1="";
                break;
            case R.id.btn_koma:
                if(angka.isEmpty() || angka1.isEmpty()||sudah){
                angka = angka + "";
                }else{
                tvAngka.setText(angka + buttonKoma.getText().toString());
                angka = angka + buttonKoma.getText().toString();
                angka1 = angka1 + buttonKoma.getText().toString();
                jadiDouble =true;
                sudah=true;
                break;}
        }

    }

    private String validasiAngka(String operasi, String angka1) {

        if (angka1.equals("")){
            if(operasi.equals("+")){
                angka1 = "0";
            }else if(operasi.equals("-")){
                angka1 = "0";
            }else if(operasi.equals("*")){
                angka1 = "1";
            }
            else if(operasi.equals("/")){
                angka1 = "1";
            }
        }
        return angka1;

    }

    private void bubbleSort(){
        String temp = "";
        int temp1 ;
        double temp2 = 0.0;
        double temp3 = 0.0;
        for(int i = 0 ; i < tempOperasi.size();i++){
            for (int j = i + 1; j < tempOperasi.size(); j++) {
                if (tempOperator.get(i) < tempOperator.get(j)) {
                   if(janganTuker){
                       temp2 = tempAngka.get(j).doubleValue();
                       tempAngka.set(j, tempAngka.get(j+1));
                       tempAngka.set(j+1,temp2);

                   }else{
                       temp2 = tempAngka.get(i).doubleValue();
                       tempAngka.set(i, tempAngka.get(j));
                       tempAngka.set(j,temp2);
                       temp2 = tempAngka.get(j).doubleValue();
                       tempAngka.set(i+1, tempAngka.get(j + 1));
                       tempAngka.set(j + 1, temp2);

                   }

                    temp1 = tempOperator.get(i);
                    tempOperator.set(i, tempOperator.get(j));
                    tempOperator.set(j, temp1);

                    temp = tempOperasi.get(i);
                    tempOperasi.set(i, tempOperasi.get(j));
                    tempOperasi.set(j, temp);

                    janganTuker =true;
                }
            }
        }
        janganTuker = false;
    }

    private Double hasil(){
        Double hasil = Double.parseDouble(tempAngka.get(0).toString());
        double temp3 = 0.0;
        int simpan= 0;


        bubbleSort();

        Log.d("cekangka",tempAngka.get(1).toString());
        for (int j = 0 ; j < tempOperasi.size();j++){
               int tambah = 1;
                if (tempOperasi.size() == tempAngka.size()){
                    tambah = 0;
                }

                if (tempOperasi.get(j).equals("+")){
                       hasil = hasil +tempAngka.get(j+tambah).doubleValue();

                }
                 else if(tempOperasi.get(j).equals("-")){
                    hasil = hasil - tempAngka.get(j+tambah).doubleValue();
                }
                else if (tempOperasi.get(j).equals("/")){
                    hasil = hasil / tempAngka.get(j+tambah).doubleValue();
                       Boolean cek = hasil.doubleValue() > hasil.intValue();



                    if (cek){
                        jadiDouble = true;
                    }

                }
                else if(tempOperasi.get(j).equals("*")){
                    hasil = hasil * tempAngka.get(j+tambah).doubleValue();
                   }
            }

        return hasil;
    }
}
