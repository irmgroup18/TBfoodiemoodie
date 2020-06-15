package com.example.tugbes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rekomendasi extends AppCompatActivity {

    Button button20, button17, button18, button19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi);

        button20 = (Button) findViewById(R.id.button20);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);

        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (rekomendasi.this, pembayaran.class);
                startActivity(i);

            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (rekomendasi.this, pembayaran.class);
                startActivity(i);

            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (rekomendasi.this, pembayaran.class);
                startActivity(i);

            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (rekomendasi.this, pembayaran.class);
                startActivity(i);

            }
        });
    }
}
