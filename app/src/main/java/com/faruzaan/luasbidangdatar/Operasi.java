package com.faruzaan.luasbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operasi extends AppCompatActivity {

    private EditText edtpanjang, edtlebar;
    private Button btnhitung;
    private TextView txthasil,judul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operasi);

        edtpanjang = (EditText) findViewById(R.id.edt_panjang);
        edtlebar = (EditText) findViewById(R.id.edt_lebar);
        btnhitung = (Button) findViewById(R.id.btn_hitung);
        txthasil = (TextView) findViewById(R.id.txt_hasil);
        judul = (TextView) findViewById(R.id.judul);

        judul.setText("Mencari Luas Persegi Panjang");

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang,lebar;
                panjang = edtpanjang.getText().toString();
                lebar = edtlebar.getText().toString();
                if (TextUtils.isEmpty(panjang)) {
                    edtpanjang.setError("Tidak Boleh Kosong!!!");
                    edtpanjang.requestFocus();
                } else if (TextUtils.isEmpty(lebar)) {
                    edtlebar.setError("Tidak Boleh Kosong!!!");
                    edtlebar.requestFocus();
                } else {
                    // Masukan Rumus untuk menghitung Panjang dan juga lebar nya
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hasil = p * l;
                    // Kemudian Hasil di tampilkan di TextView
                    txthasil.setText("Hasil Luas  : " + hasil);
                }
            }
        });
    }
}
