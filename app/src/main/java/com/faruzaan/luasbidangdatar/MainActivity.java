package com.faruzaan.luasbidangdatar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button persegi,persegipanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = (Button)findViewById(R.id.persegi);
        persegipanjang = (Button)findViewById(R.id.persegipanjang);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Operasi.class);
                startActivity(i);
            }
        });

    }
}
