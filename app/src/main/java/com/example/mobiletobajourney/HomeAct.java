package com.example.mobiletobajourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomeAct extends AppCompatActivity {

    Button btn_wisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_wisata = findViewById(R.id.btn_wisata);
        btn_wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotowista = new Intent(HomeAct.this,TourAndTravelAct.class);
                startActivity(gotowista);
            }
        });

    }
}
