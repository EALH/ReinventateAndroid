package com.example.reinvenate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button h, m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h = (Button) findViewById(R.id.Hombre);
        m = (Button) findViewById(R.id.Mujer);

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this, Oficios.class);
                startActivity(h);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this, Oficios.class);
                startActivity(m);
            }
        });
    }




}
